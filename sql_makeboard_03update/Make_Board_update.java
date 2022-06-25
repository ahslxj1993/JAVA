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
		System.out.print("������ �� ��ȣ�� �Է��ϼ���");
		int num = isNumber(sc);
		Board board = select(dao, num);
		if(board!=null) {
			System.out.print("������ �Է��ϼ���");
			board.setBOARD_SUBJECT(sc.nextLine());
			System.out.print("�� ������ �Է��ϼ���");
			board.setBOARD_CONTENT(sc.nextLine());
			System.out.print("��й�ȣ�� �Է��ϼ���");
			String check_pass = sc.nextLine();
			//���� �Է��� ��й�ȣ�� db�� ����� ��й�ȣ ���ϱ�
			if (check_pass.equals(board.getBOARD_PASS())) {
				int result =  dao.boardModify(board);
				if (result==1) {
					System.out.println("������ �����߽��ϴ�.");
				}else
					System.out.println("������ �����߽��ϴ�.");
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
	}
	
	private static Board select(BoardDAO_seq dao,int num) {
		Board board = dao.getDetail(num);
		if(board !=null) {
			printTitle();
			System.out.println(board.toString());
		} else {
			System.out.println("�ش���� �������� �ʽ��ϴ�");
		}
		
		return board;//����, ���� �ÿ��� ��й�ȣ Ȯ���� ���� �ʿ�
					//�亯�� ��� �������� BOARD_RE_REF, BOARD_RE_LEV, BOARD_RE_SEQ ���� �ʿ�
	}
	static int isNumber(Scanner sc) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (java.lang.NumberFormatException e) {
				System.out.print("������ �ٽ� �Է��ϼ���>");
			}
		}
		return num;
	}

	private static void selectAll(BoardDAO_seq dao) {
		// 1-������
		// 10 -�������� ����� ��
		List<Board> arrs = dao.getBoardList(1,10);
		
		if (arrs!= null) {
			printTitle();
			for (Board b : arrs) {
				System.out.println(b.toString());
			}
		}else {
			System.out.println("���̺� �����Ͱ� �����ϴ�.");
		}
	}
	
	private static void printTitle() {
		System.out.printf("%s\t%s\t\t%s\t\t\t%s\t\t\t%s\t%s\t%s\t%s\n", 
				        "�۹�ȣ", "�ۼ���", "����", "����", "ref", "lev", "seq",	"date");
	}


	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();
		
		System.out.print("�ۼ��ڸ� �Է����ּ���>");
		board.setBOARD_NAME(sc.nextLine());
		
		System.out.print("��й�ȣ�� �Է����ּ���>");
		board.setBOARD_PASS(sc.nextLine());
		
		System.out.print("������ �Է����ּ���>");
		board.setBOARD_SUBJECT(sc.nextLine());
		
		System.out.print("�۳����� �Է����ּ���>");
		board.setBOARD_CONTENT(sc.nextLine());
		
		if (dao.boardInsert(board)==1) {
			System.out.println("���� �ۼ��Ǿ����ϴ�");
		} else {
			System.out.println("������ �߻��Ǿ����ϴ�.");
		}
	}

	private static int menuselect(Scanner sc) {
		String menus[] = { "�۾���", "����", "�亯�ޱ�", "�ۻ���", "��ȸ", "������ ����", "����" };
		
		int i=0;
		System.out.println("=====================================");
		for(String menu:menus) {
			System.out.println(++i+". "+menu);
		}
		System.out.println("=====================================");
		System.out.print("�޴��� �����ϼ���>");
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
					System.out.print(start + "~" + end + "������ ���ڸ� �Է��ϼ���>");
				}
			} catch (java.lang.NumberFormatException e) {
				System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
			}
		}
		return select_menu;
	}
}
