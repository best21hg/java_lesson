package koreait.day09a;


/*
 * 클래스의 상속
 * -> 클래스간의 부모(상위클래스 , super) 자식(하위클래스)관계가 만들어집니다.
 * -> 부모의 클래스 구성요소를 자식이사용
 * -> extends 키워드를 사용하여 부모클래스를 지정합니다.
 * -> private 접근한정자는 상속안됩니다.
 * -> protected 는 다른페키지의 자식클래스가 상속받을수 있도록 합니다.
 * -> 현실세계에서 반려동물샵 운영. 데이터 저장을 위해서 클래스 정의.
 *  동물의 종류 개 고양이 햄스터 도마뱀 토끼 열대어 -> 하나의 그룹으로 Animal 클래스 정의하고 공통적인 요소정의
 *  -> 공통적요소가 아닌것은 구체적인 클래스로 정의(예, Cat,Dog, Rabbit,...) 그리고 Animal 클래스를 상속받습니다
 *  
 *  
 * 
 */
public class ClassA {

	int ab;
	String name;
	protected String title;
	
	
	void print() {
		System.out.println("ab= "+ab);
		System.out.println("name= "+name);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name=name;
	}
}
