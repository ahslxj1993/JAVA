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
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�" + cnfe.getMessage());
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
			while (rs.next()) {// ���̻� ���� �����Ͱ� ���������� �ݺ�
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
			System.out.println("getBoardList() ���� : " + ex);
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
					conn.close(); // 4�ܰ� : DB������ ���´�
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
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));// ��й�ȣ Ȯ�ν� ���˴ϴ�
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
			System.out.println("getDetail() ���� : " + ex);
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
					conn.close(); // 4�ܰ� : DB������ ���´�
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
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�" + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		return result;
	}

	public int boardReply(Board board) {
		int result = 0;

		/*
		 * �亯�� �� ���� �� �׷� ��ȣ�Դϴ�. �亯�� �ްԵǸ� �亯���� �� ��ȣ�� ���� ���ñ� ��ȣ�� ���� ó���Ǹ鼭 ���� �׷쿡 ���ϰ� �˴ϴ�.
		 * �� ��Ͽ��� �����ٴ� �ϳ��� �׷����� ������ ��µ˴ϴ�.
		 */
		int re_ref = board.getBOARD_RE_REF();

		/*
		 * ����� ���̸� �ǹ��մϴ� ������ ���� ����� ��µɶ� �ѹ� �鿩���� ó���� �ǰ� ��ۿ� ���� ����� �鿩���Ⱑ �ι� �� �ø��ǰ� �մϴ�
		 * ������ ��쿡�� �� ���� 0�̰� ������ ����� 1, ����� ����� 2���˴ϴ�
		 */
		int re_lev = board.getBOARD_RE_LEV();

		// ���� ���ñ� �߿��� �ش���� ��µǴ� �����Դϴ�.
		int re_seq = board.getBOARD_RE_SEQ();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, "board", "1234");

			// Ʈ�������� �̿��ϱ� ���ؼ� setAutiCommit�� false�� �����մϴ�.
			conn.setAutoCommit(false);

			// BOARD_RE_REF, BOARD_RE_SEQ���� Ȯ���Ͽ� �����鿡 �ٸ� ����� ������
			// �ٸ� ��۵��� BOARD_RE_SEQ���� 1�� ������ŵ�ϴ�.
			// ���� ���� �ٸ� ��ۺ��� �տ� ��µǰ� �ϱ� ���ؼ� �Դϴ�.

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
			pstmt.setString(5, "");// �亯���� ������ ���ε� ���� �ʽ��ϴ�
			pstmt.setInt(6, re_ref);
			pstmt.setInt(7, re_lev);
			pstmt.setInt(8, re_seq);
			pstmt.setInt(9, 0);// readcount ��ȸ���� 0

			result = pstmt.executeUpdate();

			conn.commit();// commit�մϴ�.

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardReply()���� : " + ex);
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
					conn.close(); // 4�ܰ� : DB������ ���´�
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return result;
	}

	public int boardDelete(Board board) {
		int result = 0;
		/*
		 * ������ ����
		 * 1. ������ �۰� ���� BOARD_RE_REF���� ���´�.
		 * 2. ������ �۰� ���ų� ���� BOARD_RE_LEV ���� ���´�.
		 * 3. ������ �۰� ���ų� ���� BOARD_RE_SEQ ���� ���´�.
		 * 	��, BOARD_RE_SEQ ������ ������ �۰�
		 * 		BOARD_RE_REF, BOARD_RE_LEV ���� ���� ������ ���� BOARD_RE_SEQ���� ū �͵���
		 * 		���� ���� ������ 1�� �� ���� ���´�.
		 * 		���� �������� ������ BOARD_RE_REF �� �� ���� ū BOARD_RE_SEQ ���� ���´�.
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

			//���� ������ ������ �ο찹���� ��ȯ�ʴϴ�.
			result = pstmt.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("boardDelete() ���� : " + ex);
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
