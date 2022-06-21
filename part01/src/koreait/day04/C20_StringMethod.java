package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message="hello~";
		
		//String 클래스의 메소드는 메우많이 있습니다
		
		//리턴값 형식은?
		message.indexOf('e');		//int 
		message.indexOf("1o");
		message.substring(2);		//String
		message.substring(2,4);
		message.replace("11","*@");		//String
		//메소드 오버로딩: 메소드 이름과 리턴형식은같고 인자값의 갯수과 형식이 다르게 정의된것
		
		
		int len=message.length();		//length():문자열길이
		char temp=message.charAt(3);		//0번부터시작해서 3번문자열값을보여줌
		boolean isState= message.equals("Hello");	//같은지 true or false
		
		//리턴값형식을 볼려면 출력을 해야함
		System.out.println("length()="+message.length());
		System.out.println("charAt(3)="+temp);
		System.out.println("equals(\"Hello\")="+isState);
		
		System.out.println("indexOf('e')="+message.indexOf('e'));//0부터 시작해서 e위치가 몃번째인가?
		System.out.println("indexOf(\"1o\")="+message.indexOf("lo"));//lo의위치는 몃번째?
		System.out.println("indexOf(\"ol\")="+message.indexOf("ol"));//찾는값이 없을때 -1을 표시함
		String test="hello~hello~";
		System.out.println("test.indexOf(\"1o\")="+test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"1o\")="+test.lastIndexOf("lo"));//마지막에 있는 값을보여줌
		
		
		System.out.println("substring(2)="+message.substring(2));
		System.out.println("substring(2,4)="+message.substring(2,4));
		System.out.println("substring(1,4)="+message.substring(1,4));
		
		System.out.println("replace(\"ll\",\"*@\")="+message.replace("ll","*@"));//ll을 *@로바꿈 ("여기적힌값을","여기값으로변환")
		System.out.println("startsWith(\"H\")="+message.startsWith("H"));//첫글자가 맞는지
		System.out.println("endsWith(\"~\")="+message.endsWith("~"));//끝글자가 맞는지
		
	}

	
}
//기본페키지 클래스가 아니면 임포트가 필요하다