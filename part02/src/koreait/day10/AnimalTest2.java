package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal ani1= new Frog();	//업(up)캐스팅: 자동변환
		Animal	 ani2= new Cat();	// 객체 이름이 같아도 Cat과 Frog는 Animal클래스이기 때문에 Animal이;라는 자료형으로 받을수있음
		
		Dog puddle =new Dog ();
		Crow crow =new Crow();
		//자식객체가 생성될때 먼저부모 클래스 생성자를 실생 
	
		
		System.out.println("::::::::");
		animal(ani1); //객체참조형 변수 전달되는 값은 ani1객체의 주소
	//	animal(ani2);
	//	animal(puddle);
	//	animal(crow);
	// (new Frog());
	}
	
	//다형성 
	//메소드 인자(또는 리턴) 타입이 Animal : Animal, Dog, Frog, Crow, Cat 모두가능합니다
	public static void animal(Animal animal) {
		animal.act();
		
		animal.print();
		//인자로 전달받은 animal 객체가 참조하는 것의 진짜타입(인스턴스 타입) 검사 : instanceof
		System.out.println("dog ? "+(animal instanceof Dog));
		System.out.println("crow ? "+(animal instanceof Crow));
		System.out.println("frog ? "+(animal instanceof Frog));
		System.out.println("cat ? "+(animal instanceof Cat));
		
		// 부모타입 참조는 자식클래스 필드와 메소드에는 접근못함 형변환 필요
	/*	animal.jump(); //Frog
		animal.run(); //Dog
		animal.fly(); //Crow
		animal.sound(); //Cat
	}
	*/
		Cat cat; Dog dog ; Frog frog; Crow crow; 
		if(animal instanceof Cat) {	//animal이 Cat을 참조?
		cat=(Cat)animal;//진짜객체에 따라서 오류가 생길수도 있고 안생길수도 있다 
		cat.sound();
		}
		
		if(animal instanceof Dog)	{
			dog=(Dog)animal;	
			dog.run();
		}
			
		
		if(animal instanceof Frog)	{
			frog=(Frog)animal;	frog.jump();
		}
			
		
		if(animal instanceof Crow)	{
			crow=(Crow)animal;	crow.fly();
		}
		animal.print();
	}
	
}


class Frog extends Animal{
	
	protected String mouth;  
	
	public Frog() {
		System.out.println("새로운 동물가족은 frog");
	}
	
	public void jump() {
		setName ("개구리");
		setColor ("초록");
		System.out.println("특징 : 점핑");
	}
	
	//다형성 구현 :메소드 오버라이드     *비교 오버로딩(overloading) -각자 찾아보기
	// 부모클래스가 같고있던 메소드를 재정의하는것
	@Override		//annotation 애너테이션 : 코딩(또는 실행) 할때 참고가 되는주석
	public void act() {	
	//	super.act();	//부모클래스의 act() 실행
		System.out.println("Animal 행동 : 수시로 점핑하기");
	}
}

class Cat extends Animal{
	
	protected int legs;
	
	public Cat() {
		System.out.println("새로운 동물가족은 cat");
	}
	

	public  void sound () {
		setName ("고양이");
		setColor ("갈색");
		System.out.println("특징 : 야옹야옹");
	}


	@Override
	public void act() {
		System.out.println("Animal 행동 : 할퀴기");
	}








	
}

