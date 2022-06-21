package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
//모든 객체(Object 상속)에는 compareTo 메소드가 있습니다. :값의 비교
		
		String na ="kim";
		String you ="momo";
		String he ="Son";
		
		//String은 알파벳 (사전식) 비교
		System.out.println("kim과 momo"+na.compareTo(you)); //-2 왼쪽이작고 오른쪽이큼
		System.out.println("kim과 Son"+na.compareTo(he)); //24		
		
		int a=12, b=45;
		System.out.println("a-b :" + (a-b));	//12-45 <0
		
		Integer aa=12;
		Integer bb=45;
		System.out.println("12와 45 : "+ aa.compareTo(bb)); //작으면 -1
		aa=90;
		System.out.println("90와 45 : "+ aa.compareTo(bb));	//크면1
		aa=45;
		System.out.println("45와 45 : "+ aa.compareTo(bb)); //같으면0
		
		//compareTo 와 같은 비교는 sort (정렬) 에 사용됩니다.
		// 정렬은 오름차순, 내림차순 2가지 방법로 할수 있습니다.
		// 오름 차순 : aa.compareTo(bb)
		
	}

}
