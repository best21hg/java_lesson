package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;//다른패키지에 있는건 임포트 해야함
import koreait.day09a.Dog;

public class AnimalTeat3 {

 public static void main(String[] args) {
	//부모타입 클래스 배열 :배열에는 Animal 타입 객체의 참조값이 저장
	 	Animal[] animals =new Animal[10]; //부모 클래스 타입으로 배열을 만들면 자식클래스도?
	 	
	 	//animals[]배열은 Animal타입
	 	animals[0]= new Frog();	//객체를 만들면 생성자 출력됨
	 	animals[1]= new Cat();
	 	animals[5]= new Dog();
	 	animals[7]= new Frog();
	 	animals[8]= new Crow();
	 	
	 	
	 	for(Animal temp : animals) {	//animals 배열에값을 순차적으로 temp에대입
	 		if(temp != null) {	
	 			Cat cat ; Dog dog ; Frog frog; Crow crow; //변수저장 
	 			
	 			if(temp instanceof Cat) {	//temp이 Cat을 참조하는지 형변환 가능여부를 true false값으로 알려줌
	 			cat=(Cat)temp; //(Cat)으로 캐스팅해야함	//쉽게 말해 instancof는 해당 클래스가 자기집이 맞는지 확인해 주는것 
	 			
	 			cat.sound(); 
	 			}
	 			
	 			if(temp instanceof Dog)	{
	 				dog=(Dog)temp;	
	 				dog.run();
	 			}
	 				
	 			
	 			if(temp instanceof Frog)	{
	 				frog=(Frog)temp;	frog.jump();
	 			}
	 				
	 			
	 			if(temp instanceof Crow)	{
	 				crow=(Crow)temp;	crow.fly();
	 			}
	 		//	temp.act();
	 		//	temp.print();
	 		}
	 	}
	 	
   }
	
}

