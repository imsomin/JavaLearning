//만년 달력 만들기(1)

//다음과 같은 기능의 프로그램을 구현한다.

//실행 예)
//『연도』를 입력하세요 : 2022
//『월』을 입력하세요 : 6

/*
문제분석

- 서기 1년 1월 1일 : 월요일

- 연도가 4의 배수이면서 100의 배수가 아니거나,
  400의 배수이면 2월은 29일(윤년),
  나머지 2월은 28일(평년)

- 만약 2022년 6월 달력을 그린다고 가정하면
  1.1.1 ~ 2022.5.31 까지의 날 수를 구한다.
  ------------------
  (1.1.1 ~ 2021.12.31) + (2022.1.1 ~ 2022.5.31)
    --> 여기다가 +1 을 하면 6월 1일의 요일 계산 가능
*/

package Medium;

import java.util.Scanner;

public class day16_2 {
	
	public static void main(String[] args)
	{
		int year, month;
		int yearDay = 0, monthDay = 0, totalDay = 0;
		int startWeek;
		int firstDay = 1;

		int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] week = {0, 1, 2, 3, 4, 5, 6};  //0 -> 일요일, 6 -> 토요일

		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();

		System.out.print("『월』를 입력하세요 : ");
		month = sc.nextInt();

		for (int i =1; i<year ; i++)
		{
			if(year%4==0 && year%100!=0 || year%400==0)
			{
			yearDay += 366;
			}
			else
			{
			yearDay += 365;
			}
		}



		if(year%4==0 && year%100!=0 || year%400==0)
		{
			monthArr[1] = 29;
		}

		for (int i=1; i<month; i++)
		{
			monthDay += monthArr[i-1];
		}

		


		//출력
		System.out.printf(" [%d년 %d월] \n\n", year, month);
		String[] name = {"일","월", "화", "수", "목", "금", "토"};

		for (int i=0; i<name.length; i++)
		{
			System.out.printf("%5s", name[i]);
		}

		System.out.printf("\n===============================\n");

		startWeek = (yearDay + monthDay + 1) % 7;

		for (int i=0; i<week[startWeek]; i++)
		{
			System.out.print(" ");

		}

		for (int i=week[startWeek]; i<week.length; i++)
		{
			System.out.printf("%3d", firstDay);
			firstDay++;
		}
		System.out.println();

		int j=0;
		for (int i=firstDay; i<=monthArr[month-1]; i++)
		{
			System.out.printf("%3d", firstDay);
			firstDay++;
			j++;
			if(j%7==0)
			{
				System.out.println();
			}
		}

		System.out.printf("\n===============================\n");


	}

}

//결과
/*
『연도』를 입력하세요 : 2022
『월』를 입력하세요 : 10
 [2022년 10월] 

    일    월    화    수    목    금    토
===============================
        1                           //※ 해결해야 할 부분!!! 
  2  3  4  5  6  7  8               //  2022년 10월 1일은 토요일인데 어긋나서 출력됨...
  9 10 11 12 13 14 15
 16 17 18 19 20 21 22
 23 24 25 26 27 28 29
 30 31
===============================

 */



