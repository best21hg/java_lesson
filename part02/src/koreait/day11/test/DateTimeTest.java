package koreait.day11.test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//현재시간 :ms, ns (1970년 1웡1일 자정을 기준으로 단위마다 카운트한 값입니다.)
		
		//1일 , 1년은 각가 몇 ms 일까요? 1초=1000ms(1ms=0.001초)
		
		int result = 24*60*60*1000;
		System.out.println("1일은 "+ result + "ms 입니다.");
		
		//int 범위벗어나면 overflow 입니다. long변환 필요 
		System.out.println("1년은 "+ result*365L + "ms 입니다 " );
		
		DecimalFormat df =new DecimalFormat("###,###,###,###");
		System.out.println("1년은 "+ df.format(result*365L)+"ms 입니다");
		System.out.println("1일은 "+ df.format(result)+"ms 입니다");
		
		//String.format("%15s", ~)으로 하면 자리 정렬 위치를 맞출수 있습니다
		
		/*
		 * 날짜와 시간형식을 다루는 자바클래스를 연습합니다.
		1)java.util.Date 클래스  
		2)java.util.Calendar 클래스
		3) java 8 버전  java.time.LocalDate(날짜) , LocalTime(시간) , LocalDateTime(날짜와 시간) 클래스
		4) java.sql
		 * 
		 */
		
		LocalDate currentDate =	LocalDate.now();	//static 매소드로 객체를 생성
		System.out.println("날짜 확인 : " + currentDate);
		
		LocalTime currentTime =LocalTime.now();
		System.out.println("시간확인 : "+currentTime);
		
		LocalDateTime current =LocalDateTime.now();
		System.out.println(" 날자와 시간확인"+current);
		
		LocalDate mybirth =LocalDate.of(1929, 11,29 );
	System.out.println("내생일 :"+mybirth);
	
		LocalTime mybirth_time =LocalTime.of(18, 10);
		System.out.println("내 탄생시간"+mybirth_time);
		
		//날자 사이에 간격계산 클래스가 있습니다
		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난지"+between.getYears()+"년(years)");
		System.out.println("내가 태어난지"+between.getMonths() +"개월(months)");
		System.out.println("내가 태어난지"+between.getDays() +"일(days)");
		
		System.out.println("테스트 : "+ChronoUnit.DAYS.between(mybirth, currentDate)+"일 지났습니다");
		
		
		//Duration 클레스
		
		
	}
	
	
	
	
}
