//자바의 주요 클래스

//Calendar 클래스

/*
- Calendar 클래스는 추상 클래스다
그러므로 객체를 생성할 수 없다.
(추상 클래스 : 미완성된 클래스)

- Calendar ob = new Calendar();
-> 이와 같은 구문을 통해 인스턴스 생성 불가!

- Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법
  1. Calendar ob1 = Calendar.getInstance();
  
  2. Calendar ob2 = new GregorianCalendar();
	-> GregorianCalendar는 생성자다.
  	-> GregorianCalendar라는 클래스가 있겠다.
  	-> GregorianCalendar는 Calendar클래스를 상속받는다.
    -> 추상메소드를 완성해서 GregorianCalendar 자신은 추상 클래스 꼬리표를 떼내었다.
  	-> Calendar ob2 = new GregorianCalendar(); 
  	-> 해당 구문은 업캐스팅 생성 구문이다.

  3. GregorianCalendar ob3 = GregorianCalendar();

  (※ GregorianCalendar : Calendar 클래스의 하위 클래스)
*/

// 연, 월, 일, 요일을 Calendar 객체로부터 가져와서 출력한다!

package High;

import java.util.Calendar; //import 구문 필요하다!

import java.util.GregorianCalendar;

public class day25 {
	
	public static void main(String[] args) 
	{

		//Calendar 클래스 기반 인스턴스 생성
		//Calendar ob = new Calendar();   -->> 불가
		Calendar rightNow = Calendar.getInstance();

		//생성된 달력(Calendar) 인스턴스를 통해
		//날짜 관련 정보를 얻어낼 수 있는 메소드 -> get()

		int y = rightNow.get(Calendar.YEAR);
		//static -> Calendar.
		//final  -> YEAR(=> 대문자)

		System.out.println(y);
		//--> 2022

		int m = rightNow.get(Calendar.MONTH)+1;  //'+1' 하는 것 체크!!!
		//-> 0을 가져오면 1월
		//   1을 가져오면 2월

		System.out.println(m);
		//--> 9 

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--> 24 (오늘 날짜는 9월 24일)

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--> 7 (토요일)

		//위 구문으로 요일 알아내기
		System.out.println(Calendar.SUNDAY);    //1
		System.out.println(Calendar.MONDAY);    //2
		System.out.println(Calendar.TUESDAY);   //3
		System.out.println(Calendar.WEDNESDAY); //4
		System.out.println(Calendar.THURSDAY);  //5
		System.out.println(Calendar.FRIDAY);    //6
		System.out.println(Calendar.SATURDAY);  //7
		//모두 다 static & final로 요일을 확인할 수 있도록 존재하고 있다

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--> 2022-9-24 7
		
		String week = "";
		switch (w)
		{
			/*
			case Calendar.SUNDAY : week = "일요일"; break;
			case Calendar.MONDAY : week = "월요일"; break;
			case Calendar.TUESDAY : week = "화요일"; break;
			case Calendar.WEDNESDAY : week = "수요일"; break;
			case Calendar.THURSDAY : week = "목요일"; break;
			case Calendar.FRIDAY : week = "금요일"; break;
			case Calendar.SATURDAY : week = "토요일"; break;
			*/

			case 1 : week = "일요일"; break;
			case 2 : week = "월요일"; break;
			case 3 : week = "화요일"; break;
			case 4 : week = "수요일"; break;
			case 5 : week = "목요일"; break;
			case 6 : week = "금요일"; break;
			case 7 : week = "토요일"; break;
		
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--> 2022-9-24 토요일

		
		System.out.println("--------------------------------------------------");


		//Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		//달력의 날짜 세팅 -> 'set()' 메소드 활용
		rightNow2.set(2022, 8, 24);   //  11월 3일 -> 집어넣을 때는 '-1'을 꼭 해준다


		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--> 7

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--> 토요일


	}

}
