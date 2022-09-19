//인터페이스(Interface)

package High;


//인터페이스
interface Demo2
{
	public void write();
	public void print();
}

//클래스
//class DemoTest
// ↓
//class DemoTest implememts Demo
// ↓
abstract class DemoTest3 implements Demo2 //-> 인터페이스를 구현하는 추상 클래스
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의");
	}

	//public void print();

}



//class DemoTestSub
// ↓
//class DemoTestSub extends DemoTest
// ↓
//abstract class DemoTestSub extends DemoTest  //-->추상클래스를 상속받는 추상클래스
// ↓
//-->오버라이딩하면서 추상 떼어낼 수 있음 
//즉, 추상 클래스를 상속받는 클래스가 된다.
class DemoTestSub extends DemoTest3          
{
	/*
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의");
	}
	*/

	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의");
	}
	
	
}


public class day20_2 
{
	public static void main(String[] args)
	{
		//Demo ob5 = new Demo();
		//인스턴스 생성 불가 -> 인터페이스

		//DemoTest ob5 = new DemoTest();
		//인스턴스 생성 불가 -> 추상클래스

		DemoTestSub ob5 = new DemoTestSub();

		ob5.write();
		ob5.print();
		//-->write() 메소드 재정의
		//-->print() 메소드 재정의

	}

}
