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
