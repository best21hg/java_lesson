package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {

		int n10 =123;
		int n16 = 0xa41c;	//16진수 표기는 0x로 시작
		int n2 =0b1010010000011100; //2진수 표기 0b로 시작
		
		System.out.println("1. 변수를 그래로 출력");
		System.out.println("10진수 리터럴 123"+ n10);
		System.out.println("16진수 리터럴 0xa41c"+ n16);
		System.out.println("2진수 리터럴 0b1010010000011100 : "+ n2);
		
		System.out.println("2. format 지정애서 16진수 출력");	// %x는 16진수 출력
		System.out.println(String.format("16진수 리터럴 0xa41c : %x", n16));//16진수 형식
		System.out.println(String.format("2진수 리터럴 0b1010010000011100 : %x", n2));//16진수 형식
		System.out.println(String.format("10진수 리터럴 42012 : %x",42012)); //다똑같이 a41c값이나옴
		//결론 10진수 2진수 16진수 변수값은 모두다 메모리에 저장될때는 0,1표현값
		
		System.out.println("3. -1의 2진수 , 16진수 표현 확인.");
		n16=0xffffffff;	//int는 4바이트
		System.out.println("16진수 0xffffffff : "+n16);
		System.out.printf("-1은 16진수 %x\n :", -1);
		
		
		System.out.printf("%x\n ",-1);
		System.out.println("2진수 : " +Integer.toBinaryString(-1));
		
		System.out.println("3. 입력한 2진수 또는 16진수값을 10진수로 바꿈");
		Scanner sc=new Scanner(System.in);
		System.out.print("2진수 값입력 >>");
		String t2 =sc.nextLine();
		System.out.print("16진수 값입력 >>");
		String t16 =sc.nextLine();
		
		System.out.println(String.format("2진수 %s 는 10진수 %d입니다",
				t2,Integer.parseInt(t2,2) ));
		System.out.println(String.format("16진수 %s 는 10진수 %d입니다",
				t16,Integer.parseInt(t16,16) ));
		
	
		
		
	}
}
/*	<<요약>>
 * 	n은 2(Binary), 8(octal), 16(hex) 가능합니다.
 * 	n진법 문자열 -> 10진 정수값 변환 Integer.parseInt(문자열, n)
 * 	10진 정수값 -> n진법 문자열 Integer.toBinaryStrig 메소드, toHexString 메소드
 * 
 * 	format 에서 %d는 10진수 , %x는 16진수, %o는 8진수 , 
 * 
 * 참고 2진수는 포맷형식이 없습니다. Integer.parseInt 메소드 사용해서  
 * 
 * 2진수의 비트 연산 : &, | , ^, ~, >> , << 등등 간단히 테스트
 * 
 */


