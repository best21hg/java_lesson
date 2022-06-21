package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

		
		
	}
}

class Product2{
	int price;

	//부모클래스에서 디폴트 생정자를 정의하여 자식 클래스가 사용하도록함
	public Product2() {
		
	}
	
	public Product2(int price) {
		this.price=price;
	}
}

class Food2 extends  Product2{	
	// Food2 디폴트 생성자는 자동으로 동작됨 
	// 부모클래스 Product2 디폴트 생성자 super()가 호출

	
}

class Electronics2 extends Product2{
	
	public Electronics2(int price) {
		super(price);
		//부모클래스의 커스텀 생성자 실행
	}
	
}
