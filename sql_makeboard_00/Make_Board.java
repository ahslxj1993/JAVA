package sql_makeboard_00;

import java.util.Scanner;


public class Make_Board {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			int menu = menuselect(sc);
			System.out.println(menu);
		} while (true);
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
