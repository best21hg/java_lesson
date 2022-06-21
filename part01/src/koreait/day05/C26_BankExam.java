package koreait.day05;

import java.util.Scanner;

/*
 * GUI :Graphic User Interface (사용자 명령을 아이콘, 메뉴방식으로 처리)
 * CLI :(사용자 명령을 텍스로만 처리)
 * 
 * 
 */


public class C26_BankExam {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean run=true;
		int sel;
		int balance=0;
		
		while(run) {  //변수를 사용해야지 while문을 빠저나올수있다
			int money;
			System.out.println("-------------------------------");
			System.out.println("1:예금 | 2:출금 | 3:잔고 확인 | 4:종료");
			System.out.println("-------------------------------");
			System.out.print("메뉴선택>>> ");
			sel=sc.nextInt();
			
			switch(sel) {
			case 1:   
				System.out.print("예금액 >");
				money=sc.nextInt();
				balance+=money;
				
				System.out.println("고객님의 잔액은"+balance+"원입니다");
				break;
				
				
			case 2:
				System.out.print("출금액>");
				money=sc.nextInt();
				if(money>balance)
					System.out.println("잔액이 부족합니다 다시입력해주세요.");
				else 
					balance=balance-money;
				System.out.println("고객님의 잔액은"+balance+"원입니다");
				break;
			case 3:
				System.out.println("현재 잔고 : "+balance);
				System.out.println();
				
				break;
			case 4:
			System.out.println("프로그램을 종료합니다");
			run=false;
			break;
			
			default:
				System.out.println("잘못된선택입니다. 1~4값 만 입력하세요.");
			
			}
			
			System.out.println("＊＊＊＊＊END＊＊＊＊＊");
			
			
			
			
		}//while문 종료
		
	
		
	}
}
