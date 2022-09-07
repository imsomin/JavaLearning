//클래스와 인스턴스 활용
//계산 실습(1)

//사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수 까지의 합을 연산하여
//결과값을 출력하는 프로그램을 구현한다.
//단, 입력 데이터가 1 보다 작거나 1000보다 큰 경우
//다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

package Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//멤버 변수 -> 주요 속성
	int su;
		
	//메소드(1)
	//정수 입력 기능
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);

		}

	
	//메소드(2)
	//연산 처리 메소드 정의
	int calculate()
	{
		int result = 0;

		for (int i=1 ; i<su; i++)
			result += i;

		return result;
	}

	//메소드(3)
	//결과 출력
	void print (int sum)       //-->>sum은 여기서 처음 선언
	{
		System.out.printf(">>1~%d까지의 합 : %d%n", su, sum);
	}


}



public class day10_5 {
	
	public static void main(String[] args) throws IOException
	{
		
		//Hap 인스턴스 생성
		Hap ob = new Hap();   

		//생성한 인스턴스를 통해 입력 메소드 호출  -> input()
        //----------------------
		//   참조변수 활용

		ob.input();        //->정수 입력받는 공간

		
        //생성한 인스턴스를 통해 연산 처리 메소드 호출 -> calculate()
		int s = ob.calculate();

		//생성한 인스턴스(ob)를 통해 출력 메소드 호출 -> print()
		ob.print(s);

		//ob.print(ob.calculate());    --->> s 없이 이와같이 써도 가능


	}

}

//결과
/*
임의의 정수 입력(1~1000) : 560
>>1~560까지의 합 : 156520
*/
