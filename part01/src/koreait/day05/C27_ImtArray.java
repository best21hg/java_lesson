package koreait.day05;

import java.util.Arrays;

public class C27_ImtArray {


	public static void main(String[] args) {

		//베열선언
		int[] arr1= {67,45,98,12,45,66,95};
		int[] arr2=new int[7]; //베열의 크기만 설정 //기본값은0
		
		System.out.println("\n배열 요소값 1개출력(인덱스 3번)");
		System.out.println("arr1[3]="+arr1[3]);
		System.out.println("arr2[3]="+arr2[3]);
		
		
		System.out.println("\n배열 요소값 1개출력(인덱스 3번)");
		arr1[3]=999;
		arr2[3]=999;
		
		//선언된 배열의 값을 모두 출력할 수 있는 문자열로 변환시키는 메소드
		String temp=Arrays.toString(arr1);	//toString은 static 메소드
		System.out.println("arr1:"+temp);
		System.out.println("arr2:"+Arrays.toString(arr2));
		
		//출력예시 arr1[0]=67로 모든값출력 ->for문
		System.out.println("\nfor문으로 배열요소값 출력(arr1)");
		for(int i=0;i<7;i++) 
			System.out.println("arr1["+i+"]="+arr1[i]);
		
		System.out.println("\nfor문으로 배열요소값 출력(arr2)");
		for(int i=0;i<arr2.length;i++) {
			String t = String.format("arr2[%d]= %d",i,arr2[i]);
			System.out.println(t);
			//System.out.printf("arr2[%d]= %d\n",i,arr2[i]);
		}
		
		System.out.println("\n배열의 크기(바이트)");
		System.out.println("arr1 배열 : "+arr1.length*Integer.BYTES+"바이트" );
		System.out.println("arr2 배열 : "+arr2.length*Integer.BYTES+"바이트" );
		
		System.out.println("\n내가 만든 메소드로 배열값 출력");
		arrayPrint(arr1, "arr1");
		arrayPrint(arr2, "arr2");
		
		
	}
	
	public static void arrayPrint(int[] array,String name) {//인자 :int 배열, String2개
		for(int i=0;i<array.length;i++) {
			String t = String.format("%s[%d]= %d",name,i,array[i]);
			System.out.println(t);
			
	}
	}
}
