package koreait.day11;

public class AShapeTest {

	public static void main(String[] args) {
		//main 메소드는 클래스로 만들어진 애플리케이션입니다.
		//추상메소드로 만들어진 에플리케이션에서 새로운 추상메소드를 추가하면?
		
		Triangle tri =new Triangle(100, 84);
		tri.shapeName="직각삼각형";
	System.out.println(tri);
	System.out.println("넓이= " + tri.getArea());
		
		Circle cir=new Circle();
	cir.setRadius(89);
	cir.shapeName="원";
	System.out.println(cir);
	System.out.println("넓이= " + cir.getArea());
	}
}
/*
 * 침고 : 메소드 재정의할때 접근한정자
 * 부모 public -> 자식 default : 오류
 * 부모 default -> 자식 public : 가능
 * 
 */

//추상클래스 
 abstract class AShape{		//도형
	protected String shapeName;
	protected int width;
	protected int height;
	
	
	public AShape() { //추상클래스는 직접 객채를 못만들지만 자식클래스가 객체만들때 생성자 실행
		System.out.println("AShape 디폴트 생성자 동작됩니다");
	}
	
	//추상클래스는 커스텀생성자 만드나요?
	public AShape(int width, int height) {
		System.out.println("커스텀 생성자 동작합니다");
		this.height=height;
		this.width=width;
	}
	
	public abstract double getArea();	//도형의 넓이
	
	//추상클래스도 인스턴스 메소드 정의해서 자식클래스가 정의할수있습니다
	public Object explain() {	//애플리캐이션 완료후 추상메소드 추가하면 오류발생
		// 인스턴스 메소드를 추가
		return null;
	}

	@Override
	public String toString() {
		return "AShape [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
}

class Triangle extends AShape{

	public Triangle(int width , int heidght) {
		super(width,heidght);
	//	this.width=width;
	//	this.height=height;
	}
	@Override
	public double getArea() {
		return width*height/2;
	} //width*height/2
}

class Circle extends AShape{
	private int radius; // 반지름

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}

	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return radius*radius*3.14;
	}
								//반지름*반지름*3.14
}


class Rectangle extends AShape{

	@Override
	public double getArea() {
		return width*height;
	}
					//width*height
}



