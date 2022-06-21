package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;



public class C60_CharSequence {
	
	//CharSequence 인터페이스 구현체
	public static void main(String[] args) {

		String result =new String();
		System.out.println(result);
		System.out.println("1 String 타입 테스트");
		for(int i=2;i<6;i++) {
			//문자열 내용이 바뀌면 문자열 객체가 새로생성되고 위치가 바뀝니다
			result+=i+"/";	//result =result + (i+"/')
			System.out.println("result : "+result);
		}
		
		
		//문자열내용이 많이바뀔때 쓴다
		StringBuffer sb=new StringBuffer();
		System.out.println("2 StringBuffer 타입테스트");
		for(int i=2; i<6;i++) {
			//StringBufer 객체의 문자열 내용이 바꿔어도 기존객체에 추가되는 동작을 합니다
			//
			sb.append(i).append(":");		//문자열 연결 연산 + 와 같은 동작
			System.out.println("sb:" +sb);
		}
		
		//CharSequence 인터페이스 사용 :contains메소드의 매개변수 타입
		String sample ="abc2/3/4/5/xyz";
		
		System.out.println("3. contains 메소드 확인");
		//true
		System.out.println("contains(result)"+sample.contains(result));
		//false
		System.out.println("contains(result)"+sample.contains(sb));
		
		//메소드의 형식 또는 다른 여러 형식들을 확인할떼 :1 클래스or인터페이스?  2.인터페이스 구현체는 무엇?
		
		
		//침고 : ArrayList 선언할때 변수선언 List 인터페이스 형식으로한다
	List<String> names =new ArrayList<>();
	names =new Vector<>();
	
	Map<String, Integer> map =new HashMap<String, Integer>(); //객체 생성시 재너릭타입 생략가능
	map = new TreeMap<String , Integer>();
	
	
	
	
	
	
	}
}
