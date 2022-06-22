package Homework_DAO;

import java.util.ArrayList;
import java.util.Map;


public class CRUD {
	//CRUD : ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
	//C(Create - insert) R (Read - select)
	//U(Update - update) D (Delete - delete)
	
	static String menus [] = {"�����ȣ","����̸�","����","�Ŵ���","�Ի�����","�޿�","Ŀ�̼�","�μ���ȣ","����"};

	public static void main (String [] args) {
		selectAll();
	}

	private static void selectAll() {
		DAO dao = new DAO();
		ArrayList<Map<String, Object>> e = dao.selectAll();
		
		if (e==null) {
			System.out.println("�˻������ �����ϴ�");
		}
		else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n"
					,menus[0],menus[1],menus[2],menus[3],menus[4],menus[5],menus[6],menus[7]);
			for (Map<String, Object> s : e) {
				System.out.printf("%-8s%-8s%-16s%s\t%-16s%s\t%s\t%s\n",
						s.get("empno"),s.get("ename"),s.get("job"),s.get("mgr")
						,s.get("hiredate"),s.get("sal"),s.get("comm"),s.get("deptno"));
			}
		}
	}
}
