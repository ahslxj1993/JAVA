package ex19_04_Serialization_interface_transient;
/*생성자, 메서드, 정적 필드는 직렬화 대상이 아닙니다
 * 인스턴스 필드는 직렬화 대상입니다
 * transient 키워드 : 직렬에서 제외시킬 필드를 표시하는 키워드
 * 실행순서 : ObjectOutputExample3.java -> ObjectInputExample3
 * */
public class BBSItem implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private static int itemNum =0; // 게시물의 수 - 정적 필드는 직렬화 되지 않습니다.
	private String writer; //글쓴이- 인스턴스 필드는 직렬화 될수 있습니다.
	private transient String passwd;// 패스워드 - transient 키워드 붙은 인스턴스 필드는
									// 직렬화 대상이 되지 않습니다.
	private String title; //제목 - 인스턴스 필드는 직렬화 될수 있습니다.
	private String content; // 내용 - 인스턴스 필드는 직렬화 될수 있습니다.
	
	//생성자는 직렬화 대상이 되지 않습니다.
	BBSItem (String writer, String passwd, String title, String content){
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
		itemNum++;
	}
	//메소드는 직렬화 대상이 되지 않습니다.
	public void modifyContent (String content, String passwd) {
		if (!passwd.equals(this.passwd)) 
			return;
			this.content = content;
	}
	//메소드는 직렬화 대상이 되지 않습니다.
	public String toString() {
		return "전체게시물의 수 : "+itemNum+
				"\n글쓴이 : "+writer+
				"\n패스워드 : "+passwd+
				"\n제목 : "+title+
				"\n내용 : "+content;
	}
}
