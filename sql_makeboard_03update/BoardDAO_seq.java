package sql_makeboard_03update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO_seq {
	PreparedStatement pstmt = null;
	Connection conn = null;
	String query = "";
	ResultSet rs = null;

	public int boardInsert(Board board) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");

			query = "insert into board " + "(BOARD_NUM,BOARD_NAME, BOARD_PASS,BOARD_SUBJECT, "
					+ "BOARD_CONTENT, BOARD_RE_REF, " + "BOARD_RE_LEV,BOARD_RE_SEQ, BOARD_READCOUNT, " + "BOARD_DATE) "
					+ "values(board_seq.nextval,?,?,?, " + "?, board_seq.nextval, " + "?,?,?, " + "sysdate)";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());

			pstmt.setInt(5, 0);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);

			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

		return result;

	}

	public List<Board> getBoardList(int page, int limit) {
		List<Board> list = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");

			query = "select *" + "from (select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT,"
					+ " BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV,"
					+ " BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE" + " FROM (SELECT * FROM BOARD"
					+ "		ORDER BY BOARD_RE_REF DESC, " + "		BOARD_RE_SEQ ASC)" + " WHERE ROWNUM <=?)"
					+ " WHERE RNUM>=? AND RNUM <=?";

			int startrow = (page - 1) * limit + 1;
			int endrow = startrow + limit - 1;

			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endrow);
			pstmt.setInt(2, startrow);
			pstmt.setInt(3, endrow);

			rs = pstmt.executeQuery();

			int i = 0;
			while (rs.next()) {// 더이상 읽을 데이터가 없을때까지 반복
				if (i++ == 0) {
					list = new ArrayList<Board>();
				}

				Board board = new Board();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));

				list.add(board);
			}
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("getBoardList() 에러 : "+ex);
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
					conn.close(); // 4단계 : DB연결을 끊는다
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	public Board getDetail(int num) {
		Board board = new Board();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");
			
			pstmt = conn.prepareStatement("select * from board where BOARD_NUM = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));//비밀번호 확인시 사용됩니다
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				//board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("getDetail() 에러 : "+ex);
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
					conn.close(); // 4단계 : DB연결을 끊는다
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return board;
	}

	public int boardModify(Board modifyboard) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");

			query = "update board "
					+ "set BOARD_SUBJECT = ? ,  "
					+ " BOARD_CONTENT = ? "
					+ "where  BOARD_NUM = ?";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
			pstmt.setString(2, modifyboard.getBOARD_CONTENT());
			pstmt.setInt(3, modifyboard.getBOARD_NUM());
			
			result = pstmt.executeUpdate();
		}catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		return result;
	}
}
