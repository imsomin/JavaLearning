//지역변수와 전역변수

//지역 변수의 초기화 테스트

//지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
//자바가 자동으로 초기화를 수행해 주거나 하지 않는다.

//변수는 개인저장공간인 지역변수(local variable)와
//공용저장공간인 전역변수(global variable)가 있다.

//모든 오브젝트에서 사용하기 위한 변수를 전역변수로,
//해당 오브젝트에서만 사용하기 위한 변수를 지역변수로 생각하면 된다.

package Base;

public class day10 {
	

	//클래스 영역


	public static void main(String[] args) 
	{
		//메소드 영역

		//지역변수 n
		int n;
		//-- 선언 후 초기화 과정을 거치지 않은 상태

		//System.out.println("n : " + n); 
		//-->> 컴파일 에러 발생
		//-->> error: variable n might not have been initialized
		//-->> 지역 변수 n에 접근하여 그 값을 출력하고자 하는 구문
	}

	//클래스 영역


	/*
	다른메소드1()
	{
		//메소드 영역
	}
	*/

	/*
	다른메소드2()
	{
		//메소드 영역
	}
	*/

}
