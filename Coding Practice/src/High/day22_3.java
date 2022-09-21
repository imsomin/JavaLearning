//자바의 주요(중요) 클래스

//Object 클래스


package High;

class NewCar
{
	private int velocity;    //자동차의 속도
	private int wheelNum;    //자동차의 바퀴 갯수
	private String carName;  //자동차의 이름

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}



public class day22_3 {


	public static void main(String[] args)
	{

		NewCar nCar1 = new NewCar(80, "아반떼", 4);
		NewCar nCar2 = new NewCar(150, "그랜저", 4);

		//equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1 == nCar2));
		//실행결과
		/*
		1-1 : false
		1-2 : false
		*/

		//객체 복사 --> 얕은 의미의 복사(참조형) -> 주소값 복사
		NewCar nCar3 = nCar1;
		
		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		//실행결과
		/*
		2-1 : true
		2-2 : true
		*/


		//toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		//실행결과
		/*
		3-1 : High.NewCar@7852e922
		3-2 : High.NewCar@4e25154f
		3-3 : High.NewCar@7852e922
		*/

		//hashcode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		//실행결과
		/*
		4-1 : 2018699554
		4-2 : 1311053135
		4-3 : 2018699554
		*/
		//결과값을 16진수 형태로 바꾸게 되면
		//'toString()' 메소드가 반환한 결과값 확인 가능.

		//getClass()  //생성된 Car 메소드의 기본값이 무엇이냐를 알려주는 메소드
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		//실행결과
		/*
		5-1 : class High.NewCar
		5-2 : class High.NewCar
		5-3 : class High.NewCar
		*/
		//--> 생성된 객체를 통해 
		//    해당 객체를 기반 설계도를 확인할 수 있는 기능을 가진 메소드

		//clone()     -->> 객체 복사

		//finalize()  -->> 객체 직렬화

		//기타 나머지 메소드는 thread 처리와 관련이 있다.


	}
	
	
	
}
