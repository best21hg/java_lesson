package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer {
//token : 표식(최소단위)
	//Tokenizer : 토큰화 (최소단위의 표식으로 만들기. 구분기호가 기준)
	public static void main(String[] args) {

		String temp ="모모 90 88 79";
		
			
		//토큰화 : StringTozenizer 클래스의 기능 사용
		//구분기호는 기본문자: 공백, 탭, 줄바꿈
		StringTokenizer stk =new StringTokenizer(temp);
		System.out.println("1. nextToken 메소드");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println("hasMoreTokens? "+ stk.hasMoreTokens());
		
		//"모모 90 88 79"
		//           ↑(토크나이저의 포인터,nextToken 메소드 후 위치 이동)
		
		System.out.println("2. 반복문에서hasMoreToken 메소드");
		stk =new StringTokenizer(temp);	//토크나이저 객체다시생성
		while(stk.hasMoreTokens()) {	//다음에 읽어올 토큰이 있으면 true 없음 false
			System.out.println(stk.nextToken());
		}
		
		System.out.println("3. 여러가지 구분기호 사용하기"); //empty는 만들지 않습니다(split 과의 차이점)
		temp = "모모,90 88()79";		//빈문자가 생성안됨 토크나이저와 스플릿의차이점
		stk =new StringTokenizer(temp, ",()"); //()안에 두번째 인자는 구분기호문자(정규식아님)
		while(stk.hasMoreTokens()) {	
			System.out.println(stk.nextToken());
		}
		
		System.out.println("4. 토큰화 데이터로 객체 만들기");
		temp ="모모 90 88 79";
		stk =new StringTokenizer(temp);
		Score score=null;
		while(stk.hasMoreTokens()) {
			score =new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			
		}
		
		System.out.println("생성된 score객체 : "+score);
		System.out.println("총점 : "+score.sum());
		System.out.println("평균 : "+score.average());
		System.out.println("학점 : "+score.getGrade());
		System.out.println();
		
		
		
		//List로 객체만들기
		temp ="모모 90 88 79\n나나 78 83 79\n신비 92 73 66";
		stk =new StringTokenizer(temp);
		List<Score> scores =new ArrayList<>();
		while(stk.hasMoreTokens()) {
			score =new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			scores.add(score);
		}
		//split 객채만들기? 어떻게? for문사용
		String[] result = temp.split("[ \n]");	//정규식
		System.out.println(Arrays.toString(result));	//result배열출력
		System.out.println(scores); 
		
		for(int i=0;i<result.length;i+=4) { //4씩증가
			Score s=new Score(result[i+0],
					Integer.parseInt(result[i+1]),
					Integer.parseInt(result[i+2]),
					Integer.parseInt(result[i+3])
					);
					scores.add(s);
		}
		System.out.println("메소드 결과 split : "+scores);
		
		
	}
}
