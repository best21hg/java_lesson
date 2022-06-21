package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter 작성해보기
					//값 예시: A+,A,B+,B....
	
	//기본생성자 숨어 있습니다.어떤 코드 일까요? 접근한정자는 public
	public Score() {
	}
	
	public Score(String name, int korean, int english, int science) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.science=science;
	}
	
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getGrade() + "]";
	}
	
	//인스턴스 메소드 
	public int sum() {
		int result=this.korean+this.english+this.science;
	
		return result;
	}
	
	

	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean메소드 실행객체
	}
	
	int getKorean() {
		return korean;
	}
	
	
	void setEnglish(int english) {
		this.english = english;
	}
	
	int getEnglish() {
		return english;
	}
	
	public	void setGrade() {
		if(average() >=90) this.grade="A";
		else if(average() >=80) this.grade="B";
		else if(average() >=70) this.grade="C";
		else if(average() >=60) this.grade="D";
		else this.grade="F";
	}
	
	double average() {
	return (double)sum()/3;
}

	String getGrade() {
		setGrade();
		return grade;
	}

	public void add(String score) {
		// TODO Auto-generated method stub
		
	}
	
}
