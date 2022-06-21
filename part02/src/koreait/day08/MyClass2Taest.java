package koreait.day08;

import java.util.Scanner;

public class MyClass2Taest {
//하고싶은 연습을 해보세요 -MyClass 객체생성
	public static void main(String[] args) {
		
		//기본생성자로 객체생성
		MyClass2 my2=new MyClass2();
		//오류: 커스텀 생성자를 정의하면 기본생성자가 사용할수 없게됩니다.
		
		//커스텀 생성자로 객체 생성하기
		MyClass2 my22 =new MyClass2("모모");
		
		System.out.println("name :" +my2.getName());
		System.out.println("name :" +my22.getName());
		
		//my2객체에 기본생성자를 허용하면 name 필드값 초기화를 못합니다
		System.out.println("name :" +my2.getAge());
	//	System.out.println("name :" +my22.setAge(););
		
		//기본생성자를 허용하지않는 예시
	//	Scanner sc=new Scanner();
		
	}

}
