package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample4_Oracle_insert_input_single2 {
	public static void main(String [] args) {
		//"A2000" "모니터" 200 "삼성"
		if (args.length !=4) {
			System.out.println("상품코드 상품명 가격 제조사를 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			String single = "'";
			
			String sql = "insert into goodsinfo"
					+ " (code, name, price, maker)"
					+ " values"
					+ " ("+single + args[0]+single+","
					+		single+args[1]+single+","
					+				args[2]+		","
					+ 		single+args[3]+single+")";
			
			System.out.println(sql+"\n");
			
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum+"행이 추가되었습니다");
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
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
		}
	}
}
