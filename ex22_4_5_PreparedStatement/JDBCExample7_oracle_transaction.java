package ex22_4_5_PreparedStatement;
import java.sql.*;
public class JDBCExample7_oracle_transaction {
	public static void main (String [] args) {
		//transaction : ������ �۾� ����
		//insert, delete, update ���� �۾����� �ϳ��� ������ �۾�������
		//��� ���� ����� ��� �۾��� ���� ó�� �� ��쿡�� commit�� �����ؼ�
		//db�� �ݿ��ϰ� ���� ������ �ϳ��� ����ó�� ���� �ʴ� ���
		//rollback �� �����ؼ� �۾��������� ��� �۾��� ����Ѵ�.
		
		//SQL�� �ۼ��ϱ�
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into goodsinfo ");
		sql1.append("values(?,?,?,?)");
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("update goodsinfo ");
		sql2.append("set price = ? ");
		sql2.append("where code = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		//////transaction ����///////
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"scott","tiger");
			
			//autoCommit��� ��Ȱ��ȭ
			conn.setAutoCommit(false);
			
			//----1���۾� ����----//
			//Prepared Statement ��ü ���
			pstmt = conn.prepareStatement(sql1.toString());
			//������ ? �� �� ������ �����ϱ�
			pstmt.setString(1,"10006");
			pstmt.setString(2,"����û����");
			pstmt.setInt(3,500000);
			pstmt.setString(4, "�ڿ���");
			int result1 = pstmt.executeUpdate();
			pstmt.close();
			//----1���۾� ����----//
			
			//----2���۾� ����----//
			//Prepared Statement ��ü ���
			pstmt = conn.prepareStatement(sql2.toString());
			
			//������ ? �� �� ������ �����ϱ�
			pstmt.setInt(1, 12345);
			pstmt.setString(2, "10001");
			int result2 = pstmt.executeUpdate();
			//----2���۾� ����----//
			
			//������ ���������� ����� ��� db�� �ݿ�
			if (result1 ==1 && result2 ==1) {
				conn.commit();
				System.out.println("db�� �ݿ��Ǿ����ϴ�");
			}
			else {
				conn.rollback();
				System.out.println("db �ݿ��� ��ҵ�");
			}
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�"+cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			try {
				conn.rollback();
				System.out.println("db �ݿ��� ��ҵ�");
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
