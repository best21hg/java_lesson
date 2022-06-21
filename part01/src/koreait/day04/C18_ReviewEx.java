package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
			String best ;   //특기과목명 참조할 변수
		
			System.out.println("[[성적집계: 평균과 총점 구하기]]");
			System.out.println("성적 입력하세요.");
			Scanner sc=new Scanner(System.in);
			
		System.out.print("국어 ->");
	int	국어=sc.nextInt();
	System.out.print("영어 ->");
	int	영어=sc.nextInt();
	System.out.print("과학 ->");
	int	과학=sc.nextInt();
	int tot=국어+영어+과학;//총점
	double avg=tot/3.0;//평균
	
	System.out.println("처리되었습니다.");
	System.out.println("총점 : "+tot);
	System.out.printf("평균 : %.2f",avg );
	System.out.println(" , 과목수 : 3");
	
	sc.close();
	
	int max;//최댓값
	
	if(영어==국어 && 영어==과학) {
		max=국어;
		best="국어,영어,과학";
	}
	
	else if(국어>=영어 && 국어>=과학) {
	max=국어;
	best="국어";
	
	if(국어==영어)
		best="국어,영어";
	else if(국어==과학)
		best="국어,과학";
	}
	
	else if(영어>=국어 && 영어>=과학) {
	max=영어;
	best="영어";
	
	if(영어==과학)
		best="영어,과학";
	}
	
	else {
	max=과학;
	best="과학";
	}
	
	System.out.printf("이 학생의 특기과목은. %s(%d).입니다.",best,max);
	
	boolean result;
	result=(국어==영어 || 국어==과학);
	
	}
}
