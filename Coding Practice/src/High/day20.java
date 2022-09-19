//인터페이스(Interface)

/*
(1)인터페이스는 완전히 미완성된 채로 남겨져
인터페이스 안에 존재하는 그 어떤 메소드도
몸체(정의부)가 없기 때문에 사실상 실행 부분이 존재하지 않는다.
  
(2)즉, 클래스를 위한 템플릿으로써의 기능을 수행하는
추상 클래스의 한 종류이다.
하나라도 추상 클래스가 아니면 안된다.

(3)인터페이스는 클래스와 달리 다중 상속이 가능하며
인터페이스 자체도 상속된다.

(4)기존의 C++ 언어 등에서 지원되는 '다중 상속'이 
사용 과정에서 많은 문제점을 노출시켰기 때문에
자바에서는 다중 상속의 개념을 '인터페이스'라는 개념으로 변형하여
인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

(5)인터페이스는 상수와 추상 메소드만 가질 수 있으며
인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
'public'으로 설정되어 클래스에서 구현(implements)함으로써
바로 접근이 이루어질 수 있다.

(6)특징
  -추상 클래스의 일종의 선언만 있고 정의가 없다.
  -final 변수는 가질 수 있다. (상수의 개념)
  -인터페이스는 'public static final' 상수만 만들 수 있다.
  -인터페이스를 구현하기 위해서는 extends 대신에 implements 를 이용한다.
  -하나 이상의 인터페이스를 implements 할 수 있다.
  -인터페이스를 implements 한 클래스는 인터페이스의 모든 메소드를 오버라이딩해야한다.
  -인터페이스가 다른 인터페이스를 상속받을 수 있으며 이때, extends 키워드를 사용한다.
  -또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.

*/

package High;

//인터페이스
interface Demo
{
	public static final double PI = 3.141592;

	//인터페이스의 멤버 변수는
	//'static final'을 별도로 명시하지 않아도
	//자동으로 'static final'인 상태이다!
	public int a = 10;


	//인터페이스 안의 클래스는 모두 추상이므로
	//abstract가 자동으로 되어있는 상태이다!
	//public abstract void print() 
	public void print();  //-> 인터페이스에선 메소드가 정의되어선 안된다, '선언'만 해야한다.
	/*
	{
		System.out.println("PI : " + PI);
	}
	*/


}


//클래스
//class DemoTest
//class DemoTest extends Demo    // X
//class DemoTest implements Demo // O
//↓
//추상 클래스 - 인터페이스를 구현하는 추상 클래스
//abstract class DemoTest implements Demo

//클래스 - 인터페이스를 구현하는 클래스
class DemoTest implements Demo
{
	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의");
	}
	
	public void write()
	{
		System.out.println("확인");
		System.out.println("클래스에 정의된 메소드");
	}
}



//main() 메소드를 포함하고 있는 외부 클래스
public class day20 {
	
	public static void main(String[] args)
	{
		//Demo는 인터페이스이므로 객체 생성 불가
		//Demo ob = new Demo();

		//DemoTest ob = new DemoTest();
		//--> print() 메소드 재정의 후 가능!!!

		//DemoTest obTemp = new DemoTest(); -- (O)
		//Demo ob = (Demo)obTemp;  -- (O)
		//Demo ob = obTemp;  -- (O)


		//○ 업 캐스팅
		//인터페이스 객체는 상위 객체
		Demo ob = new DemoTest();
		
		ob.print();
		//--> 인터페이스 메소드 재정의

		//ob.write();
		//에러 발생(컴파일에러)

		
		//○ 다운 캐스팅
		((DemoTest)ob).write();
		//--> 확인
		//--> 클래스에 정의된 메소드

		System.out.println(Demo.PI);   
		//static이므로 다음과 같은 결과나옴
		//-->>3.141592

		System.out.println(Demo.a);    
		//static(자동으로 붙음)
		//-->>10

		//Demo.a = 30;                   
		//final 있어서 안됨
		//에러 발생(컴파일에러)

	}

}
