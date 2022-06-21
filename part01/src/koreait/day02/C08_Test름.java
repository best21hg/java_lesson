package koreait.day02;

public class C08_Test름 {

	public static void main(String[] args) {
	
	int	b=23,h=19;
		
	int A=b*h;
	System.out.println("사각형의 넓이="+A+"cm²");
	System.out.printf("사각형의 넓이=%dcm² \n", A);
	
	

	double r=23.230;
	final double π=3.14;
	double P=2*π*r;
	System.out.println("원의 둘레="+P);
	System.out.printf("원의 둘레=%.3fcm² \n", P);

	double S=π*r*r;
	System.out.println("원의 넓이="+S+"cm²");
	System.out.printf("원의 넓이=%.3fcm² \n", S);
	
	//final 테스트
	//		변수선언 앞에 final 키워드를 붙이면 값을 변경못함
	
	final int test=123;
	System.out.println("test="+test);
	
//	test=143; //final을붙여서 값을 변경할려하면 오류남
	
	}

}
