package koreait.day12;

import java.util.ArrayList;

public class C47_MamberTest {

	public static void main(String[] args) {

		ArrayList<Member> list =new ArrayList<>();//리스트에 저장되는건 객체의 참조값
		
		list.add(new Member("모모", 27)); //새로운 객체생성하고 참조값을 리스트에 추가
		Member mamber=new Member("다현", 26);
		list.add(mamber);
		list.add(new Member("나나 ",20));
		list.add(new Member("신비 ",22));
		System.out.println("현재 list 의 요소  개수 : "+list.size());
		System.out.println("1 전체 리스트출력");
		System.out.println(list);
		//list.get (i) -> Mambe 객체의 참조값
		System.out.println("2.list 요소중 age 필드값이 25이하인것만 출력");
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=25)
				System.out.println("i="+i +"," +list.get(i));
			
		}
		
		System.out.println("3. '나나'는 몇번 인덱스에서 참조하고 있는 객체인가? ");
		for(int i=0;i<list.size(); i++) {
			if(list.get(i).getName().equals("나나"))
			System.out.println("i="+i +"," +list.get(i));
		}
			//리스트 요소가 여러개의 필드를 갖는 객체이면 필드값 비교하는 equals 예제 입니다.
			//		indexof는 String, 기본형 래퍼클래스만 사용가능
		
			System.out.println("Mamber 객체로 indexOF 실행 : "+list.indexOf(new Member("나나 ",20)));
		//	-1 못찾음 (이유 : 참조값이 같은 것을 찾는것인데 이것을 필드값비교해서 찾도로 하는 기능이필요
			System.out.println("Mamber 객체로 indexOF 실행 : "+list.indexOf(mamber));	//1
			for (int i=0;i<list.size(); i++) {
	//	if(list.get(i).getName().equals("나나")&&list.get(i).getAge())
			
			
			
			}
	}
}
