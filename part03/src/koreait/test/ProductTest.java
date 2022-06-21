package koreait.test;
//안현기
public class ProductTest {

	public static void main(String[] args) {
		
		//실행예시
		Bike bike=new Bike(); 
		System.out.println(bike.sell(20));	
		
		Electroics tv=new Electroics();
		System.out.println(tv.sell("사운드바"));
		
		bike.setSpeed(20);
		System.out.println(bike.ride());
		
		
			//13
			Product[] cart=new Product[10];
			cart[0]=new Bike(123000,"MTB",25);
			cart[1]=new Electroics(35000,"USB");
			cart[3]=new Bike(99000,"삼천리",15);
			cart[5]=new Electroics(117000,"ipad");
			cart[7]=new Electroics(2250000,"lg 냉장고");
			
			//14
		((Electroics)cart[7]).setKwh(24);
	System.out.println(((Electroics)cart[7]).power());	
		
			//캐스팅 부모자식 클래스간에는 서로 형변환 가능
			
			//15
			for(Product temp:cart) 
				if(temp!=null && temp.price>=100000)
					System.out.println(temp);
			//16	
			for(Product temp:cart) 
				if(temp!=null && temp instanceof Bike) {
					Bike b=(Bike)temp; //자식클래스Bike로다운캐스팅 
				System.out.println(b.ride());	
					
				}
				
			
				}
	
	}
	
	



class Electroics extends Product{

	//5
	@Override
	public String sell(Object o) {
		return String.format("묶음 상품 - %s (1set)", o);
	}
	
	//8
	private double kwh;

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	//9
	public Electroics() {
		
	}
	public Electroics(int price, String prdName) {
		this.price=price;
		this.prdName=prdName;
	}
	
	//11
	public double power() {
		return this.kwh*24;
		
	}
	
	//12
	@Override
	public String toString() {
		return "Electroics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

}