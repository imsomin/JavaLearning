//클래스와 인스턴스 활용
//계산 실습(2)

//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산을 수행하는 프로그램을 구현한다.

package Base;

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	int su1, su2;
	char op;

	//메소드(1)
	//해당값 입력
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.printf("임의의 연산자 입력(+ - * /)  : ");
		op = (char)System.in.read();

	}

	
	//메소드(2)
	//메소드 정의(기능 : 연산)
	int cal()
	{
		int result = 0;

		switch (op)
		{
			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			case '*' : result = su1 * su2; break;
			case '/' : result = su1 / su2; break;
			//default : result = -1;
		}

		return result;
	}


	//메소드(3)
	//메소드 정의(기능 : 출력)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s); 
	}

}




public class day10_6 {
	
	public static void main(String[] args) throws IOException
	{
		//Calculate 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input();          //--생성한 인스턴스를 통한 입력 메소드 호출
		int r = cal.cal();    //--생성한 인스턴스를 통한 연산 메소드 호출
		cal.print(r);         //--생성한 인스턴스를 통한 출력 메소드 호출

	}

}


//결과
/*
임의의 두 정수 입력(공백 구분) : 3 6
임의의 연산자 입력(+ - * /)  : *
>> 3 * 6 = 18

임의의 두 정수 입력(공백 구분) : 45 30
임의의 연산자 입력(+ - * /)  : -
>> 45 - 30 = 15

*/
