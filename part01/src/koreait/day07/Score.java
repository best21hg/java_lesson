package koreait.day07;

import java.util.Scanner;

public class Score {
	
	
		private int korean;
		private int english;
		private int science;
		private String grade;
		
		
		public Score(){
			
		}
		
	void input() {
			Scanner sc=new Scanner(System.in);
			System.out.print("국어 >>>"); this.korean=sc.nextInt();
			System.out.print("영어 >>>"); this.english=sc.nextInt();
			System.out.print("과학 >>>"); this.science=sc.nextInt();
		}
	
		int sum() {
			return (korean+english+science);
		}
		double average() {
			return (double)sum()/3;
		}
		@Override
		public String toString() {
			return "[korean=" + korean + ", english=" + english + ", science=" + science + "]";
		}
}
