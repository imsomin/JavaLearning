//자바의 주요(중요) 클래스

//Object 클래스

package High;

class Testclass   // extends Object
{
	/*
	...
	public boolean equals(Object obj)
	{
		 ...
	}
	...

	*/

	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}




public class day22_2 {
	
	public static void main(String[] args)
	{
		Testclass ob1 = new Testclass();
		Testclass ob2 = new Testclass();

		System.out.println("10 == 9 : " + (10 == 9));
		//-> 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		//-> a == b : true

		//(1) '==' 비교 연산자는 피연산자의 크기를 비교!

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//-> ob1 == ob2 : false

		//(2) 객체(object)들을 비교하는 과정에서 사용하는 '==' 연산자는
		//    크기를 비교하는 것이 아니라 객체의 주소를 비교!

		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		//-> ob1.equals(ob2) : false

		//(3) '==' 연산자와 Object 클래스의 equals() 메소드는
		//    동일한 개념으로 객체의 주소를 비교!

		System.out.println();
		System.out.println("---------------------------------------");

		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());

		System.out.println("ob2            : " + ob2);
		System.out.println("ob2.toString() : " + ob2.toString());

		System.out.println("---------------------------------------");
		System.out.println();

		//======================================
		//'클래스명 @ 해시코드'

		// 해시코드(hashcode)
		// : 자바 내부적으로 객체를 구분하기 위해 사용하는 것
		// : 메모리의 주소값으로 생각하면 절대로 안 된다.

		// 객체가 같으면 hashcode(해시코드)가 같지만,
		// 해시코드가 같다고 해서 같은 객체는 아니다.
		//======================================


		
	}

}

//결과
/*
---------------------------------------
ob1            : High.Testclass@7852e922
ob1.toString() : High.Testclass@7852e922
ob2            : High.Testclass@4e25154f
ob2.toString() : High.Testclass@4e25154f
---------------------------------------
*/
