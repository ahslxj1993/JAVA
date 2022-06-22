package Homework_PreparedStatement;
import java.sql.*;
import java.util.*;
public class Main2 {
	public static void main (String []args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		
		
		String query = 
        		"select code, name, price, maker " 
              + "from   goodsinfo "
              + "where  name= ?";
		
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,search);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				
				System.out.printf("%-7s\t%-10s\t%d\t%-5s\n",
						code,name,price,maker);
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
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
