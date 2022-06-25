package sql_makeboard_03update;

import java.util.List;
import java.util.Scanner;


public class Make_Board_update {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			case 2:
				update(sc,dao);
				break;
			case 5:
				selectAll(dao);
				break;
			case 7:
				sc.close();
				return;
			}
		} while (true);
	}

	private static void update(Scanner sc, BoardDAO_seq dao) {
		System.out.print("수정할 글 번호를 입력하세요");
		int num = isNumber(sc);
		Board board = select(dao, num);
		if(board!=null) {
			System.out.print("제목을 입력하세요");
			board.setBOARD_SUBJECT(sc.nextLine());
			System.out.print("글 내용을 입력하세요");
			board.setBOARD_CONTENT(sc.nextLine());
			System.out.print("비밀번호을 입력하세요");
			String check_pass = sc.nextLine();
			//지금 입력한 비밀번호와 db에 저장된 비밀번호 비교하기
			if (check_pass.equals(board.getBOARD_PASS())) {
				int result =  dao.boardModify(board);
				if (result==1) {
					System.out.println("수정에 성공했습니다.");
				}else
					System.out.println("수정에 실패했습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
	
	private static Board select(BoardDAO_seq dao,int num) {
		Board board = dao.getDetail(num);
		if(board !=null) {
			printTitle();
			System.out.println(board.toString());
		} else {
			System.out.println("해당글이 존재하지 않습니다");
		}
		
		return board;//수정, 삭제 시에는 비밀번호 확인을 위해 필요
					//답변의 경우 원문글의 BOARD_RE_REF, BOARD_RE_LEV, BOARD_RE_SEQ 값이 필요
	}
	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("정수로 다시 입력하세요>");
			}
		}
		return num;
	}

	private static void selectAll(BoardDAO_seq dao) {
		// 1-페이지
		// 10 -페이지당 목록의 수
		List<Board> arrs = dao.getBoardList(1,10);
		
		if (arrs!= null) {
			printTitle();
			for (Board b : arrs) {
				System.out.println(b.toString());
			}
		}else {
			System.out.println("테이블에 데이터가 없습니다.");
		}
	}
	
	private static void printTitle() {
		System.out.printf("%s\t%s\t\t%s\t\t\t%s\t\t\t%s\t%s\t%s\t%s\n", 
				        "글번호", "작성자", "제목", "내용", "ref", "lev", "seq",	"date");
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
