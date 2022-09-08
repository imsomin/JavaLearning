//생성자(Constructor)

package Base;

public class day11_2 {
	
	//전역변수(가장 위에 위치)
	int x;   

	//생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//필요할 경우 인수를 받아들이는 것도 가능하고
	//같은 이름의 메소드를 정의하는 중복정의가 가능하지만
	//리턴값(반환값)은 가질 수 없다.

	//생성자는 다른 일반 메소드처럼 호출될 수 없고,
	//'new' 연산자를 이용하여 객체를 생성하기 위해 호출되며
	//각 클래스의 인스턴스인 객체를 생성한 후에
	//생성된 객체의 멤버를 초기화시키는 작업을 수행한다.

	day11_2()
	{
		//생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.
		//하지만 생성자 내부에서 가장 먼저 실행되어야 한다.
		//다른 생성자 호출(100); 
		//그래야 먼저 처리할 수 있기 때문이다.
		
		//day11_2(100);
		this(100);
		
		x = 10;
		//this x = 10; -->> 가능
		
		System.out.println();
		System.out.println("인자가 없는 생성자");
		System.out.println("day11_2가 갖고있는 x : " + this.x);
		System.out.println("day11_2가 갖고있는 x : " + x);
	}

	day11_2(int num)
	{
		x = num;
		System.out.println();
		System.out.println("인자가 하나인 생성자");
		System.out.println("day11_2가 갖고있는 x : " + this.x);


	}

	//=============================================
	//메소드 오버라이딩
	//       vs
	//메소드 오버로딩(중복정의)
	//Method overloading
	//메소드의 기능이 같다 + 구분(식별) 가능 -> 동일한 이름 허용
	//=============================================


	public static void main(String[] args)
	{
		//day11_2 클래스 기반 인스턴스 생성
		day11_2 ob1 = new day11_2();
		day11_2 ob2 = new day11_2(100);

		//두 개가 구분되므로
		//둘 다 중복으로 생성 가능

		System.out.println();
		System.out.println("main에서 ob1.x :" + ob1.x);
		System.out.println("main에서 ob2.x :" + ob2.x);


	}

}


//결과
/*

인자가 하나인 생성자
day11_2가 갖고있는 x : 100

인자가 없는 생성자
day11_2가 갖고있는 x : 10
day11_2가 갖고있는 x : 10

인자가 하나인 생성자
day11_2가 갖고있는 x : 100

main에서 ob1.x :10
main에서 ob2.x :100
*/

