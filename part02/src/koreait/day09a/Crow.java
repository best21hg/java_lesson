package koreait.day09a;

public class Crow extends Animal{	//까마귀

	protected int wings;
	
	
	public Crow() {	//생성자 객채생성할때 출력	출력순서는 부모클래스의 생성자 다음에출력됨
		System.out.println("새로운 동물가족은 crow");
	}
	
	
		public void fly() {
			setName("까마귀");
			setColor("검정색"); 
			System.out.println("특징 : 날기" );
			
		}
}
