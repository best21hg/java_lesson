package koreait.day07;

public class Singer {
/*
 * 
 * 클래스 정의 하는것은 현실세계의 데이터를 처리하기 위한 형식을 저장
 * 
 */
	
	
	String genre;
	String name_eng;
	String name_kor;
	int debutYear;
	String[] members; 	//그룹일 경우 맴버이름들 저장
		
	static final String JOB ="연예인"; //변경안되는 상수
	static String label="🎆";//String 에게는 모두 동일한 라벨 표시
	
	void prinMembers() {
		if(members == null)
		System.out.println("그룹이 아닌 솔로 가수 입니다.");
		else
			for(int i=0;i<members.length;i++) {
				if (members[i]!= null)
		System.out.println((i+1)+":" +members[i]);
			}
	}
	int actYears(int year) {
		return year-debutYear+1;
	}
	public String toString() {
		return "Singer [genre="+genre+" name_eng="+name_eng+" name_kor="+name_kor;
		
		
	}
	
	
}
		
		
		
		
