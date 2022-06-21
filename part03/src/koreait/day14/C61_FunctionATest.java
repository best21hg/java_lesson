package koreait.day14;

import java.util.Random;

public class C61_FunctionATest {

	public static void main(String[] args) {

		//1)익명클래스 :추상메소드 개수 상관없습니다
		FunctionA fa =new FunctionA() {
			@Override
			public int methodA(int a, int b) {
				return a*b;
			}
			
		};
		System.out.println(fa.methodA(23, 11));
		
		//2. 람다식 추상메소드가 한개일때만 가능함 즉 함수현 인터페이스만 표현가능
		fa=(int a, int b) -> {
				return a+b;
		};
		
		System.out.println(fa.methodA(23, 11));
		
		fa= (int max, int min)-> {
			//min~max 범위의 난수만들어서 출력 
			Random r=new Random();
			return r.nextInt(max-min+1)+min; 
			
		};
		System.out.println(fa.methodA(999999, 11));
		
		
	}
}
