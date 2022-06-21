package koreait.day03;

import java.util.Scanner;

public class C14_ifElseif {

	public static void main(String[] args) {
		//if(조건식) {    }  else if(조건식) {   } 
		
		/*
		 * 	 쇼핑몰 마켓컬리 이벤트
		 * 오늘 구입금액이 10만원이상이면 구매금액의 10%적립금
		 * 				7만원   		9%
		 * 				4만원			7%
		 * 				그이하는 		3%
		 * 
		 */		
		
		Scanner sc=new Scanner(System.in);
		
		int money, pay;  //money는 적립금
		double rate; //적립율
		
		System.out.print("구매금액은>>>");
		pay=sc.nextInt();
		
		if(pay>=100000) rate=0.1;
			
		else if(pay>=70000) rate=0.09;
		
		else if(pay>=40000) rate=0.07;
		
		else rate=0.03;
		
		money=(int)(pay*rate);
		
		
		
		
		System.out.printf("고객님 오늘구매하는금액의 적립금 %d 입니다.\n",money);
		System.out.printf("이벤트 기간 적립율 %d%%를 적용했습니다 .\n",(int)(rate*100));
		
		
		sc.close();
		
		
		
		
		
		
		
	}
}
