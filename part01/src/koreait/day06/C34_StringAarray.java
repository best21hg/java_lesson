package koreait.day06;

import java.util.Scanner;

public class C34_StringAarray {

	public static void main(String[] args) {

		String message ="hi java!";
		
		String[] engKey = {"continue","break","public","static","dynamic"};
		
		//engkey 뿐만아니라 engkey[2]도 참조형타입
		
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]);
		
		String[] koreans= new String[5];
		for(int i=0;i<koreans.length;i++)
		System.out.println(koreans[i]);// 기본 초기값은? null 아무것도 참조하지 않은상태
		
		System.out.print("1 engKey 배열요소값이 참조하는 문자열의 길이");
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i].length());
			
				koreans[0]="계속하다";
				koreans[1]="멈추다";
				koreans[2]="공용의";
		
		System.out.println("2 koreans 배열요소값이 참조하는 문자열의 길이");
		for(int i=0;i<koreans.length;i++)
			if(koreans[i] !=null ) 
			System.out.println(koreans[i]+":"+koreans[i].length());
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("static 뜻? >>>");
		koreans[3]= sc.nextLine();
		System.out.print("dynamic 뜻? >>>");
		koreans[4]= sc.nextLine();
		
		System.out.println("모두 입력된 koreans 배열확인");
		for(int i=0; i<koreans.length;i++)
		System.out.println(koreans[i]);
		
		//사용자가 입력한 영어단어가 engKey 배열 몃번인지?
		System.out.print("찾을 단어는 >>> ");
		String find = sc.nextLine();
		int index=-1;
		
		for(int i=0;i<engKey.length;i++) {
			if(find.equals(engKey[i])) {
				index=i;
				break;
			}
		}
		System.out.println("찾은단어위치:"+index);
		if (index==-1)
			System.out.println("찾는 단어가engKey 안에 없습니다");
		else 
			System.out.println("한글뜻: "+koreans[index]);
		
	}
}
