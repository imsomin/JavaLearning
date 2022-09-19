//인터페이스(Interface)

package High;


//인터페이스
interface ADemo
{
	public void write();
}

//인터페이스
interface BDemo
{
	public void print();
}

//※ 인터페이스는 2개 이상을 구현할 수 있다.
// -> 다중 상속이 되지 않는 부분을 보완(보충)하는 개념.


//클래스
//class DemoTest
//class DemoTest extends ADemo, BDemo     // X
//class DemoTest implements ADemo, BDemo  //구현(implements)하는 순간 추상클래스이다  // O


//클래스 - 두 인터페이스를 구현한 클래스
class DemoTest2 implements ADemo, BDemo
{
	//======================================================
	// JDK 1.5(5.0)에서는 인터페이스 메소드를
	// 오버라이딩할 때
	// '@Override' 어노테이션(annotation)을 사용할 수 없다.
	// JDK 1.6 이후부터 적용 가능한 문법이다.
	// 단, 상속받은 클래스의 메소드를 오버라이딩할 때에는
	// JDK 1.5에서도 '@Override' 어노테이션(annotation)을 사용이 가능하다.
	//======================================================
	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()");
	}

	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()");
	}
}



//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class day20_1 {
	
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();    //--인터페이스 -> 인스턴스 생성 불가
		//BDemo ob = new BDemo();    //--인터페이스 -> 인스턴스 생성 불가

		//ADemo, BDemo 인터페이스를 구현한
		//클래스 기반의 인스턴스 생성
		DemoTest2 ob2 = new DemoTest2();

		ob2.write();
		ob2.print();
		//--> ADemo 인터페이스 메소드 write()
		//--> BDemo 인터페이스 메소드 print()

		ADemo ob3 = new DemoTest2();   //--업 캐스팅
		BDemo ob4 = new DemoTest2();   //--업 캐스팅

		//ob3.print(); //에러 발생
		//ob4.write(); //에러 발생


		((BDemo)ob3).print();
		((ADemo)ob4).write();
		//--> BDemo 인터페이스 메소드 print()
		//--> ADemo 인터페이스 메소드 write()
		//--DemoTest2 클래스가 두 인터페이스를 모두 구현했기 때문에 
		//  둘의 관계가 형성되어서 위와 같이도 가능하다.
		//  만약, DemoTest2 클래스가 이들 중 한 인터페이스만 구현했다면
		//  런타임 에러가 발생하는 구문이 된다.


		ob4.print();
		ob3.write();
		//--> BDemo 인터페이스 메소드 print()
		//--> ADemo 인터페이스 메소드 write()


		//다운 캐스팅에 해당함
		((DemoTest2)ob4).write();
		//--> ADemo 인터페이스 메소드 write()

	}

}
