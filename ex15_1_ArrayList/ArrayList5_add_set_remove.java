package ex15_1_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayList5_add_set_remove {
	public static void main(String [] args) {
		//ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		//������ ������ �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		pArrayList(list);//����Ʈ�� �����ִ� �޼ҵ�
		
		//����Ʈ�� �ΰ��� ������ ����
		list.add(2,"Ű��");
		list.add(4,"Ű��");
		pArrayList(list);
		//�ε��� 0 �� ��ġ�� �����͸� �������� �ٲ�
		list.set(0, "������");
		pArrayList(list);
		//�ε��� 1 ��ġ�� �ִ� �����͸� ����
		list.remove(1);
		pArrayList(list);
		//����Ʈ���� Ű����� �����͸� ã�Ƽ� ����
		list.remove("Ű��");
		pArrayList(list);
	}

	private static void pArrayList(ArrayList<String> list) {
		int num = list.size();
		for (int cnt =0;cnt<num;cnt++) {
			String str = list.get(cnt);
			System.out.println("index ="+cnt+"\t������ ="+str);
		}
		System.out.println("===========================");
	}
		
}
