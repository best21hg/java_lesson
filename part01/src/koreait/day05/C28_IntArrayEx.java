package koreait.day05;

import java.util.Scanner;

//작성자: 안현기
public class C28_IntArrayEx {
	/*1.int 배열크기 5를 선언하세요. 이름은 nums
	 * 2.배열요소의 값은 사용자입력
	 * 3. 입력된 값의 합계, 평균을 구합니다.- >합계는 2번에서 입력받는 for문 안에서 수식 작성하세요
	 * 4. 입력된 값의 최댓값, 최솟값을 구하는 메소드를 만듭니다. 2개
	 * 		maxOfArray , minOfArray :인자는 int배열, 반환값형식 int
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int[] nums=new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("배열요소의 값입력:");
		nums[i]=sc.nextInt();
		sum=sum+nums[i];
		}
		
		float average = (float)(sum/nums.length);
		System.out.println("sum="+sum+",average="+average);
		
		sc.close();
		
	System.out.println("max="+maxOfArray(nums));	
		
	System.out.println("min="+minOfArray(nums));	
		
	}
	
	
	public static int maxOfArray(int[] array) {
		int max=array[0];
		for(int i=1; i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
				
			}
		}
		return max;
	}
	
	public static int minOfArray(int[] array) {
		int min=array[0];
		for(int i=1; i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
				
	}
	//max,min 변수를 각각 배열의 0번요소삾으로 초기화합니다
	//배열요소가 1번부터 마지막 요소까지 max,min과 순서대로 비교해서
	//max가 그값보다 작으면 (min이 그값보다 크면) max(min) 값을 배열요소값으로 변경합니다
	//비교가 끝나면 최종 max,min 결정이됩니다
}
		return min;
}
}