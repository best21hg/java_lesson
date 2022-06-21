package koreait.day11;

public class ClassX extends ClassAbs {

	
private int	num;

	//추상클래스 상속받은 자식(하위) 클래스는 반드시 추상메소드를 재정의 해야합니다.
	@Override
	public void test() {
		System.out.println("Class 의 test()");
		System.out.println("num="+num);
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	
}
