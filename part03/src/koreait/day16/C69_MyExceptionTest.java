package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력>>>");
		try {
			int age=Integer.parseInt(sc.nextLine());
			if(age<0 || age>100)
				throw new Exception("나이의 범위는 0~100 입니다.");
			//throw 는 지정된 Exception 을 발생시킵니다
			if(age==0) throw new NullPointerException();
			
			System.out.println("당신의 나이는 " +age+ " 세맞습니까?");
			
		} catch(NumberFormatException e) {
			System.out.println("나이이름은 숫자로만 하세요");
		} catch(Exception e) {
			System.out.println("시용자 실행 오류 : "+e.getMessage());
	
	}
}
	
} //class end

//사용자 Exception을 만듭니다.: Exception 상속
class AgeException extends Exception{
	
	//Serializable 인터페이스와 관련된값
	
	private static final long serialVersionUID =1L;
	
	//사용자가 임의로 메세지를 만들수 있습니다
	public AgeException(String message) {
		super(message);	//Exception의 message 필드를 설정
	}
	
}