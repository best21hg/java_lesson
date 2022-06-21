package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
//난수를 발생하는 랜덤 클래스의 메소드를 태스트합니
	public static void main(String[] args) {
			Random r= new Random(); //Random클래스의 객체생성 (new 새로운 객체를생성)
		
			System.out.println("1. 정수형 랜덤값 10개출력");
		for(int i=0;i<10;i++) {
			int inum = r.nextInt(); //int 범위안에서 값이나옴
			System.out.println(inum);
		}
			
			System.out.println("1. 정수형 랜덤값 10개 출력- bound(경계값) 있음");
			for(int i=0;i<10;i++) {
				int inum = r.nextInt(100); //0<=100 범위의 난수가 나옴
				System.out.println(inum);
			}
						
			//n보다 크거나 같고 m보다 작은 범위 난수 
						
				System.out.println("4. 2~45 범위의 값으로 난수 10개");		
				for(int i=0;i<10;i++) {
					int inum = r.nextInt(44)+2;
					System.out.println(inum);
				}
				
				
			}
	}

