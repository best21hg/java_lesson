package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {

	public static void main(String[] args) {
			//switch문은 if~else if문을 대신하는문입니다
		Scanner sc=new Scanner(System.in);
		
		int item_no;//상품번호
		int pay =0;//지불할돈
		
		
		System.out.println("상품목록: 1.2200원  2.1900원 3.3600원 4.2870원");
		System.out.print("상품(번호)을 선택해서 장바구니에 넣으세요>>>");
		item_no=sc.nextInt();
		
		switch (item_no) {
		case 1:
			pay=2200;
			break;		//아래의명령문을 실행하지않고 switch문을 끝내기
		case 2:
			pay=1900;
			break;
			
		case 3:
			pay=3600;
			break;
			
		case 4:
			pay=2870;
			break;
			
		default:
			System.out.println("상품선택이 잘못됬습니다");
			pay=99999;
			break;
		}
		
		System.out.println("결재금액"+pay+"원입니다");
		
		
		//위에 switch문을 if~ else if로바꿔서 실행하기
		//  if문만 체팅창으로 보내기
		
	
		
		if(item_no==1) 
			pay=2200;
		else if(item_no==2)
			pay=1900;
		else if(item_no==3)
			pay=3600;
		else if(item_no==4)
			pay=2870;
		else
			System.out.println("다시선택해주세요!");
		
		
		System.out.println("결재금액2 "+pay+"원 입니다.");
		
		
	}
}
