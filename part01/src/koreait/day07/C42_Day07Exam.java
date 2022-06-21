package koreait.day07;

import java.util.Random;
import java.util.Scanner;
//안현기
//koreait.sec2020@gmail.com 월요일까지 이메일
public class C42_Day07Exam {

	public static void main(String[] args) {
		
		int[] n1=new int[5];
		int[] n2=new int[5];
		int[] sum=new int[5];
		int[] answer=new int[5];
		Random r=new Random();		
		Scanner sc=new Scanner(System.in);
	int	count=0;
	System.out.println("-----------------------------------------------");
	System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");	
	System.out.println("-----------------------------------------------");
	System.out.println("시작합니다.");
	//	System.out.println(r.nextInt(90)+10);
		for(int i=0;i<n1.length;i++) {
			System.out.print("문제 "+(i+1)+".  ");
			n1[i]=(r.nextInt(89)+11);
			n2[i]=(r.nextInt(89)+11);
			sum[i]=n1[i]+n2[i];
			System.out.print(n1[i]+"+"+n2[i]+"=  ");
			System.out.print("답 입력 ->");
			answer[i]=sc.nextInt();
		if(answer[i]==sum[i])
			count++;
		}
		
		System.out.println("체점 합니다. 맞은 갯수 "+count+" ( "+count*20+" 점 )");
	
	System.out.println("::::: 틀린 문제 정답 보기 :::::" );
	for(int i=0;i<n1.length;i++) {
		if (answer[i]!=sum[i]) {
			System.out.print("문제 "+(i+1)+".  ");
		System.out.println(n1[i]+"+"+n2[i]+"=  "+sum[i]); 
		}
		}

		//첫번째 피연산자 : 83,56 ,71,45,19 난수
	//두번째 피연산자 :50,12, 19,52,53
	/*
	 * 배열에 각각 난수를 저장하기
	 * 사용자 입력한 값 저장 배열만들기
	 * 답을 맞추었나? 83+50(예시) == 시용자가 입력한답
	 * 틀렸나?
	 * 
	 * 틀린문제 정답출력 :  83+50(예시) != 시용자가 입력한답
	 */
	
		
	}
}
