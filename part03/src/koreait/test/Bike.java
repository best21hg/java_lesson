package koreait.test;
//안현기
public class Bike extends Product {
	//6
	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}	
	
	
	//7
	public Bike() {
		
	}
	public Bike(int price, String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//4
	@Override
	public String sell(Object o) {
		return String.format("추가 할인 행사 -%d %% 인하", o);
	}

	//10
	public String ride() { //필드값을 이용하는거라서 필드변수를 써야함 인자로전달받으면 지역변수
		return "당신은 이것을 시속"+this.speed+"km 속도로 탈수 있습니다";
		
	}

	//12
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	

	
	
	
}
