//자바의 주요 클래스

//Calendar 클래스

/*
- java.util.Calendar 클래스는
날짜와 시간을 객체 모델링화 한 클래스로
연, 월, 일, 요일, 시, 분, 초 까지의
시간과 날짜와 관련된 정보를 제공한다.
그리고, Calendar 클래스는 추상클래스이므로 
직접 객체를 생성할 수 없으며 실제적인 메소드 구현은 
Calendar 클래스의 서브 클래스인
GregorianCalendar 클래스에 정의되어 있다.

- 시스템으로부터 현재 시스템 시간 정보를 얻어올 때 getInstance() 라는 
정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며
이 객체가 생성되면 갖고있는 시간 정보들을
get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

- getInstance() 메소드는 내부적으로 
GregorianCalendar 객체를 생성하여 돌려주기 때문에 
GregorianCalendar 객체를 직접 생성하여 
시간 정보를 구할 수도 있다.
*/

//실습 문제
//사용자로부터 연, 월을 입력받아
//달력을 그려주는(출력하는) 프로그램을 구현한다.
//단, 만년달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.
//'getActualMaximum()' 메소드 활용

//실행 예)
//연도 입력 : 0
//연도 입력 : 2022
//월 입력   : -2
//월 입력   : 16
//월 입력   : 7

/*
    [2022년 7월]

일 월 화 수 목 금 토
====================
                1  2
 3  4  5  6  7  8  9
10 11 12 13 14 15 16
17 18 19 20 21 22 23
24 25 26 27 28 29 30
31
====================
*/

package High;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;


public class day25_1 {
	
	public static void main(String[] args) //throws IOException
	{

		//인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Calendar ob = new GregorianCalendar();
		Calendar ob = Calendar.getInstance();



		//변수 선언
		int y, m;   //연, 월
		int w;      //요일
		int i;      //루프변수

		/*
		//객체 생성
		//int y; //연도
		int y = ob.get(Calendar.YEAR);

		//int m; //월
		int m = ob.get(Calendar.MONTH)+1; 

		//int d; //날짜
		int d = ob.get(Calendar.DATE);

		//int a; //요일
		int a = ob.get(Calendar.DAY_OF_WEEK);

		//int h; //최대 날짜
		int h = ob.getActualMaximum(Calendar.DATE);

		//테스트
		System.out.println(y + "-" + m + "-" + d + " " + a + "," + h);
		//--> 2022-9-24 7,30
		*/


		
		//연산 처리(반복)
		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();    //y = Integer.parseInt(br.readLine());
		}
		while (y<=0);  //y<1

		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);  //'월'은 1보다 작지 않고 12보다 크지 않아야 한다.


		//사용자로부터 입력받은 연(y), 월(m)을 이용하여
		//달력의 날짜 세팅
		ob.set(y, m-1, 1);
		//월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//입력값에서 1을 뺀 값으로 월을 설정해야 한다.

		//일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다

		//세팅된 달력의 날짜로부터 요일 가져오기
		w = ob.get(Calendar.DAY_OF_WEEK);

		//확인
		System.out.println(w);
		//연도 입력 : 2022
		//월   입력 : 6
		//4         -> 수요일(6월 1일)


		//결과 출력
		System.out.printf("\t[%d년 %d월]\n" , y, m);
		System.out.printf(" 일      월      화      수      목      금      토");
		System.out.println("\n===========================\n");

		for (i=1; i<w; i++)
		{
			System.out.printf("    ");   //공백 4칸 발생
		}
		
		//테스트
		//System.out.printf("%4d", 1);

		
		for (i=1; i<=ob.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;    //'4'에서 머무는 것이 아니라 하나씩 증가해줘야 하기 때문에
			        //반복문을 수행하며 날짜가 증가할 때마다
				    //요일도 함께 증가할 수 있도록 처리
				    //증가한 요일이 일요일이 될 때마다
				    //개행할 수 있도록 처리
			if(w%7==1)
			{
				System.out.println();
			}
		}

		if (w%7!=1)                   //일요일 개행이 적용되지 않았을 경우만
		{
			System.out.println();     //개행 적용
		}

		System.out.println("\n===========================\n");
		//실행 결과
		/*
			[2022년 6월]
 		일      월      화      수      목      금      토
		===========================

               		1   2   3   4
   		5   6   7   8   9  10  11
 	   12  13  14  15  16  17  18
  	   19  20  21  22  23  24  25
  	   26  27  28  29  30

	    ===========================
		 */
		
		


	}


}
