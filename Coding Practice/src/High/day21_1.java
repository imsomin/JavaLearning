//중첩 클래스

package High;


//outer
class Test2
{
	static int a = 10;  //--> 전역변수, Test2의 멤버변수, static 변수(클래스class 변수)
	int b = 20;         //--> 전역변수, Test2의 멤버변수, non-static변수(인스턴스instance 변수)    

	void write()  //--> 첫 번째 write 메소드 (b와 write는 탄생시점이 같다)
	{
		System.out.println("write()...(1)");
		//지역변수 c,d
		final int c = 20;  //c는 상수화된 변수다(값이 변하지 않는 변수)
		int d = 40;        //d는 지역변수이나 값이 수시로 변할 수 있는 변수이다

		//메소드 안에 존재하는 또다른 클래스(로컬 클래스, local class, 지역 클래스)
		//inner
		class LocalTest  //지역클래스, 로컬클래스  
		{
			void write()  //--> 두 번째 write 메소드
			{
				System.out.println("write()...(2)");
				System.out.println("a :" + a);
				System.out.println("b :" + b);
				System.out.println("c :" + c);
				//System.out.println("d :" + d);  -->>컴파일 에러 발생
			}
		}

		//===============================================
		//    변수 c와 변수 d는 둘다 지역변수이지만
		//    c는 fianl 변수이기 때문에
		//    두 번째 write() 메소드에서 언제 접근하더라도
		//    고정된 값임을 보장받을 수 있다.
		//    반면에 d 는 그 값이 수시로 변동될 수 있는 상황이므로
		//    LocalTest 클래스의 인스턴스 생성 시점이
		//    언제가 될 지 알 수 없기 때문에
		//    이런 이유로 d 에 어떤 값이 담겨있는지 보장받을 수 없기 때문에
		//    변수 d 에 접근하는 것을 피할 수 있도록 문법적으로 처리한다.
		//===============================================


		//LocalTest lt = new LocalTest(); //★

		d = 10;  
		d -= 30;

		LocalTest lt = new LocalTest(); //★
		//이 인스턴스의 위치(탄생시점)을 알 수 없다.
		//그래서 d값이 어디서 어떻게 변할 지 모르므로 d에 접근하지 못하도록 막아놓은 것이다.
		lt.write();  //-->> 두 번째 write() 메소드 호출


		d += 10;

		//LocalTest lt = new LocalTest(); //★



	}



}

public class day21_1 {
	
	public static void main(String[] args)
	{

     Test2 ob = new Test2();
	 ob.write();   //-->> 첫 번째 write() 메소드 호출
	 //실행결과
	 /*
	 write()...(1)
	 write()...(2)
	 a :10
	 b :20
	 c :20
	 */



	}

}
