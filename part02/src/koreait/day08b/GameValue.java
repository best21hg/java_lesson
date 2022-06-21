package koreait.day08b;

import java.util.Random;

public class GameValue {	//게임기록 데이터를 저장히기위한 클래스

	private String gamer; //참가자 이름 
	private int count;	//게이머 시도횟수
	private boolean success;//맞추기 성공여부 기본값 false
	
	//커스텀 생성자  : gamer 초기값설정 -> 기본 생성자 사용불가
	public GameValue(String gamer){
		this.gamer=gamer;
	}
	
	//객체가 사용하는 인스턴스 메소드
	public void print () {
		System.out.println("gamer : "+gamer+","
				+ " 시도횟수 : "+count+",맞추기 성공여부 "+success);
	}
	
	public static int makeNumber(int min, int max) {
		Random r= new Random();
		return r.nextInt(max-min+1)+min;
	}

	public String getGamer() {
		return gamer;
	}

	public void setGamer(String gamer) {
		this.gamer = gamer;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
	
	
	
	
}
