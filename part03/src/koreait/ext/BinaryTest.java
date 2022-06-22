package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {

		System.out.println(String.format("%8s\t %8s\t %8s", "10진수","2진수","16진수"));
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i,Integer.toBinaryString(i),
				Integer.toHexString(i)));
		}
		
		/* Integer.toBinaryString(i) ->2진수로 전환
		/* Integer.toOctalSring(i) ->8진수로 전환 
		 * Integer.toHexString(i) ->16진수로 변환
		 * 
		 * int 형식은 4바이트 32비트  2진수는 32자리 , 16진수로는 8자리, 10진수로는 값번위 -2147483648 ~ 2147483647
		 * 						 16진수로는 00000000 ~FFFFFFFF(32비트가 모두1,-1 )
		 * 1000 0000 0000 0000 0000 0000 0000 0000는-2147483648
		 * 1111 1111 1111 1111 1111 1111 1111 1111는 -1
		 */
		
		
		
		
		
		
		
	}

}
