package koreait.day07;

public class C_36C35Test {
//C35 클래스를1) 객체로 만들어서 2)static 인 것들 테스트합니다.
	public static void main(String[] args) {

		C_35GlobalVar test1 = new C_35GlobalVar();
		C_35GlobalVar test2 = new C_35GlobalVar();
		//C35클래스에서 static이 아닌 인스턴스 변수에는 객체마다 다른값을 저장합니다.
	test1.count=10;
	test2.count=20;
	
	test1.message="hi test1";
	test2.message="hellos test2";

	test1.mathodA();
	test2.mathodA();
	
	test1.mathodC(123);
	test2.mathodC(999);
	
	System.out.println("test1.count="+test1.count);
	System.out.println("test2.count="+test2.count);
	
	//static 요소테스트 : static 변수또는 메소드는 클래스 이름으로 사용
	
//	C_35GlobalVar.num=101;
	System.out.println("static num="+C_35GlobalVar.num);
	System.out.println("static num="+test1.num);
	System.out.println("static num="+ test2.num);
	
	//static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리영역(힙영역)은 다릅니다
	
	//상수 TEST확인
	System.out.println("TEST ="+C_35GlobalVar.TEST);
	//final은 값변경못합니다
	
	C_35GlobalVar test3=new C_35GlobalVar();
	System.out.println("test3.count="+test3.count);
	System.out.println("test3.message="+test3.message);
	System.out.println("C_35GlobalVar.point="+C_35GlobalVar.point);
	}
}