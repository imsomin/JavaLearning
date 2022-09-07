package Base;

public class day10_1 {
	
	//클래스 영역

		//전역 변수 선언
		int a;             
		//-->> 클래스 변수 아님
		//-->> 자동으로 0으로 초기화 지원
		
		//클래스 영역에 존재하는 전역변수(클래스 전역에 걸쳐 사용가능한 변수)
		//클래스 영역에는 인스턴스변수(instance variable)와 클래스변수(class variable)가 존재하고,
		//메서드 영역에는 지역변수(location variale)가 존재한다.
		
		//여기서 인스턴스변수와 클래스변수의 큰 차이점은 static이 붙어 있냐 안 붙어 있냐의 차이이다.
		//붙어있으면 클래스변수, 붙어있지 않으면 인스턴스변수이다.
		//클래스 변수 -> 객체생성을 하지 않고도 사용가능(static을 붙였으므로)
		//인스턴스 변수 -> 객체생성을 해야 사용가능

		boolean b;

		char c;

		double d;
		
		int alpha = 7;  //인스턴스 변수
		static double beta;  //클래스변수

		public static void main(String[] args) 
		{
			//메소드 영역
			System.out.println("여기는 지역변수");
			int lv;
			
			//System.out.println("a : " + a);
			//컴파일 에러 발생 
			// error: non-static variable a cannot be referenced from a static context

			//day10_1 클래스를 기반으로 객체(object) 생성
			//--인스턴스 변수는 인스턴스를 생성할 때 만들어지는데
			//  이 인스턴스 변수에 값을 저장하거나 불러 오려면
			//  메인 영역에서 객체를 생성해야 한다. ★★★
			day10_1 ob = new day10_1();
			//ob라는 참조 변수를 통하여 
			//인스턴스 변수(위에서 a,b,c,d,alpha에 해당)에 값을 저장하거나 독립적인 저장공간을 만들수 있다.

			System.out.println("ob.a : " + ob.a);
			//==>> ob.a : 0
			//-->> 자동으로 0으로 초기화 지원
			
			System.out.println("ob.b : " + ob.b);
			//==>> ob.b : false

			System.out.println("ob.c : " + ob.c);
			//==>> ob.c : 

			System.out.println("ob.d : " + ob.d);
			//==>> ob.a : 0.0
			
			System.out.println("ob.alpha : " + ob.alpha);
			//==>> ob.alpha : 7
			//값을 읽어 오거나 새로 저장하기 위해 인스턴스 변수를 사용하려면 무조건 객체를 만들어야 한다!!!
		}

		/*
		다른 메소드1()
		{
		}
		*/

		/*
		다른 메소드2()
		{
		}
		*/

}


//결과
/*
여기는 지역변수
ob.a : 0
ob.b : false
ob.c : 
ob.d : 0.0
ob.alpha : 7
*/



