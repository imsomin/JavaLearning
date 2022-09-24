//자바의 주요 클래스

//Calendar 클래스

//실습 문제
//오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//확인하여 결과를 출력하는 프로그램을 구현한다.
//※ 현재 날짜를 기준으로 날 수 더하는 연산 메소드 -> add

//실행 예)
//오늘 날짜 : 2022-2-3 목요일
//몇 일 후의 날짜를 확인하고자 하십니까? : 200

//===========[확인 결과]=============
//   200일 후 : xxxx-xx-xx x요일
//===================================


package High;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class day25_2 {
	
	public static void main(String[] args)
	{
		//Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//Calendar 클래스 기반 인스턴스 생성
		Calendar ob = Calendar.getInstance();

		//Calendar ob = new GregorianCalendar();

		int y;
		int m;
		int d;
		int w;
		int days;  //더해질 날짜 값  -->> 사용자로부터 입력받은 날 수

		String[] week = {"일", "월", "화", "수", "목", "금", "토"};


		//현재날짜 출력
		//int y; //연
		y = ob.get(Calendar.YEAR);

		//int m; //월
		m = ob.get(Calendar.MONTH)+1;   //★'+1' 

		//int d; //날짜
		d = ob.get(Calendar.DATE);

		//int w; //요일
		w = ob.get(Calendar.DAY_OF_WEEK);

		//현재 날짜 출력
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y,m,d,week[w-1]);
		//--> 오늘 날짜 : 2022-9-24 토

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			days = sc.nextInt();
		}
		while (days<1);


		ob.add(Calendar.DATE, days);

		/* 한번 더 초기화할 필요가 없게 됨 (밑의 구문으로 인해)
		y = ob.get(Calendar.YEAR);

		
		m = ob.get(Calendar.MONTH)+1; 

		
		d = ob.get(Calendar.DATE);

		
		w = ob.get(Calendar.DAY_OF_WEEK);
		*/


		//결과 출력
		System.out.println("\n===========[확인 결과]============");

		System.out.printf("%d일 후 : %tF %tA\n", days, ob, ob);    
		//날짜 객체 받는 건 %t
		//2022-05-14 -> %tF
		//토요일     -> %tA

		System.out.println("===============================");
				

	}

}

//결과
/*
오늘 날짜 : 2022-9-24 토
몇 일 후의 날짜를 확인하고자 하십니까? : 100

===========[확인 결과]============
100일 후 : 2023-01-02 월요일
===============================

*/

