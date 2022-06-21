package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class MemberAgeAscending implements Comparator<Member>{
//sort 와 관련된 인터페이스 사용.
	public static void main(String[] args) {
	//List는 인터페이스 , ArrayList는 구현체
	//다형성 : List를 참조타입으로 하여 선언합니다. 앞으로 배울 라이브러리들이 List타입으로 원합니다.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);		//인덱스  0
		ilist.add(77);		//		1
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort 이전 : " + ilist);
		//정렬:오름차순
		ilist.sort(null);    //인자로 필요한것은 비교자 Comparator 구현체 필요합니다.
							 //기본형,String은 null 로 할수 있습니다.(오름차순 기본)
		System.out.println("sort 이후 : " + ilist);
		ilist.sort(Comparator.reverseOrder());		//reverse:역순(내림차순), 
							//Comparator인터페이스의  static메소드
		System.out.println("내림차순 sort : " + ilist);
		
		slist.add("트와이스");
		slist.add("오마이걸");
		slist.add("아이즈원");
		slist.add("비비즈");
		slist.add("소녀시대");
		slist.add("브레이브걸즈");
		
		System.out.println("sort 이전 : " + slist);
		slist.sort(null);
		System.out.println("sort 이후 (ASCEnding): " + slist);
		slist.sort(Comparator.reverseOrder());
		System.out.println("내림차순 sort(DESCending) : " + slist);
		
		List<Member> mlist = new ArrayList<>();
	
		mlist.add(new Member("momo",23));
		mlist.add(new Member("nana",27));
		mlist.add(new Member("nayeon",25));
		mlist.add(new Member("dahyeon",29));
		mlist.add(new Member("sooni",26));
		mlist.add(new Member("jenny",27));
		
		System.out.println("member 리스트 상태 : " + mlist);
		mlist.sort(null);   //오류:Member 객체는 비교할수 없는 객체 -> 비교자 인터페이스를 인자로 해야함.
		System.out.println("member sort 확인 : " + mlist);
		
	}

@Override
public int compare(Member o1, Member o2) {
		Integer age1= o1.getAge();
		Integer age2= o2.getAge();
		
		//age 필드값이 같을 떄 name 필드(2차 기준) 오름차순으로 정렬.
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else
	return age1.compareTo(age2);	//오름차순: age1<age2 일때 -1을 리턴
	
}

}
