package sql_makeboard_01insert;

import java.sql.*;

public class BoardDAO_seq {

	public int boardInsert(Board board) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		String query ="";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			conn = DriverManager.getConnection(url,"board","1234");
			
			query = "insert into board "
					+ "(BOARD_NUM,BOARD_NAME, BOARD_PASS,BOARD_SUBJECT, "
					+ "BOARD_CONTENT, BOARD_RE_REF, "
					+ "BOARD_RE_LEV,BOARD_RE_SEQ, BOARD_READCOUNT, "
					+ "BOARD_DATE) "
					+ "values(board_seq.nextval,?,?,?, "
					+ "?, board_seq.nextval, "
					+ "?,?,?, "
					+ "sysdate)";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			
			pstmt.setInt(5, 0);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			result = pstmt.executeUpdate();
		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		
		return result;
		
	}

}
