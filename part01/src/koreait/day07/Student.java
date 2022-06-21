package koreait.day07;

public class Student {


		int no;
		String name;
		int grade;
		Score Score; //다른클래스 객체를 필드 (구성요소)로 갖게 됩니다.
		
	
		
		//인자로 전달받은 값을 전역변수(필드=객체의 특성을 나타내는 구성요소)에 대입
		void setData(String name , int grade) {
			this.name=name;
			this.grade=grade;
		}
		
		
		
		
		
		@Override
		public String toString() {
			return "Student [no=" + no + ", name=" + name + ", grade=" + grade + 
					", Score=" + Score + "]";
		}
		
		
}
