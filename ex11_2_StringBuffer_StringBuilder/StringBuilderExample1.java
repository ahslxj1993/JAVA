package ex11_2_StringBuffer_StringBuilder;
public class StringBuilderExample1 {
	public static void main (String[] args) {
		StringBuffer sb = new StringBuffer("동해물과 백두산이 마르고  ");

		System.out.println(sb.append("닳도록 보우하사 "));//기존 문자열에 추가
		System.out.println(sb.insert(19, "하느님이 하느님이 "));//index가 19인 곳에 "하느님이 하느님이 "를 삽입
		System.out.println(sb.delete(24,28));//index가 24부터 27까지 문자열 삭제
		System.out.println(sb.deleteCharAt(9));//index가 9 인 곳의 문자하나 삭제
		System.out.println(sb.append("닳도록 보우하사").delete(0,5));
	}
}
