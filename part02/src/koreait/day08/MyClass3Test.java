package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {

	public static void main(String[] args) {

	//	MyClass3 my3=new MyClass3(); //오류 : 생성자가 private 한정자
	//오류	MyClass3 my3=new MyClass3.getInstance();
	//	my3.test();
		MyClass3.staticTest();
		
		//미리만든 객체를 리턴해주는 Calendar 클래스
		Calendar today=Calendar.getInstance();
				System.out.println(today);
	}
}