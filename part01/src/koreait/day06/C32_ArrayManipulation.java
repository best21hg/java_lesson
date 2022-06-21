package koreait.day06;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		//배열요소의 삽입/삭제 
		int[] test= {11,22,33,44,55,66,77};
		for(int i=0;i<test.length;i++)
		System.out.println(test[i] + "\t");
		System.out.println();
		
		//인덱스 k에 삽입할때  - 오른쪽 인덱스 증가 방향으로 이동
		int k=5;
		for (int i=test.length-2; i>=k;i--) {
			test[i+1]=test[i];
		}
		
		test[k]=23;
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i] + "\t");}
		
		
		//데이터 삭제
		int[] test2= {11,22,33,44,55,66,77};
		System.out.println("\n-------------------------");
		
		for(int i=0;i<test2.length;i++)
		System.out.println(test2[i] + "\t");
		
		//인덱스 2를 삭제할때- 왼쪽인덱스 감소방향으로 이동
		for(int i=k+1;i<test2.length;i++)
          	test2[i-1]=test2[i];
		
		System.out.println();
		
	}
}
