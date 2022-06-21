package koreait.day11.test;

public class Crow extends Animal{	//까마귀

	protected int wings;
	
	
	public Crow() {	//생성자 객채생성할때 출력	출력순서는 부모클래스의 생성자 다음에출력됨
		System.out.println("새로운 동물가족은 crow");
		type=Animal.CROW;
	}
	
	
		public void fly() {
			setName("까마귀");
			setColor("검정색"); 
			System.out.println("특징 : 날기" );
			
		}


		@Override
		public void act() {
			System.out.println("울기");
		}



		@Override
		public void powerlevel() {
			System.out.println("전투력 : 17");
		}


		@Override
		public String eat(Object object) {
			return "먹이는 : "+object;
		}
}
