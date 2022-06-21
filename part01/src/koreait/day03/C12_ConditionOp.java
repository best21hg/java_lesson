package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
//조건식의 결과에따라 명령을 선택하는 조건연산자 (조건식)? 트루 : 거짓
	public static void main(String[] args) {
		
int korean, math; //국어점수 ,수학점수
		
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수 입력->");
		korean=sc.nextInt();
		
		System.out.print("수학점수 입력->");
		math=sc.nextInt();
		
		//국어점수 수학점수가 80점이상이면 모범학생
	System.out.println("모범학생? "+((korean>=80 && math>=80)? "맞습니다.":"아닙니다."));
	
	//if : 처리할 명령을 제어하는 조건문
	if(korean>= 80 && math>= 80){
		//위조건식이 참일때 실행하는 명령들
		System.out.println("맞습니다");
	}
	else {
		//조건이 거짓일때 실행하는명령
		System.out.println("아닙니다");
	}
//	System.out.println("특기학생"+(korean>= 90 || math>= 90));
	// {     }안에 들어가는명령이 1개일땐 생략할수있습니다
	if(korean>= 90 || math>= 90){
		System.out.println("맞습니다");
	}
	else {
		System.out.println("아닙니다");
	}
	
	
	if(!(korean>=20 && korean<=80)) {
		System.out.println("표준편차값이 큰학생입니다");
	}
	
	
	
	}
}
