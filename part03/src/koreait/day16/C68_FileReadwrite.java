package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception 처리 명령이 별도 메소드에서 정의될때 다른 방법:
public class C68_FileReadwrite {
	//main 메소드가 throws Exception 한다면 jvm에게 넘깁니다. 처리내용은 printStackTrace결과와 동일
	
			//throws FileNotFoundException쓰면 try~catch문 안쓰고도 예외처리가능 자동으로 예외처리해줌
	public static void main(String[] args)  throws FileNotFoundException { 	//대부분 메인에서는 try ~catch쓴다
		
		String filename = "E:\\iclass05\\자바테스트0617.txt";
	
		fileWrite2(filename);	//어재했던 코딩에서 메소드로만 바꿈
	//	filename ="E:\\iclass05\\자바테스트0618.txt";	//없는 파일 태스트용
		fileRead(filename);
		
	}
	
	//메소드를 만들어서 예외처리
	
	//방법1: Exception을 try~catch 로 직접처리 합니다.
	public static void fileWrite(String filename) {
		
		File file = new File(filename);

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file); // file 로 지정된 위치에 출력을 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다");// System.out : 표준출력
		} catch (FileNotFoundException e) {
			//출력기능에는 파일이없으면 자동의로 파일이 만들어집니다
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		} finally {
			pw.close();
		}
	}
	//방법2: throws 키워드는 해당 Exception 을 호출한 곳으로 넘긴다.(떠넘긴다)
	// 		throws 뒤에 , 로 구분해서 여러개를 지정할 수 있습니다
	//		Exception 처리해야 할 메소드가 많이 정의되고 사용될 때 한곳에서 모두 처리할수 있습니다.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		
		File file = new File(filename);

		PrintWriter pw = null;
			pw = new PrintWriter(file); // file 로 지정된 위치에 출력을 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일출력 완료");
			pw.close();
		}

	public static void fileRead(String filename )throws FileNotFoundException {
		
		File file =new File(filename);
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
	}



}
