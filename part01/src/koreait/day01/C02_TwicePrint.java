package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("-----------------------------");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		
		//printf()출력형식 사용
		//printf()메소드에서 형식문자("%-12s%4d.%02d.%2d%5d) 겟숫만큼 뒤에쓰지않으면 오류발생
		//%-12s%s%5d 12칸 문자열 +자릿수 지정하지 않은 문자열+5칸정수
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",24);
		System.out.printf("%-12s%s%5d\n","nana","1997.06.14",27);
		
		//System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		//생년월일 "1998.05.28" 을 정수형식(데이터로)출력하도록 수정해봅시다.
		System.out.println("//////연습//////");//#####오늘가장중요한 주제###
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","dayeon",1998,05,28,25);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","momo",1999,04,23,24);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","nana",1997,06,14,27);
		//여기까지는 데이터를 직접 리터럴("momo", 1998, true...)로 출력해서 표현함
		
		
		System.out.printf("%-12s%s.%6s%1d\n","hello",1000,"현기",500);
		//진도 방향: 변수(대이터를 저장하고있는 기억장소)사용
		//System.out.printf("%-12s%4d%02d.%2s%5s\n",name,year,month,day,age);
	}
//,를써서 나눈다
}

//t\탭키  : \n 줄바꿈

//형식지정문자 %s(문자열) %d(정수) 자리수를 지정해서 채울수있습니다
//""안에숫자는 정수가아니라 문자열
// /*    */ 슬레쉬안에 내용은 주석처리