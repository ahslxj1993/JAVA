package Homework_PreparedStatement;
import java.sql.*;
import java.util.*;
public class Main6 {
	public static void main (String []args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		
		String query = "update goodsinfo "
				+ "set maker =? "
				+ "where code = ?";
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,args[0]);
			pstmt.setString(2,args[1]);
			
			pstmt.executeUpdate();
			
			System.out.println("Updated");
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}
}
