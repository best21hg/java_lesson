package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		
		char c1='a'; //'안에 문자한개만너야됨'
		char c2=97;
		
		//둘다a로출력됨 아스키코드 a값은 97
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		
		//문자코드 정수값 출력법은? 형변환(캐스팅)해야함
		//int로 캐스팅 둘다97로출력됨
		System.out.printf("c1=%d \n",(int)c1);
		System.out.printf("c2=%d \n",(int)c2);
		
		c1=(char)(c1+1);
		System.out.println("c1="+c1);
		
		c1++;		//++연산은 c1=c1+1
		System.out.println("c1="+c1);
		
		
		//한글 문자테스트: 한글문자코드는 10진수값을 44032~55203
		char h1='가';
		char h2=44032;
		char h3='\uac00';
		
		System.out.println("h1="+h1);
		System.out.println("h2="+h2);
		System.out.println("h3="+h3);
		
		System.out.printf("h1=%d\n",(int)h1);
		System.out.printf("h2=%d\n",(int)h2);
		System.out.printf("h3=%d\n",(int)h3);
		
		h1++;
		System.out.println("h1="+h1);
		
		//한글의 마지막 문자
	char h4=55203;
	System.out.println("h4="+h4);
	
	char h5='\ud7a3';//16진수
	System.out.println("h5="+h5);
	
	h5--;
	System.out.println("h5="+h5);
	
	}

}

//char이모여서 한줄로 나열되면 문자열이 됩니다. 
//"Hello" 문자열은 'H','e','l','l','o'문자형의 나열

//주석처리 control+shift+/

/*
 * 데이터 기본형식  : 문자형 char
 * 		문자데이터를 저장하는 2바이트 형식. 정수값 0~65535 범위저장도 가능
 * 		컴퓨터에서 다루는 문자는 문자코드로 처리되는대 코드는 정수값입니다
 * 		문자데이터는 ''기호를 사용합니다('안에는 문자한개만')
 * 		
 * 		영문자,숫자,특수문자는 ASCII 코드로 표현됩니다.
 * 		영문자,숫자,특수문자 외의 다국어문자는 문자를 처리하는 인코딩방식에따라
 * 		문자코드값이 다릅니다. 국제화 인코딩으로 UTF-8방식을 많이사용함
 * 
 */

