package Homework_PreparedStatement;
import java.sql.*;
public class Main4 {
	public static void main (String []args) {
		if (args.length != 4) {
			System.out.println("상품코드 상품명 가격 제조사를 아규먼트에 넣어주세요");
			return;
		}
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "insert into goodsinfo "
				+ "values (?,?,?,?)";
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,args[0]);
			pstmt.setString(2,args[1]);
			pstmt.setString(3,args[2]);
			pstmt.setString(4,args[3]);
			int rowNum = pstmt.executeUpdate();
			
			pstmt.executeUpdate();
			
			System.out.println(rowNum+"inserted");
			
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
	}
}
