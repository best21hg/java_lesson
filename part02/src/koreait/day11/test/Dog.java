package koreait.day11.test;

public class Dog extends Animal {	
	//추상클래스를 상속받는 클래스에서  추상메서드를 만들지 않으면 오류가발생
//	메소드 오버라이딩을 통해서 추상메서드를 재정의해야함 
	
	protected int legs;	//protected는 외부패키지에 있는 자식클래스까지 접근가능??
	
	
public	Dog () {
	System.out.println("새로운 동물가족은 dog");
	type=Animal.DOG;
}
	
	public void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
	}

	@Override
	public void act() {
		System.out.println("점프하기");
	}

	@Override
	public String eat(Object object) {
		return "먹이는 "+ object+ "입니다.";
	}

	@Override
	public void powerlevel() {
		System.out.println("전투력 : 22");
	}
		
}
