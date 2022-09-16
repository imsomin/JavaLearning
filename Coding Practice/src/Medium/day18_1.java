//상속(Inheritance)

//(1) 'super'

// 'static'으로 선언되지 않은 메소드에서 사용되며
// 현재 클래스가 상속받은 상위 클래스의 객체를 가리킨다.
// super 는 상위 클래스의 생성자를 호출하거나
// 상위 클래스의 멤버 변수 또는 메소드를 호출할 때 사용할 수 있다.

// 하위 클래스의 생성자에서 상위 클래스의 생성자를 호출할 때는
// 하위 클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다.


//(2) 생성자와 클래스 상속간의 관계

// 하위 클래스는 상위 클래스의 멤버를 상속받지만,
// 생성자는 상속 대상에서 제외된다.
// 그리고 하위 클래스의 생성자가 호출될 때
// 자동으로 상위 클래스의 생성자를 호출하게 된다.
// 이 때, 상위 클래스의 생성자는
// 인수가 없는 생성자(default 생성자 형태)가 호출된다.

// 상위 클래스 및 하위 클래스(즉, 상속 관계에 있는 클래스)를 설계하는 과정에서
// 상위 클래스의 생성자를 정의하지(작성하지) 않거나
// 인수가 없는 생성자만을 정의한(작성한) 경우
// 명시적으로 하위 클래스에서 상위 클래스의 생성자를 호출하지 않아도
// 아무런 문제가 발생하지 않지만
// 상위 클래스에 인자가 있는 생성자만 존재하는 경우에는
// 주의해야 한다.


//(3) 상속 예시

/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super(10);
		}

	}
*/


// 하위 클래스인 B_class 의 생성자에서
// 명시적으로 A_class 의 생성자를 호출하지 않으면
// 자동으로 인자가 없는 생성자를 호출한다.
// 하지만, A_class 에는 인자가 있는 생성자만 존재하고
// 인자가 없는 생성자는 존재하지 않기 때문에 에러가 발생한다.
// 따라서, B_class 생성자의 선두에
// 다음처럼 명시적으로 상위 클래스의 생성자 호출 구문을
// 작성해야 한다.

/*
	class A_class
	{
		A_class(int n)
		{
		}
	}

	class B_class extends A_class
	{
		B_class()
		{
			super(10)
			...
			...
		}
	}

*/



//(4) 상속 시 주의 사항
/*
상위 클래스에서 선언된 멤버 변수의 이름과
하위 클래스에서 선언된 멤버 변수의 이름이 같으면
상위 클래스의 멤버 변수는 무시된다.
이 때, 상위 클래스의 멤버 변수를 사용하기 위해서는
'super' 키워드를 이용한다.

동일한 이름의 멤버 변수나 동일한 이름의 메소드가
한 클래스 안에 선언되거나 정의되는 경우 기본적으로 에러가 발생한다.
단, 메소드의 경우에는 매개변수의 갯수나 타입이 다른 경우
에러가 발생하지 않고 이들을 서로 다른 메소드로 취급하게 된다.

*/

//super.A  :  부모님으로부터 물려받은 A
//A        :  자식이 원래 갖고있던 A


package Medium;

//Rect181클래스와 Circle181클래스의 부모 클래스
class Super181
{
	protected double area;
	private String title;

	public Super181()
	{
		System.out.println("Super181 - 인자 없는 생성자");
	}

	public Super181(String title)
	{
		this.title = title;
		System.out.println("Super181 - 문자열을 인자로 받는 생성자");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
}

//Super181 클래스를 상속받는 자식 클래스(단일 상속)
class Rect181 extends Super181
{
	/*
	protected double area;
	private String title;  //private 멤버는 접근 불가

	public Super181()  //생성자는 상속의 대상에서 제외
	{
		System.out.println("Super181 - 인자 없는 생성자");
	}

	public Super181(String title)
	{
		this.title = title;
		System.out.println("Super181 - 문자열을 인자로 받는 생성자");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/


	private int w,h;   //★


	// 자식 클래스의 사용자 정의 생성자
	public Rect181()
	{
		//자동으로 삽입
		//super();      -> Super181();
	}

	public void calc (int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;   //★
		write();
	}

	@Override   //-->>annotation (=> matadata - JDK 1.5)
	public void write()  //->> 괄호 안에 'int n'이 있으며 오버로딩!
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 - " + area);
	}
	
	//==============================================
	//※ 메소드 오버라이딩(Method Overriding)
	//
	//   상위 클래스를 상속받은 하위 클래스에서
	//   상위 클래스에 정의된 메소드를 다시 정의하는 것으로(재정의)
	//   객체 지향 프로그래밍의 특징인 다형성을 나타낸다.
	//   재정의(Overriding)는 반드시 상속 관계에 있어야 하며,
	//   메소드 이름, 리턴 타입, 매개변수의 갯수나 타입이
	//   완전히 일치해야 한다.
	//==============================================


}


//Super181 클래스를 상속받는 자식 클래스(단일 상속)
class Circle181 extends Super181
{

	//자식 클래스의 사용자 정의 생성자
	public Circle181(String title)
	{
		//super();  //부모 클래스의 생성자 호출 구문이 자동적으로 삽입된다.

		super(title);
	}
	
	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();          //★
		//this.write  -->>  지금 가진 write()가 하나이므로 가능
		//super.write -->>  "
	}
}

//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class day18_1 {
	
	public static void main(String[] args)
	{
		Rect181 ob1 = new Rect181();

		//Circle181 ob2 = new Circle181();
		//--에러발생(컴파일 에러)
		//현재 Circle181 클래스에는
		//매개변수를 필요로하는 사용자 정의 생성자가 만들어져 있으며
		//이로 인해 default 생성자가 자동으로 삽입되지 않는 상황.

		ob1. calc(10, 5);
		//실행결과
		/*
		Super181 - 인자 없는 생성자
		w : 10, h : 5
		사각형 - 50.0
		*/



	}

}
//상속 기본 형태
/*
class 상위
{
	상위 ()
	{
	}
}

class 하위
{
	하위()
	{
		super();
	}
}
*/


//상속 케이스(1)
/*
class 상위
{
	상위 ()
	{
		생성자를 정의하지 않음
	}
}

class 하위
{
	하위()
	{
		생성자 정의 안함 -> 가능
		인수 없는 생성자 -> 가능
		인수 있는 생성자 -> 가능
	}
}
*/

//상속 케이스(2)
/*
class 상위
{
	상위 ()
	{
		인수 없는 생성자만 정의
	}
}

class 하위
{
	하위()
	{
		생성자 정의 안함 -> 가능
		인수 없는 생성자 -> 가능
		인수 있는 생성자 -> 가능
	}
}
*/

//상속 케이스(3)
/*
class 상위
{
	상위 ()
	{
		인수 있는 생성자만 정의
	}
}

class 하위
{
	하위()
	{
		생성자 정의 안함 -> 하위클래스에서 생성자를 꼭 정의해야하므로 에러 발생
		인수 없는 생성자 -> super();가 없으면, 즉 상위 클래스의 해당 생성자를 호출하지 않으면 에러발생
		인수 있는 생성자 -> super();가 없으면, 즉 상위 클래스의 해당 생성자를 호출하지 않으면 에러발생
	}
}
*/

