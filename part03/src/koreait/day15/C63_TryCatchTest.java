package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {
	//	try 형식
		Scanner sc=new Scanner(System.in);

		
		try { 	//Exception 가능성이있는 명령을 작성
			//->오류생기면 catch로감
			//이위치에서 변수선언하면 try{}의 지역변수
		} catch(NullPointerException e) {//오류원인에 따른 Exception종류를 검사합니다
			//NullPointerException일때만 아래명령들 실행
			e.printStackTrace();//오류를 추적하기 위해 원인을 출력(기존Exception 출력내용)
		}catch(InputMismatchException e) {
				//catch는여러번 작성가능
		}finally {	//마지막으로 ,최종적으로 오류발생 상관없이 실행
			//주로자원을 해제하는 코드작성
			sc.close();
		}
		
	}

}
// 	try ~ catch 자원해제 방법을 finally 안쓰고  java 7 버전 부터 다른 구문형식 가능
//인터넷찾아서 해보고 공유폴데에 올림 관련된 인터페이스가 무엇인지도 찾아보기
//파일올리고 손들기




