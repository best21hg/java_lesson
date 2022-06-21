package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//C43번 예제 리스트로 변경하기	//작성자 : 안현기
public class C48_MathList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int size=5;
		int max_size = MathProblem.max_size;
		
		ArrayList<MathProblem> problems=new ArrayList<MathProblem>();
		//문제저장 ArrayList
		
		int ans;
		int cnt=0;
		System.out.println("----------------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
			MathProblem temp =new MathProblem('+');
			temp.makeProb();  //n1 ,n2값이 겍체의 필드로 난수생성
			
			
			System.out.print("문제"+(i+1)+".  "+temp.problem()+"답 입력 ->");
			
			
			ans =sc.nextInt();
			if(ans ==temp.showAnswer()) {	//정답과 비교맞은 갯수 count
				cnt++;
				temp.setCorrect(true);
			}
			problems.add(temp);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("채점합니다. 맞은 갯수 "+ cnt+ " ( "+ (cnt*100/size)+"점 )");
		
		
		System.out.println(":::::틀린문제 정답:::::");
		/*	for (int i=0;i<problems.length;i++)	
				if(!problems.get(i).isCorrect())  //거짓이면 !연산으로 참으로 바뀝니다
				System.out.println("문제 "+(i+1)+".   "+problems[i].problem()
						+problems[i].showAnswer());
				*/
				
		//위에 for문을 for each로 바꿔서 출력하기
			for(MathProblem temp : problems)	//problems를 temp에 대입
				if(!temp.isCorrect()) 
			System.out.println(temp.problem() +temp.showAnswer());
				
			//우리가 정의 하는 클래스 
			//무슨 메소드가 필요한가?
			//필드? 
			//인스턴스 요소 스태틱요소 구분 (요소는 필드 메소드
			
			//자바의 클래스
			//메소드가 무엇이있나
			//생성자의 인자?
			
			
			sc.close();
	}

		
	}

