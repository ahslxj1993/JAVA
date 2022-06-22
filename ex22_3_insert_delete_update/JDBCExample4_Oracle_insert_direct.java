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
					+ " values('A1000','��� �ڵ���',100,'LG')";
			
			System.out.println(sql);
			
			int rowNum = stmt.executeUpdate(sql);
			System.out.println(rowNum+"���� �߰��Ǿ����ϴ�");
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�" + cnfe.getMessage());
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
					conn.close(); // 4�ܰ� : DB������ ���´�
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
