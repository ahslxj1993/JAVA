package sql_makeboard_01insert;

import java.util.Scanner;


public class Make_Board_Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			
			case 7:
				sc.close();
				return;
			}
		} while (true);
	}

	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();
		
		System.out.print("작성자를 입력해주세요>");
		board.setBOARD_NAME(sc.nextLine());
		
		System.out.print("비밀번호를 입력해주세요>");
		board.setBOARD_PASS(sc.nextLine());
		
		System.out.print("제목을 입력해주세요>");
		board.setBOARD_SUBJECT(sc.nextLine());
		
		System.out.print("글내용을 입력해주세요>");
		board.setBOARD_CONTENT(sc.nextLine());
		
		if (dao.boardInsert(board)==1) {
			System.out.println("글이 작성되었습니다");
		} else {
			System.out.println("오류가 발생되었습니다.");
		}
	}

	private static int menuselect(Scanner sc) {
		String menus[] = { "글쓰기", "수정", "답변달기", "글삭제", "조회", "페이지 선정", "종료" };
		
		int i=0;
		System.out.println("=====================================");
		for(String menu:menus) {
			System.out.println(++i+". "+menu);
		}
		System.out.println("=====================================");
		System.out.print("메뉴를 선택하세요>");
		return inputNumber(sc,1,menus.length);

	}

	private static int inputNumber(Scanner sc, int start, int end) {
		int select_menu =0 ;

		while (true) {
			try {
				select_menu = Integer.parseInt(sc.nextLine());
				if (select_menu <= end && select_menu >= start) {
					break;
				} else {
					System.out.print(start + "~" + end + "사이의 숫자를 입력하세요>");
				}
			} catch (java.lang.NumberFormatException e) {
				System.out.print("숫자로 다시 입력하세요>");
			}
		}
		return select_menu;
	}
}
