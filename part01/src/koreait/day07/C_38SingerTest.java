package koreait.day07;

public class C_38SingerTest {

	public static void main(String[] args) {

		Singer twice = new Singer();
		twice.name_eng="twice";
		twice.name_kor="트와이스";
		twice.debutYear=2015;
		twice.genre="kpop-GirlGroup";
		
		twice.members=new String[9];
		twice.members[0]="모모";
		twice.members[1]="나연";
		twice.members[2]="쯔위";
		
		System.out.println("twice members");
		twice.prinMembers();
		System.out.println("활동기간 : "+twice.actYears(2022)+"년");
		
		Singer beo =new Singer();
		
		beo.name_eng="beo";
		beo.name_kor="비오";
		beo.genre="Hiphop";
		beo.prinMembers();
		
		
		System.out.println(Singer.JOB +Singer.label);
		System.out.println(twice.toString());
		System.out.println(beo.toString());
		System.out.println(twice);//객채 참조 타입일때toString생략
		System.out.println(beo);
		
		
	}
}
