package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {
		
//	String filename = "E:\\iclass05\\자바테스트.txt";
	String filename = "E:\\iclass05\\자바테스트2.txt";
		
	File file = new File (filename);
	
	//Scanner 입력 기능을 갖는 클래스
	Scanner sc=null;
	try {
		sc= new Scanner(file); //System.in : 표준입력
		
		/*
		System.out.println("파일에서 읽은 내용 : "+sc.nextLine());
		System.out.println("파일에서 읽은 내용 : "+sc.nextLine());
		System.out.println("파일에서 읽은 내용 : "+sc.nextLine());
		*/
		
		while(sc.hasNext()) { //반복문으로 읽어올 데이터가 있으면 true
			System.out.println(sc.nextLine());
		}
		System.out.println("파일읽기가 완료되었습니다");
	//	System.out.println("파일 출력이 완료되었습니다");//System.out : 표준출력 
	} catch (FileNotFoundException e) {
		
		//입력기능에는 파일이없으면 Exception이 발생합니다.
		e.printStackTrace();
		System.out.println("사용자 오류 발생 : "+e.getMessage());
		
	} finally {
		if(sc!=null)
	sc.close();
 }
}
}	
