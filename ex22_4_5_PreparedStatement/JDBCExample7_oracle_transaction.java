package ex22_4_5_PreparedStatement;
import java.sql.*;
public class JDBCExample7_oracle_transaction {
	public static void main (String [] args) {
		//transaction : 논리적인 작업 단위
		//insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로
		//묶어서 쿼리 실행시 모든 작업이 정상 처리 된 경우에는 commit을 실행해서
		//db에 반영하고 쿼리 실행중 하나라도 정상처리 되지 않는 경우
		//rollback 을 실행해서 작업단위내의 모든 작업을 취소한다.
		
		//SQL문 작성하기
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into goodsinfo ");
		sql1.append("values(?,?,?,?)");
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("update goodsinfo ");
		sql2.append("set price = ? ");
		sql2.append("where code = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		//////transaction 시작///////
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			//autoCommit기능 비활성화
			conn.setAutoCommit(false);
			
			//----1번작업 시작----//
			//Prepared Statement 객체 얻기
			pstmt = conn.prepareStatement(sql1.toString());
			//쿼리의 ? 에 들어갈 실제값 지정하기
			pstmt.setString(1,"10006");
			pstmt.setString(2,"공기청정기");
			pstmt.setInt(3,500000);
			pstmt.setString(4, "코웨이");
			int result1 = pstmt.executeUpdate();
			pstmt.close();
			//----1번작업 종료----//
			
			//----2번작업 시작----//
			//Prepared Statement 객체 얻기
			pstmt = conn.prepareStatement(sql2.toString());
			
			//쿼리의 ? 에 들어갈 실제값 지정하기
			pstmt.setInt(1, 12345);
			pstmt.setString(2, "10001");
			int result2 = pstmt.executeUpdate();
			//----2번작업 종료----//
			
			//쿼리가 정상적으로 실행된 경우 db에 반영
			if (result1 ==1 && result2 ==1) {
				conn.commit();
				System.out.println("db에 반영되었습니다");
			}
			else {
				conn.rollback();
				System.out.println("db 반영이 취소됨");
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다"+cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			try {
				conn.rollback();
				System.out.println("db 반영이 취소됨");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
