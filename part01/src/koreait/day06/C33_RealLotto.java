package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자 : 안현기- 파일 제출합니다. 
	public static void main(String[] args) {
		//로또번호 생성
		int[] numbers = new int[45];
		Random r=new Random();
		
		for(int i=0; i<45;i++) {	//인덱스 범위
			numbers[i]=i+1;		//값 범위
		}
		
		System.out.println("numbers 배열 초기값---------------------");		
		System.out.println(Arrays.toString(numbers));	//배열 초기값 출력
		System.out.println("-------------------------------------");
		
		int[] lotto =new int[6];	//로또번호 배열생성
		int k;		//정수형변수 k생성
		for(int cnt=0; cnt<6;cnt++) {		//for문을 사용해서 로또번호 생성
			
			k=r.nextInt(45-cnt);	//중복되지 않게 뽑는범위를 줄인다
			System.out.println("k="+k+",number ="+numbers[k]);		//뽑힌번호값 
			
			lotto[cnt]=numbers[k];		//뽑힌번호값을 최종 선택숫자값에 넣는다
			
			for(int i=k;i<numbers.length-1;i++) {	//뽑힌값을 없엔다
				numbers[i]=numbers[i+1];	
				
			}
			System.out.println(Arrays.toString(numbers));	//numbers배열 문자열로출력
		}
		
		
		System.out.println("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto);   		//lotto 배열값의 크기순서대로 위치를변경
		System.out.println(Arrays.toString(lotto));		//오름차순으로 출력
	}
}
