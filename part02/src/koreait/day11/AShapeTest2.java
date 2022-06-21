package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
	
	//익명 클래스 : anonymous. 이름이없는클래스
	public static void main(String[] args) {

		//line(선)
		//익명 내부(Inner) 클래스 정의. 1회용클래스
		AShape sha =new AShape() {
			//추상메소드 재정의
			@Override
			public double getArea() {
				return width+height;
			}
		};
		
		AShape sha2 =new AShape(20,13) {
			
			@Override
			public double getArea() {
				return width+height;
			}
		};
		
		System.out.println("sha 넓이= "+sha.getArea());
		System.out.println("sha2 넓이= "+sha2.getArea());
		
	//추상클래스 아닐때도 메소드 재정의해서쓰면 익명클래스 처럼쓸수있나요?
		//가능하다 보통은 추상메소드 재정의해서 익명클래스를 많이씁니다
		
		
		Animal snake =new Animal() {	//객체생성하는 부분에서 클래스를 이름없이 다시정의?
			int length;
			
			public void act() {
				setName("이구아나");
				setColor("얼룩이");
				length=3;
				System.out.println("action : 기어다니기");
			}
			
			public String toString() {
			
			return "length="+length;
			
		}
	
  };
	}
}
