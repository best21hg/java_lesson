package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers =
				new ArrayList<>();
		
		
		for(int i=0; i<45;i++) {	//인덱스 범위
			numbers.add(i+1);		//값 범위
		}
		System.out.println("numbers");
		System.out.println(numbers);		//thString이 재정의
		
		Random r= new Random();
		
		ArrayList<Integer>	lotto =
				new ArrayList<Integer>();
		
		int k; //난수로 뽑힐값 인덱스
		
		for(int cnt=0; cnt<6; cnt++ ) {
		k=r.nextInt(45-cnt);
		System.out.println("k="+k + " number=" + numbers.get(k));
			lotto.add(numbers.get(k));
		numbers.remove(k);
		System.out.println("남은 공");
		System.out.println(numbers);
		}

		System.out.println("최종 선택 숫자 6개");
		System.out.println(lotto);
		
	}
	//배열은 크기가 고정 값을추가삭제하는 메소드가없음
	//웹프로그래밍 할때 ArrayList가 해결가능 ArrayList가 필수 
	
	
}
