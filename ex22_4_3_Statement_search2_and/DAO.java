package ex22_4_3_Statement_search2_and;
import java.sql.*;
import java.util.*;
public class DAO {
	public ArrayList<Emp> search(String[] searchs){
		ArrayList<Emp> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from emp ";
		String field[] = {"empno", "ename", "job", "mgr", "hiredate" ,"sal", "comm","deptno"};
		
		for (int i =0 ; i<searchs.length ; i++) {
			if(searchs[i] != null) {
				String single ="";
				if(i==1 || i==2 || i==4)
					single = "'";
				
			if(sql.contains("where"))
				sql += " and ";
			else
				sql += " where ";
				
				sql += field[i]+"="+ single + searchs[i] + single;
			}
		}
		
		System.out.println(sql.toString());
		
		
		try {
			// 1단계 : JDBC 드라이버를 로드한다
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2단계 : DB에 접속한다
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");


			stmt = conn.createStatement();

			
			
			rs = stmt.executeQuery(sql);
			

			int i = 0;
			while (rs.next()) {// 더이상 읽을 데이터가 없을때까지 반복
				if(i++ ==0) {
					list = new ArrayList<Emp>();
				}
				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));
				st.setEname(rs.getString(2));
				st.setJob(rs.getString(3));
				st.setMgr(rs.getInt(4));
				st.setHiredate(rs.getDate(5));
				st.setSal(rs.getInt(6));
				st.setComm(rs.getInt(7));
				st.setDeptno(rs.getInt(8));
				
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
