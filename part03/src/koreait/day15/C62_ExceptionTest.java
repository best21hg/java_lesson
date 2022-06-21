package koreait.day15;

import java.util.Scanner;

//Throwable 클래스의 하위클래스
//: Error -> 개발 중인 프로그램 외부의 문제. 시스템 상의 오류 (HW,OS JVM)
//: Exception -> 개발 중인 프로그램과 관련된 문제
public class C62_ExceptionTest {

	public static void main(String[] args) {
		
		//Exception 예시3 : java.util.InputMismatchException
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력>>> ");
	//	int a=sc.nextInt(); //숫자외에 다른거입력하면 오류
		int a =Integer.parseInt(sc.nextLine());
		System.out.println("당신이 입력한 값 " + a);
	
		
		//Exception 예시2 : java.lang.ArrayIndexOutOfBoundsException:
		int[] nums=new int[5]; 
		nums[5]=100;	//오류배열요소 범위벗어남
		
		
		//Exception 예시1 : java.lang.NullPointerException
		//오류 객체참조가 null이면 메소드 실행못합니다
		String message =null;
		char temp =message.charAt(0); //message문자열에서 첫번째 글자1개가저옴
		
	}
	
}
//문법 오류 int a=4.1; 와같이 컴파일 자체가 안될때
/*
Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류 입니다.(발생가능성을 고려해서 프로그래밍해야합니다.)
     -> 원인에 따라 다른이름 XXXXException 이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.
     -> Exception 이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됩니다. 
         따라서, Exception 을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
*/