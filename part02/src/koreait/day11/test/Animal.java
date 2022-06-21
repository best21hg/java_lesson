package koreait.day11.test;

abstract public class Animal {
	//미리약속된 상수값으로 
	static final int CAT =1;
	static final int DOG =2;
	static final int CROW =3;
	static final int FROG =4;
	static final int SNAKE =5;
	
	
	
	private String name;
	private String color;
	protected int type;
	
//	Animal d=new Animal(); 추상클래스로는 객체생성 불가능
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	//추상메소드로 변경
	abstract public void act();	//Animal의 행동을 정하기위한 메소드
	
	
	//또 다른 추상메소드도 만들어 보세요.
	
	public void print() {
		System.out.println("name:" + name +",color:"+ color);
	}
	
	
	@Override					
	public String toString() {	// 인스턴스의 이름을 출력했을떼 나오는값을 지정함
		return "Animal [name=" + name + ", color=" + color+"]";
	}
	
							//문자열형식으로 정함 입력값과 리턴값이있는 메소드 
							//추상메서드는 구현부만 정하고 실행부는 상속받는 클래스에서 정함
	abstract public String eat(Object object); //Animal의 먹이를 정하는 메소드
	
	
	abstract public void powerlevel(); //Animal의 전투력
	
	//Object 설명하고 작성한 메소드 입니다.
	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}