package koreait.day14;

@FunctionalInterface
public interface FunctionA {
	int methodA(int a,int b);

	
}
//함수형 인터페이스 : 인터페이스 중에 *추상메소드가 1개인 것*은 다른 프로그래밍 언어에서 사용되는 함수 형식으로 표현할 수 있습니다.
//자바에서는 람다식이라고도 부릅니다.가독성, 간결성을 위해서 사용합니다.
//가독성 간결성을위해서 씁니다

//함수형 인터페이스 에서는 인자 리턴값이 중요하다
//자바에는 형식에 따라 사용할 수 있는 여러가지 함수형 인터페이스가 있습니다
//: Comsumer, Producer, Predicate
