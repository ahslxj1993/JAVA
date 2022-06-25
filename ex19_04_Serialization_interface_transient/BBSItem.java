package ex19_04_Serialization_interface_transient;
/*������, �޼���, ���� �ʵ�� ����ȭ ����� �ƴմϴ�
 * �ν��Ͻ� �ʵ�� ����ȭ ����Դϴ�
 * transient Ű���� : ���Ŀ��� ���ܽ�ų �ʵ带 ǥ���ϴ� Ű����
 * ������� : ObjectOutputExample3.java -> ObjectInputExample3
 * */
public class BBSItem implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private static int itemNum =0; // �Խù��� �� - ���� �ʵ�� ����ȭ ���� �ʽ��ϴ�.
	private String writer; //�۾���- �ν��Ͻ� �ʵ�� ����ȭ �ɼ� �ֽ��ϴ�.
	private transient String passwd;// �н����� - transient Ű���� ���� �ν��Ͻ� �ʵ��
									// ����ȭ ����� ���� �ʽ��ϴ�.
	private String title; //���� - �ν��Ͻ� �ʵ�� ����ȭ �ɼ� �ֽ��ϴ�.
	private String content; // ���� - �ν��Ͻ� �ʵ�� ����ȭ �ɼ� �ֽ��ϴ�.
	
	//�����ڴ� ����ȭ ����� ���� �ʽ��ϴ�.
	BBSItem (String writer, String passwd, String title, String content){
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	//�޼ҵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	public void modifyContent (String content, String passwd) {
		if (!passwd.equals(this.passwd)) 
			return;
			this.content = content;
	}
	//�޼ҵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	public String toString() {
		return "��ü�Խù��� �� : "+itemNum+
				"\n�۾��� : "+writer+
				"\n�н����� : "+passwd+
				"\n���� : "+title+
				"\n���� : "+content;
	}
}
