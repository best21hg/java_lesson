package koreait.day12;

public class Member {
	private String name;
	private int age;
	protected boolean valid;
	
	public Member(String name, int age) {
		this.age=age;
		this.name=name;
	}

	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Mamber [name=" + name + ", age=" + age + ", valid=" + valid + "]";
	}



	
	
	
	
	
}
