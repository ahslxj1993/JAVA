package ex08_15_02_interface_polymorhism;

public class InterfaceExample {
	public static void main() {
		//int [] a = new int[3];
		//String [] a = new String[3];
		Lendable [] arr = new Lendable[3];
		arr[0]=new SeparateVolume("883��","Ǫ���� ����","����");
		arr[1]=new SeparateVolume("609.2","����̼���","���긮ġ");
		arr[2]=new AppCDInfo("02-17","����ũ�μ��񽺸� ���� �ڹ� ���α׷���","������");
		
		//���� ����� ���� ��¥�� ���ົ 2�ǰ� �η� CD�� ������ ����Դϴ�.
		checkOutAll(arr,"����","2022-06-02");
		checkOutAll(arr,"����","2022-06-02");
		checkOutAll(arr,"����","2022-06-02");
		
	}
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪
	//�ʵ��� ���� ���θ� üũ�ϱ� ������
	//Lendable �������̽��� checkOut �޼ҵ尡 �־�� ������ ������ �����ϴ�.
	private static void checkOutAll(Lendable[] arr, String borrower, String date){
		for (Lendable a : arr) {
			a.checkOut(borrower, date);
		}
	}
}
