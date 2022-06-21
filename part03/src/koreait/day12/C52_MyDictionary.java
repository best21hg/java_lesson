package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	HashMap<String,String> my=new HashMap<>();
		TreeMap<String,String> my=new TreeMap<>();	//정렬가능 map
		String sel,eng,kor;
		eng = null; kor = null;
		System.out.println("선택기능 ☞  1. 단어저장    2. 단어검색   3. 단어장보기    4. 프로그램 끝내기 ");

		boolean	s=true;
		while(	s) {
			System.out.print("선택☞ ->"); sel=sc.nextLine();
			
			switch(sel) {
			
			case "1" : 
				System.out.print("English ->");
				eng=sc.nextLine();
				System.out.print("한글 뜻 ->");
				kor =sc.nextLine();
				my.put(eng, kor);	//저장
				break;
				
			case "2" : 
			System.out.print("검색 단어 English -> ");
				eng=sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과=>"+my.get(eng));
				break;
				
			case "3" : 
				System.out.println("단어장 전체보기 :"+my); 
				break;
			
			case "4" : 
				System.out.println("프로그램 끝내기 "); 
				s=false;
				break;
			default : 
				System.out.println("잘못누르셨습니다");
				break;
			
			}
			
		}
}
}
//참고 정수데이타 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
//int score=Integer.parseInt(sc.nextLine());
//이유 nextInt는 엔터를 처리하지 않음 입력흐름에 방해가됩니다