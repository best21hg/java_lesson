package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {

		System.out.println("오늘의 저녁메뉴 투표합니다. !!!");
		String foods="치맥, 떡복이, 곱창, 불고기, 햄버거 ,오징어물회";
		
		
		//key는 : 메뉴이름, value : 투표수

		//초기화
		HashMap<String,Integer> map=new HashMap<>();
		map.put("치맥", 0);
		map.put("떡복이", 0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
		Scanner sc=new Scanner(System.in);
		//메뉴선택 반복
		
		
		while (true) {
			System.out.println(foods);
			System.out.println("선택 메뉴 음식명 입력하세요.(종료는 end입력) ");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;	//문자열은 equals비교
			
			if(!map.containsKey(menu)) {
				System.out.println("없는 메뉴입니다.");
				map.put(menu, 1); foods+=","+menu;
				continue;
			}
			
			
			//입력받은 menu의 value값을 가져오기 -> +1하기 -> 결과를 저장하기.
			int temp =map.get(menu); //음식 투표횟수 저장 
		
			map.put(menu, ++temp);
			
		}
		
		System.out.println("투표 종료합니다");
		System.out.println(map);
	System.out.println("최대 득표수 : " + Collections.max(map.values()));	
	
	
	//	System.out.println("최대득표 메뉴 : "+Collections.max(map.entrySet(),(m1, m2) -> m2.getValue() - m1.getValue().getKey() ));
		
		
		
		
		
		
		
		
		
		
		
	}
}
