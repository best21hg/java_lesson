package koreait.day04;

public class C19_MethodTest {
	//main메소드 : 실행의 시작점. 프로그램 실행을 위해서는 꼭있어야할 메소드.static
	public static void main(String[] args) {
		
		int a=1;
		char b='a';
		System.out.println(a+b);
		
		System.out.println("메소드를 직접정의해서 사용해봅니다");
		System.out.println("프로그램은 메인메소드의 명령문을 순서대로 실행후 메소드 호출을 만나면 ");
		System.out.println("해당메소드로 이동후 해당메소드 실행이 끝나면 다시돌아옵니다 ");
		System.out.println("1.");
		methodA();
		
		System.out.println("2.");
		methodB(11,33);		//11과33은 메소드 실행에 필요한인자
		methodB(929,12);
		
		System.out.println("3.");
		methodC(929, 1.11);
		methodC(929,121);
		
		System.out.println("4.");
		methodD();		//반환값이 있는메소드이지만 main메소드에서 반환값지정을 (print)안했습니다
		System.out.println(methodD());	//반환값을 받아서 출력하는 예시.
		int temp = methodD();
		System.out.println("return = "+temp);
		
		System.out.println("5.");
		double temp2 =  methodE(1, 2.3);
		System.out.println("return = "+temp2);
		
		System.out.println("6.");
		System.out.println(methodF('i', 4));
		
		char ch='a';
		int val=3;
		ch=methodF(ch,val);
		System.out.println("return="+ch);
	}

public static void methodA() {
	System.out.println("##첫번째 메소드 정의 연습입니다.##");
	
}


public static void methodB(int a,int b) {
	System.out.println("##두번째 메소드 정의 연습니다.##");
	System.out.println("전달받은값 a="+a+",b="+b);
}


public static void methodC(int a,double b) {
	System.out.println("##세번째 메소드 정의 연습니다.##");
	System.out.println("전달받은값 a="+a+",b="+b);
}


public static int methodD(){//int는 반환값(return)이있는형식 : 반환값은 int 데이터, 반드시 return이필요합니다.
	System.out.println("##네번째 메소드 정의 연습니다.##");
	return 999;
}
public static int methodD(int a){//메소드 오버로딩 메소드의 이름과 리턴값은 위랑 같지만 인자값의 갯수와 형식이 다른것
	return 999;
}



public static double methodE(int a,double b){
	System.out.println("##다섯번째 메소드 정의 연습니다.##");

	return a+b;
}
public static char methodF(char ch, int size) {
	System.out.println("##여섯번째 메소드 정의 연습니다.##");

	return (char)(ch+size);
}

}

//String 클래스의 메소드를 이해	
/*
 * 메소드의 구조연습			
 * 
 * 메소드의 주요요소 : 반환값(형식), 인자(argument)또는 메개변수(parameter) ,메소드이름 
 * public static등의 설정
 * 
 * 반환값:메소드가 실행되면 얻어지는 결돠값 반환값(return)이 없으면 void
 * 인자: 메소드 실행을 위해서 필요한 데이터(형식과 변수명선언필요)
 * 메소드이름 :식별자
 * public: 접근변형자 
 * static: 정적요소
 * int 메소드는 리턴값이 존재함
 * 리턴값이없으면 print 출력이안됨
 * print리턴값을 출력할려면 print해야함
 * 
 */