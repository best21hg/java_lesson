package koreait.day08;
//작성자 안현기

public class Member{

	private String name;
	private String email;
	private	int age;
	private int level;
	
	//name email 필드초기화 하는 커스텀 생성자
	public Member(String name,String email) {	
		this.name=name;
		this.email=email;	
	}
	
	/*
	public Member(String name) {	오류 메소드 오버로딩   생성자 메소드:타입과 매개변수 갯수를 가지고 구분하기 때문에
		this.name=name;
	}
	public Member(String email) {	생성자이름 갯수 타입이같아서 오류가뜸
		this.email=email;	
	}
	오류 메소드 오버로딩  
	*/ 
	
	//기본(default) 생성자 :출력문 추가
	public Member() {	
		System.out.println("name,email,age,level 필드는 기본값입니다.");
		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
		

	
	
	
	
	
	
		
		
	}
