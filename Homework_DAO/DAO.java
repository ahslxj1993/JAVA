package Homework_DAO;
import java.sql.*;
import java.util.*;
public class DAO {
	public ArrayList<Map<String,Object>> selectAll(){
		ArrayList<Map<String, Object>> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			stmt = conn.createStatement();
			

			String select_sql = "select * from emp";

			rs = stmt.executeQuery(select_sql);


			int i = 0;
			while (rs.next()) {// 더이상 읽을 데이터가 없을때까지 반복
				if(i++ ==0) {
					list = new ArrayList<Map<String, Object>>();
				}
				Map <String,Object> st = new HashMap<String, Object> ();
				st.put("empno", rs.getInt(1));
				st.put("ename", rs.getString(2));
				st.put("job", rs.getString(3));
				st.put("mgr", rs.getInt(4));
				st.put("hiredate", rs.getDate(5));
				st.put("sal", rs.getInt(6));
				st.put("comm", rs.getInt(7));
				st.put("deptno", rs.getInt(8));
				
				list.add(st);
				
			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//finally
		return list;
	}
}
