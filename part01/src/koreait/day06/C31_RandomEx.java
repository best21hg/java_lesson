package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서 작성
		 *  학생인원은 100명 - 점수는 랜덤
		 * 
		 *   90~100 : 0 명( 소수점 한자리%) counts[0]  카운트변수가 5개 필요합니다
		 *   80~89 : 0 명( 소수점 한자리%)	counts[1] 
		 *   70~79 : 0 명( 소수점 한자리%)counts[2] 
		 *   60~69 : 0 명( 소수점 한자리%)counts[3] 
		 *   60점미만 : 0 명( 소수점 한자리%)counts[4] 
		 */
		
		
		int[] koreans = new int[200];
		int counts[]=new int[5];
		Random r= new Random();
		
		for(int i=0;i<koreans.length;i++)
		koreans[i]=r.nextInt(101); //국어점수 저장
		
		System.out.println(Arrays.toString(koreans));
		// 점수 분포 카운트 하기
		for(int i=0;i<koreans.length;i++) {
			if(koreans[i]>=90 && koreans[i]<=100) {
				counts[0]++;
			}
			else if(koreans[i]>=80 && koreans[i]<=89) {
				counts[1]++;
			}
			else if(koreans[i]>=70 && koreans[i]<=79) {
				counts[2]++;
			}
			else if(koreans[i]>=60 && koreans[i]<=69) {
				counts[3]++;
			}
			else {
				counts[4]++;
			}
				
		}
		
		//점수 분포결과 출력하기
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
		 System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60미만");
		System.out.println("---------------------------------------------------------");
		
		for(int i=0;i<counts.length;i++) {
		System.out.printf("%8d",counts[i]);	
			
		}
		System.out.println("\n소수점 한자리%로 나타내기");
		for(int i=0;i<counts.length;i++) {
			
		System.out.println(String.format("%.1f",(double)counts[i]/200*100)+"%");
		
		}
		
		
	
	}
}