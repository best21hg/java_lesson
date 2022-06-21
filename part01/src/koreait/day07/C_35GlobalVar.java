package koreait.day07;

public class C_35GlobalVar {
	/*
	 * 지역변수(local variable) : 메소드, for, if,while 등등 {}에서 선언된 변수블록을 벗어나면 사용을 못함
	 * 전역변수(global variable) : 클래스{}에서 선언된변수
	 * 
	 * [전역변수를 static 여부로 구분]
	 * 클래스이름.변수명 static변수
	 * 객체를 만들어서 사용하는 this.변수명 (이때 변수는 인스턴스 변수) 객체화 시켜야지 사용가능
	 * 
	 * 전역변수는 클래스 또는 객체의 특성을 나타낼때 필드(또는 프로퍼티)라고 부릅니다.
	 */ 			//전역변수는 객체변수와 클래스 변수가있다
	int	count; //객체화 시켜야지 사용가능
	String message;
	static int num;//객체화를 시키지 않고도 사용이 가능하며
	static final int TEST =9999; //static final상수 선언할때 초기화 하지않으면 오류
	static double point;
	
	public static void main(String[] args) {//static 은 static끼리만 접근합니다
		int num=10; //메인 메소드에서만 사용
		System.out.println("num:"+num); //10
	//	System.out.println("message:"+message); //오류 static이 아닌 변수는 사용못함
	//	mathodA();오류 static이아닌 메소드
		mathodB();
	}
	public void mathodA() {	//static메소드가 아니므로 객체를 만들어서 사용하는 메소드
		int num=99;		//mathodA에서만 사용
		String message;
		System.out.println("num:"+num); //99
		System.out.println("message:"+this.message);//전역변수로 선언된 message 파랑
	}
	public void mathodC(int count) {
		this.count=count; //this는 new로만들어진 객체
	}
	public static void mathodB() {
		int num=99;		//mathodA에서만 사용
		//지역변수와 전역변수 이름이 같은경우. 지역변수(stack영역)를 가져옵니다
		System.out.println("num:"+num); //99
		System.out.println("num="+C_35GlobalVar.num); //Integer.BYTES 와 같은형태
		//전역변수로 선언된 num. static 일때는 클래스이름.변수명 / static이 아닐때는 this. 변수명
		
	}
}
