package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {

		//대입문:x=100 오른쪽 값(리터럴)/수식/변수가 왼쪽 변수로대입
		//	산술연산 +, -, *(곱하기), /(나누기 몫), %(나누기 나머지,정수연산에서만 사용됨)
		//	관계연산	==(같다,동등), !=(같지않다),>,<,>=,<=
		//	논리연산	&&(and,그리고),	||(or,또는),	!(not)
		
		int a=123, b=10;
		double c=10.99;
		
		//피연산자가 둘다정수면 결과는 정수 (a정수)+(b정수)=정수
		//피연산자가 정수,실수면 실수 a(정수)+c(실수)=실수
		//
		
		
		int isum;
		double dsum;
		
		isum=a+b;
		dsum=a+c;
				
				System.out.println("a+b="+isum);
				System.out.println("a+c="+dsum);
				
	//			isum=a+c; //오류나옴 결과가 실수이므로 정수형변수 isum에 저장불가
				
	//		형변환(캐스팅): 정수+실수결과를 꼭 정수변수에 저장하려면
				// 실수를 정수로 변환해서 연산을합니다	
				//->프로그래머가 강재로 형변환
				
				isum=a+(int)c; //c변수의 실수값을 정수로 변환시킴(소숫값을 버림)
				System.out.println("a+(int)c="+isum);
				
				System.out.println("a/b="+(a/b));//정수끼리 나누면 결과정수
				System.out.println("a%b="+(a%b));//정수끼리 나누기의 나머지
				
				System.out.printf("%d / %d= %d\n",a,b,a/b);
				System.out.printf("%d %% %d=%d\n",a,b, a%b);//printf함수에서는 %(나머지)가 인식이안되서 한번더써줌
				
				//정수 형변환(캐스팅) //%f값은 printf에서 실수형 출력하는법
				//소숫점 6자리까지나옴 %.2f하면 소숫점 둘째짜리까지만 나옴
				System.out.println("정수/정수=실수 형식값으로 구합니다");
				System.out.printf("%d / %d = %f\n",a,b,(double)a/b);
				
				b=11;
				System.out.printf("%d / %d = %.2f\n",a,b,(double)a/b);
				
				double test=12.3456127456789;
				System.out.println("test="+test);
				System.out.printf("test=%f \n",test);
				System.out.printf("test=%.15f \n",test);
				
	}
	

}
