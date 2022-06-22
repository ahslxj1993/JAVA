//PreparedStatement
/*
 * 1.PreparedStatement �� �� ��� Statement �Դϴ�.
 * 
 * 2.SQL ������ ������ ���ؼ��� �������� �ʿ��ѵ� PreparedStatement�� ������ �������� �մϴ�.
 * ��) pstmt = conn.preparedStatement(sql);
 * 
 * 3.PreparedStatement�� SQL ������ �̸� ������ �Ǳ� ������ ���ǹ��� �ٲ��� �ʰ�
 * ���ǰ��� �ٲ�� ���, ������ �����͸� �ٲ�� ��� � ����ϸ� �����ϴ�.
 * ��, �ѹ� �̸� �������� �� ���θ� ���� ������ ���ؼ� �������� ���� �ʰ� ���� �����ؼ� �����մϴ�.
 * Statement�� ���� ������� �ص� �Ź� ������ ������ ��Ĩ�ϴ�.,
 * ���� ���� ������ �����ϴ��� PreparedStatement�� Statement���� ����ӵ��� �����ϴ�.
 * 
 * ��) insert into teset(no, ename) values(1, 'ȫ�浿');
 * ��) insert into teset(no, ename) values(2, 'ȫ�浿');
 * ��) insert into teset(no, ename) values(3, 'ȫ�浿');
 * 
 * 4. 3���� �����ϱ� ���ؼ� ������ ������ ���� �����մϴ�.
 * �ٲ�� ���� ���ؼ� ?(��ġȦ��-placeholder, �Է¸Ű�����)�� ǥ���մϴ�.
 * ��) insert into teset(no,ename) values(?,?);
 * 
 * 5.?�� ���� ���� �����ϱ� ���� set�ڷ���()�޼��带 ����մϴ�.
 * ��)ù��° ?�� ���ǰ��� ������ 1�� ��� setInt(1,1)
 * ��)�ι�° ?�� ���ǰ��� ������ 'ȫ�浿�� ���' setString(2,"ȫ�浿")
 * 	Statement�� SQL���忡�� single quotation(')�� �ʿ��� ��� ���� �ۼ��� �־�����
 * 	PreparedStatement�� �ڷ����� ���� �˾Ƽ� single quotation(')�� ó���� �ݴϴ�.
 * 
 * 6.���� ������ ������ �����ϴ� executeUpdate()�� ȣ���մϴ�.
 * */

package ex22_4_4_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample_different_insert2 {
	public static void main (String args[]) {
		Connection conn = null;
		/*
		 * create table test( no number(10), name varchar2(20) )
		 */
		
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = ("jdbc:oracle:thin:@localhost:1521:xe");
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			int result =0, count =0;
			long start = System.currentTimeMillis();
			String sql = "insert into test(no,name) "
					+ "values(?,?)";
			stmt = conn.prepareStatement(sql);
			
			for (int i =0 ; i<10000 ; i++) {
				String sql1 = "insert into test (no, name) "
						+ " values("+i+",'ȫ�浿')";
				result = stmt.executeUpdate(sql1);
				count += result;
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("�ҿ�ð� : "+(end - start)+"ms"); //112218ms
			
			if(count == 10000)
				System.out.println("���ԿϷ�");
		}catch (ClassNotFoundException cnfe) {
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
		}//finally
		
	}
}
