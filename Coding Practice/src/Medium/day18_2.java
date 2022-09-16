// 상속(Inheritance)

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5.00
// 계속하려면 아무 키나 누르세요...


package Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}



//Aclass 를 상속받는 클래스
class Bclass extends Aclass
{
	//상속받은 것
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/

	Bclass()
	{
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");		// "20 15"
		String temp = br.readLine();

		//==================================================
		// ※ 문자열.split("구분자");
		//	  문자열.split("\\s");	 //-- 구분자 → 공백
		//    ex) "10 20 30 40 50".split("\\s");
		//        → 반환 → {"10", "20", "30", "40", "50"}
		//
		//    ex) "010-1234-1234".split("-");
		//        → 반환 → {"010", "1234", "1234"}
		//==================================================

		String[] strArr = temp.split("\\s");  //-- 공백으로 구분하겠다!

		if (strArr.length != 2)
			return false;
		//-- false 를 반환하며 input() 메소드 종료
		//   이 조건을 수행할 경우,
		//   아래 수행해야 할 코드가 남아있더라도
		//   결과값을 반환하며 메소드는 종료된다.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);


		System.out.print("연산자 입력(+ - * /) : ");   // 더하기 빼기 곱셈 나눗셈
		op = (char)System.in.read();

		/*
		if (op!='+' && op!='-' && op!='*' && op!='/')
		{
			return false;
		}

		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}

		return false;


	}//close input()



	double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+': result = x + y; break;
			case '-': result = x - y; break;
			case '*': result = x * y; break;
			case '/': result = (double)x / y;
		
		}


		return result;

	}//end calc()
}



public class day18_2 {
	
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error!");
			return;
		}

		double result = ob.calc();

		ob.write(result);
	}

}

//결과
/*
임의의 두 정수 입력(공백 구분) : 4 18
연산자 입력(+ - * /) : -
>> 4 - 18 = -14.00

임의의 두 정수 입력(공백 구분) : 65 5
연산자 입력(+ - * /) : /
>> 65 / 5 = 13.00
*/
