package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {

		//String 클래스의 split(분열) 메소드 : 리턴타입이 String[]
		
		String temp ="모모 90 88 79";
		String result[] =temp.split(" ");	//공백을 기준으로 문자열을 여러개로 쪼개기
		System.out.println("1 반복문 없이 출력");
		System.out.println("index 0 : " +result[0]);
		System.out.println("index 1 : " +result[1]);
		System.out.println("index 2 : " +result[2]);
		System.out.println("index 3 : " +result[3]);
		System.out.println();
		
		//for 문으로
		System.out.println("2. 일반적인 for 출력");
		for(int i=0; i<result.length; i++) {
			System.out.println(String.format("result[%s] : %s",i,result[i] ));
		}
		System.out.println();
		
		//향상된for
		System.out.println("3. 향상된 for 출력");
		for(String t : result)
			System.out.println("result 요소 : "+t);
		String temp2 = "모모,90,88,79";
		result =temp2.split(",");
		 System.out.println();
		
		System.out.println("4. split구분기호 ,");
		for(String t :result)
			System.out.println("result 요소 : "+ t);
		temp2 = "모모,,90,,88,,79";
		result =temp2.split(",");
		 System.out.println();
		
		System.out.println("5. split 구분기호 ,");
		for(String t :result)
			System.out.println("result 요소 : "+ t);
		System.out.println("길이"+result.length);
		//result[1],result[3],result[5] 3개의 빈문자열 입니다.
		 System.out.println();
		
		result =temp2.split(",,");	//구분 기호 문자열읠 변경
		System.out.println("6. split 구분기호 ,,");
		System.out.println("길이"+result.length);
		for(String t :result)
			System.out.println("result 요소 : "+ t);
		System.out.println();
		
		
		//split 의 인자인 문자열은 정규식regex 문자열입니다(정규식 패턴은 복잡, 어렵습니다.)
		// 정규식 예시: [] 안에 표시하는것은 문자여러개가 또는(or)에 해당합니다
		temp2 = "모모,90 88()79";
		result =temp2.split("[ ,()]");	//정규식 문자열 : 구분기호는 공백또는(  또는) ,
		System.out.println("7. split 인자가 정규식");
		System.out.println("길이"+result.length);
		for(String t :result)
			System.out.println("result 요소 : "+ t);
		System.out.println();
		
		temp2 = "모모,90,88,79";
		result =temp2.split(",", 3);	
		//	result =temp2.split(",", 6);	
		System.out.println("8. split 두번째 인자 limit 확인");
		//limit는 리턴되는 배열의 크기. 단 쪼개지는 갯수보다 커질수는 없음.
		System.out.println("길이"+result.length);
		for(String t :result)
			System.out.println("result 요소 : "+ t);
		System.out.println();
		
		
		//배열과 유사한 자료구조 : List  
		//배열을 List로 반환하는 방법
		result = temp2.split(",");
		System.out.println("9. result 배열을 List 객체로 변경");
		List<String> rlist =Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist.size : "+rlist.size());
		for(String t :rlist)
			System.out.println("rlist 요소 : "+ t);
		
		//위의 rlist는 배열의 크기만큼 List 의 크기를 정적으로 생성합니다(추가,삭제,변경못함).
		//rlist.add("test");	//오류 : 고정된 크기의 리스트
		//rlist.remove(2);	//삭제오류
		//rlist.add(2,"100"); 변경오류
		System.out.println();
		
		//동적인 List로 만들기
		System.out.println("10. ArrayList 의 인자가 있는 생성자 테스트");
		List<String> rlist2 =new ArrayList<String>(rlist);
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);	
		
		System.out.println();
		
		//Arrays.asList 는 테스트용으로 사용할 리스트 만들때 가단한 고정리스트 만들때 사용
		List<Integer> ilist =Arrays.asList(1,2,6,9,100);
		System.out.println("11. Arrays.asList 활용");
		System.out.println(ilist);
		
	}
}
