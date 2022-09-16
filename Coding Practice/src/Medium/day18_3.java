//상속(Inheritance)

//메소드 오버라이딩(Method Overriding)의 특징
/*
-메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
-반드시 상속 관계가 있어야 한다.
-재정의된 하위 클래스의 메소드 접근제어지시자는
  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
  예를 들어, 상위 클래스 메소드의 접근제어지시자가 'protected'인 경우
  하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
  접근제어지시자는 'protected' 또는 'public' 이어야 한다
-'static', 'final', 'private' 메소드는 오버라이딩(Overriding)할 수 없다.
-Exception의 추가가 불가능하다. 즉, 상위 메소드가 가지고 있는 기존 예외 사항에 
 새로운 Exception 을 추가하는 것은 불가능 하다는 것이다.
*/

package Medium;

//부모 클래스(상위 클래스, super class)
class Super183
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}


//자식 클래스(하위 클래스, sub class)
class Sub183 extends Super183
{
	/*  
	private int a = 5;          -->> 상속 못 받음
	protected int b = 10;       -->> 받음
	public int c = 20;          -->> 받음

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}		
	*/
	
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		//->> 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.(private 변수이기 때문에)
		System.out.println("Sub print() 메소드 : " + b + " : " + c);
		//Sub print() 메소드 : 100 : 20
		
		System.out.println("Sub print() 메소드 : " + b );
		System.out.println("Sub print() 메소드 : " + this.b );
		System.out.println("Sub print() 메소드 : " + super.b );
		//Sub print() 메소드 : 100
		//Sub print() 메소드 : 100
		//Sub print() 메소드 : 10
		//-->> 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다.
		//     슈퍼 클래스에서 선언된 b vs 서브 클래스에서 선언된 b


		System.out.println("Sub print() 메소드 : " + c );
		System.out.println("Sub print() 메소드 : " + this.c );
		System.out.println("Sub print() 메소드 : " + super.c );
		//Sub print() 메소드 : 20
		//Sub print() 메소드 : 20
		//Sub print() 메소드 : 20
		//-->> 변수 c는 접근하는데 아무런 제약과 제한이 없다.
		//     슈퍼 클래스에서 선언된 c
	}

	@Override
	public void write()
	{
		//System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		//--Super아니고 Sub
		//--부모에게 받아서 뜯어 고친다고 생각하자
	
		//슈퍼 클래스에서 선언된 변수 a에는 접근할 수 없다.  -->> private 변수이기 때문에...
		System.out.println("Sub write() 메소드 : " + b + " : " + c);													 
		//Sub print() 메소드 : 100 : 20											  
														 
	}



}



public class day18_3 {
	
	public static void main(String[] args)
	{
		// 하위 클래스(Sub) 인스턴스 생성
		Sub183 ob = new Sub183();

		ob.print();
		//--> Sub print() 메소드 : 100 : 20


		ob.write();
		//--> Super write() 메소드 : 5 : 10 : 20

		System.out.println("------------------------------");

		System.out.println(ob.b);
		//100

		System.out.println(((Super183)ob).b);
		//10

		((Super183)ob).write();
		//Sub write() 메소드 : 100 : 20

	}

}
