package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		boolean result;
		
		result=10 >5;
		System.out.println("10 >5결과:"+result);
		
		System.out.println("9!=9결과:"+(9!=9));
		System.out.println("9!=9결과:"+(9==9));
		
		System.out.println("----논리연산 결과 확인하기: and");
		System.out.println("true and true="+(true&&true));
		System.out.println("true and false="+(true&&false));
		System.out.println("false and true="+(false&&true));
		System.out.println("false and false="+(false&&false));
		
		System.out.println("----논리연산 결과 확인하기: or");
		System.out.println("true or true="+(true||true));
		System.out.println("true or false="+(true||false));
		System.out.println("false or true="+(false||true));
		System.out.println("false or false="+(false||false));
		
		
		System.out.println("----논리연산 결과 확인하기: not");
		System.out.println("not true="+(!true));
		System.out.println("not false="+(!false));
		
		
		int korean, math; //국어점수 ,수학점수
		
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수 입력->");
		korean=sc.nextInt();
		System.out.print("수학점수 입력->");
		math=sc.nextInt();
		//국어점수 수학점수가 80점이상이면 모범학생
		System.out.println("모범학생? "+(korean>=80 && math>=80));
		
		//국어점수나 수학점수중 90점이상이 있으면 특기학생
		System.out.println("특기학생? "+(korean>=90 || math>=90));
		
		//국어점수가 20~80점이 아닌(not)학생은? ->특이한 학생.
		System.out.println("특이한 학생? "+!(korean>=20 && korean<=80));
		
		//	!(korean>=20 && korean<=80)와 같은 수식은(korean<20 || korean>80));
		
		sc.close();
	}
}
/*
 * boolean은 true나 false 값을 갖는 형식.(Boolean 래퍼클래스)
 * 
 * 관계연산 ==같다 ,!=같지않다,>,<,>=,<= 결과값은 boolean값을 갔는다
 * 논리연산 &&(and), ||(or) 	결과값은 boolean값을 가짐
 * 
 * 
 * 
 */

