package sql_makeboard_04reply;

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
			System.out.println("getBoardList() 에러 : " + ex);
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

			if (rs.next()) {
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));// 비밀번호 확인시 사용됩니다
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				// board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getString("BOARD_DATE"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("getDetail() 에러 : " + ex);
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

			query = "update board " + "set BOARD_SUBJECT = ? ,  " + " BOARD_CONTENT = ? " + "where  BOARD_NUM = ?";

			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, modifyboard.getBOARD_SUBJECT());
			pstmt.setString(2, modifyboard.getBOARD_CONTENT());
			pstmt.setInt(3, modifyboard.getBOARD_NUM());

			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을수 없습니다" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		return result;
	}

	public int boardReply(Board board) {
		int result = 0;

		/*
		 * 답변을 할 원문 글 그룹 번호입니다. 답변을 달게되면 답변글은 이 번호와 같은 관련글 번호를 갖게 처리되면서 같은 그룹에 속하게 됩니다.
		 * 글 목록에서 보여줄대 하나의 그룹으로 묶여서 출력됩니다.
		 */
		int re_ref = board.getBOARD_RE_REF();

		/*
		 * 답글의 깊이를 의미합니다 원문에 대한 답글이 출력될때 한번 들여쓰기 처리가 되고 답글에 대한 답글은 들여쓰기가 두번 ㅊ ㅓ리되게 합니다
		 * 원문인 경우에는 이 값이 0이고 원문의 답글은 1, 답글의 답글은 2가됩니다
		 */
		int re_lev = board.getBOARD_RE_LEV();

		// 같은 관련글 중에서 해당글이 출력되는 순서입니다.
		int re_seq = board.getBOARD_RE_SEQ();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");

			// 트랜젝션을 이용하기 위해서 setAutiCommit을 false로 설정합니다.
			conn.setAutoCommit(false);

			// BOARD_RE_REF, BOARD_RE_SEQ값을 확인하여 원문들에 다른 답글이 있으면
			// 다른 답글들의 BOARD_RE_SEQ값을 1씩 증가시킵니다.
			// 현재 글을 다른 답글보다 앞에 출력되게 하기 위해서 입니다.

			query = "update board " + "set		BOARD_RE_SEQ = BOARD_RE_SEQ +1 " + "where	BOARD_RE_REF = ? "
					+ "and		BOARD_RE_SEQ > ?";

			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);

			pstmt.executeUpdate();
			pstmt.close();

			re_seq = re_seq + 1;
			re_lev = re_lev + 1;

			query = "insert into board " + "(BOARD_NUM, BOARD_NAME, BOARD_PASS, BOARD_SUBJECT, "
					+ "BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF, " + "BOARD_RE_LEV, BOARD_RE_SEQ, "
					+ "BOARD_READCOUNT, BOARD_DATE) " + "values (board_seq.nextval,?,?,?,?,?,?,?,?,?,sysdate)";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, board.getBOARD_NAME());
			pstmt.setString(2, board.getBOARD_PASS());
			pstmt.setString(3, board.getBOARD_SUBJECT());
			pstmt.setString(4, board.getBOARD_CONTENT());
			pstmt.setString(5, "");// 답변에는 파일을 업로드 하지 않습니다
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			pstmt.setInt(9, 0);// readcount 조회수는 0

			result = pstmt.executeUpdate();

			conn.commit();// commit합니다.

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardReply()에러 : " + ex);
			try {
				if (conn != null)
					conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
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
					conn.close(); // 4단계 : DB연결을 끊는다
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return result;
	}

	public int boardDelete(Board board) {
		int result = 0;
		/*
		 * 삭제의 조건
		 * 1. 선택한 글과 같은 BOARD_RE_REF값을 갖는다.
		 * 2. 선택한 글과 같거나 높은 BOARD_RE_LEV 값을 갖는다.
		 * 3. 선택한 글과 같거나 높은 BOARD_RE_SEQ 값을 갖는다.
		 * 	단, BOARD_RE_SEQ 범위는 선택한 글과
		 * 		BOARD_RE_REF, BOARD_RE_LEV 값이 같고 선택한 글의 BOARD_RE_SEQ보다 큰 것들중
		 * 		가장 작은 값에서 1을 뺀 값을 갖는다.
		 * 		만약 존재하지 않으면 BOARD_RE_REF 값 중 가장 큰 BOARD_RE_SEQ 값을 갖는다.
		 */

		String board_delete_sql = 
				"delete from board  " 
		        + "			 where  BOARD_RE_REF = ?"
				+ "			 and    BOARD_RE_LEV >=?" 
		        + "			 and    BOARD_RE_SEQ >=?"
				+ "			 and    BOARD_RE_SEQ <=("
				+ "			                      nvl((SELECT min(board_re_seq )-1"
				+ "			                           FROM   BOARD  "
				+ "			                           WHERE  BOARD_RE_REF=? "
				+ "			                           AND    BOARD_RE_LEV=?"
				+ "			                           AND    BOARD_RE_SEQ>?) , "
				+ "			                           (SELECT max(board_re_seq) "
				+ "			                            FROM   BOARD  "
				+ "			                            WHERE  BOARD_RE_REF=? ))"
				+ "				                   )";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");

			pstmt = conn.prepareStatement(board_delete_sql);

			pstmt.setInt(1, board.getBOARD_RE_REF());
			pstmt.setInt(2, board.getBOARD_RE_LEV());
			pstmt.setInt(3, board.getBOARD_RE_SEQ());
			pstmt.setInt(4, board.getBOARD_RE_REF());
			pstmt.setInt(5, board.getBOARD_RE_LEV());
			pstmt.setInt(6, board.getBOARD_RE_SEQ());
			pstmt.setInt(7, board.getBOARD_RE_REF());

			//쿼리 실행후 삭제된 로우갯수가 반환됨니다.
			result = pstmt.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardDelete() 에러 : " + ex);
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
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
}
