package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {

		int sum = 0,k=0;
		System.out.println("sum="+sum);
		sum=0;
		k=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("입력한 정수를 모두더하는 계산기입니다.[er2.0(종료:-1)");
		

		System.out.println("sum="+sum);
		
		sum=0;
		System.out.println("입력한 정수를 모두더하는 계산기입니다.[er2.3(종료:-1)");
		
		sum=0;
		while(true) {
		//continue 연습 :입력된 값이 10의배수이면 sum에 더하지않고 다시입력받기
			System.out.print("정수입력>>> ");
			k=sc.nextInt();
			if(k==-1) break;
			if(k%10==0) continue; //아래명령을 실행하지않고 다시반복처음으로
			sum+=k;// sum=sum+k
		}
		sum=0;
		do {
			System.out.println("정수입력>>>");
			k=sc.nextInt();
		}
			while(k>10);
				System.out.println("나갈수있을까?");
			
		
		System.out.println("sum="+sum);
		
		
		
		sc.close();
	}

}
