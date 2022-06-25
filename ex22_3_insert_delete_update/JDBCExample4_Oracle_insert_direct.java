package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample4_Oracle_insert_direct {
	public static void main(String [] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			stmt = conn.createStatement();
			
			String sql = "insert into goodsinfo"
					+ " values('A1000','고급 핸드폰',100,'LG')";
			
			System.out.println(sql);
			
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
