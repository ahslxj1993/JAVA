package ex22_4_1_select_statement_dao;

import java.util.ArrayList;

public class CRUD {
	//CRUD : 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
	//C(Create - insert) R (Read - select)
	//U(Update - update) D (Delete - delete)
	
	static String menus [] = {"사원번호","사원이름","직급","매니저","입사일자","급여","커미션","부서번호","종료"};

	public static void main (String [] args) {
		selectAll();
	}

	private static void selectAll() {
		DAO dao = new DAO();
		ArrayList<Emp> e = dao.selectAll();
		
		if (e==null) {
			System.out.println("검색결과가 없습니다");
		}
		else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n"
					,menus[0],menus[1],menus[2],menus[3],menus[4],menus[5],menus[6],menus[7]);
			for (Emp s : e) {
				System.out.println(s.toString());
			}
		}
	}
}
