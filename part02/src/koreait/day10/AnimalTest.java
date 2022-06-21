package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest {

	public static void main(String[] args) {
			Animal animal=new Animal();
			animal.act();
			animal.print();
			System.out.println("---------------------------");
			
			Dog dog =new Dog();
			dog.run();
			dog.print();
			System.out.println("----------------------");
			Crow crow=new Crow();
			crow.fly();
			crow.print();
			
			System.out.println(":::::::::::::::::::::::::");
			Animal temp=dog;	//자식객체는 부모클래스 타입으로 참조할수 있습니다
			//자식클래스는 부모클래스타입으로 자동캐스팅
			temp.print();
		//오류	temp.run(); //부모타입 변수로는 자식 메소드를 실행못합니다
			temp=crow;
			temp.print();
		//오류	temp.fly(); //부모타입 변수로는 자식 메소드를 실행못합니다
			System.out.println("--------------------------------");
			Animal puppy =new Dog();	//자식객체는 부모클래스 타입으로 참조할수 있습니다
			puppy.print();	//객체만들어서 생성자 실행값이초기화됨 
		//오류	puppy.run();  //부모타입 변수로는 자식메소드 실행못합니다
			
			Dog puddle =(Dog)puppy; //Animal 타입을 Dog타입으로 강재casting(자식클래스 이므로 가능)
			puddle.run();	//puppy 변수가 참조하는 객체가 Dog 타입일때만 가능 Crow는 run이없다
			puddle.print();
			
			
	}

}
