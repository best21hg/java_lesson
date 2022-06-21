package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		MyClassX x1 =new MyClassX();
		MyClassY y1 =new MyClassY();
		MyClassZ z1 =new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();
		
		
//참조타입에 다른 메소드 실행(다중 구현체) z1,z2,z3이 어떤 메소드 실행가능한지
		//z1 메소드 AB둘다 실행가능 z2은A z3b은B 실생가능
		z1.name("쯔위");
		z1.methodA();
		
		z2.methodA();
		z2.methodB(23);
	//	z2.methodA("쯔위");오류  InterfaceB의 추상메소드로 실행못함
		
		z3.name("쯔위");
		
		//캐스팅 : *다중 구현체*의 인터페이스 타입 캐스팅
		InterfaceB ib=(InterfaceB)z2;	//InterfaceB로 타입변환
		ib.name("쯔위");
		InterfaceA ia=(InterfaceA)z3;	//InterfaceA로 타입변환
		ia.methodA();
		
		
		
		
		iAmethod(x2);
	//	iAmethod(y2);	//InterfaceA 구현체가 아님
		iAmethod(z2);
		iAmethod(z1);
		iAmethod(x1);
		//iAmethod(z3);	//참조타입이 InterfaceB라서 안됨
		
		iBmethod(y1);
		iBmethod(y2);
		iBmethod(z1);
		//iBmethod(z2); 오류 변수참조타입이 InterfaceA
		iBmethod(z3);
		
	}
	
	//다형성 구현예 : 메소드 인자 타입인 	InterfaceA
	//InterfaceA 구현채는 모두 인자로 전달가능
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
		
	}
	
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
		
	}
	
	
}
