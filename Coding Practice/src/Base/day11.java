//생성자(Constructor)

/*
[생성자의 역할]
1. 인스턴스 생성 -> 메모리 할당
2. 초기화

[생성자의 특징]
1.생성자는 메소드이지만, 일반 메소드처럼 호출될 수 없으며, 반환 자료형을 가질 수 없다. 
  ('void'조차 가질 수 없으며, 값을 반환할 수도 없다.)

2.생성자는 클래스와 동일한 이름을 가져야 한다.
  (대소문자 명확히 구분)

3.생성자는 객체를 생성하는 과정에서 'new 생성자();'의 형태로 호출된다.
  (인스턴스 생성 시 단 한 번만 호출)

*/

package Base;

//클래스는 객체를 만들기 위한 설계도(틀)
class NumberTest   
{
	
	int num;


	//사용자 정의 생성자가 존재하지 않을 경우
	//컴파일 과정에서 자동으로 삽입되는 디폴트 생성자(default constructor)
	/*
	NumberTest()
	{
		//텅 비어있는 상태
		//눈에 보이지 않는 존재
	}
	*/

	//사용자 정의 생성자
	NumberTest()
	{
		num = 10;
		System.out.println("사용자 정의 생성자 호출");
	}

	int getNum()
	{
		return num;
	}
}


public class day11 {
	
	public static void main(String[] args)
	{
		//NumberTest 클래스 기반의 인스턴스 생성
		NumberTest nt = new NumberTest();
		//-- 인스턴스가 생성되는 시점에서
		//   이와 동시에 선택의 여지 없이 생성자 호출(=>NumberTest()) 이 이루어진다.

	}

}

//결과
//사용자 정의 생성자 호출