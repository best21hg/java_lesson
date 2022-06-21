package koreait.day03;
//안현기
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("n1:");
		int	n1=sc.nextInt();
		System.out.print("n2:");
		int	n2=sc.nextInt();
		System.out.print("n3:");
		int	n3=sc.nextInt();
		
		
		int max;
		int min;
		
		if(n1>n2) {
		max= n1;
		min=n2;
		}

		else {
		max=n2;
		min=n1;
		}
		
		if(max<n3) max=n3;
		if(min>n3)	min=n3;
		
		System.out.println("max="+max+","+"min="+min);
		
		
		
		
		
	}
}
