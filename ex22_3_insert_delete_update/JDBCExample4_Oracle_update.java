package ex22_3_insert_delete_update;

import java.sql.*;

public class JDBCExample4_Oracle_update {
	public static void main(String [] args) {
		if (args.length !=2) {
			System.out.println("��ǰ�ڵ�, �����縦 �Է��ϼ���");
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
			
			String del_sql = "update goodsinfo"
					+ " set maker = "+single+args[1]+single
					+ " where code = "+single+args[0]+single;
			
			System.out.println(del_sql+"\n");
			
			int rowNum = stmt.executeUpdate(del_sql);
			System.out.println(rowNum+"���� �����Ǿ����ϴ�");
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
