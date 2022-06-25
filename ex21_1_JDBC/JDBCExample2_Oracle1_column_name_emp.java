package ex21_1_JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_Oracle1_column_name_emp {
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1�ܰ� : JDBC ����̹��� �ε��Ѵ�
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);

			// 2�ܰ� : DB�� �����Ѵ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			/*
			 * ������ ���̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ��մϴ� 2�ܰ迡�� ���� Connection ��ü�� ����
			 * createStatement �޼ҵ带 ȣ���ؼ� ����ϴ�.
			 */

			stmt = conn.createStatement();

			/*
			 * Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸����� select ���� �����ϴ� executeQuery ���
			 * �޼ҵ尡 �ֽ��ϴ�. �� �޼ҵ忡 �Ķ���ͷ� select ������ �Ѱ��־�� �մϴ�. �� �޼ҵ�� �Ķ���ͷ� �Ѱ��� select ����
			 * �����ͺ��̽��� ������ �����ϰ� �� ����� ResultSet ��ü�� �����մϴ�.
			 */

			String select_sql = "select * from emp";

			rs = stmt.executeQuery(select_sql);

			System.out.println("��ȣ\t�����ȣ\t����̸�\t����\t\t���\t�Ի���\t\t"
					+ "�޿�\tĿ�̼�\t�μ���ȣ");
			System.out.println("-----------------------------"
					+ "-----------------------------------"
					+ "-------------------------------------");

			/*
			 * Resultset ��ü�κ��� select ���� �������� ��� ���ؼ��� ���� next() �޼ҵ带 ȣ���ؾ��մϴ�. rs.next() -
			 * ��������ġ�� �̵��ϴ� �޼ҵ� ���ϰ��� boolean ���� ������ ���� �о�Դ��� �����Դϴ�
			 */

			int i = 0;
			while (rs.next()) {// ���̻� ���� �����Ͱ� ���������� �ݺ�
				int empno = rs.getInt("empno"); // the coulmn value ; if the value is SQl NULL.
												//the value returned is 0

				// getString("dname") : �÷� dname ���� String ������ �����ϴ� �޼ҵ�
				String ename = rs.getString("ename");

				String job = rs.getString("job");
				
				int mgr = rs.getInt("mgr");
				
				Date hiredate = rs.getDate("hiredate");
				//String hiredate = rs.getString("hiredate").substring(0,10);
				
				int sal = rs.getInt("sal");
				
				int comm = rs.getInt("comm");
				
				int deptno = rs.getInt("deptno");

				System.out.printf("%3d\t%5d\t%-8s%10s\t%-5d\t%-15s%7d%7d%5d\n",
						++i, empno, ename, job,mgr,hiredate, sal, comm, deptno);
			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�" + cnfe.getMessage());
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
