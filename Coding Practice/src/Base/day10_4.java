//※ day10_3과 세트

//원의 넓이와 둘레 구하기
//원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.

package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day10_4 {
	
	//멤버 변수 -> 주요 속성
	final double PI = 3.141592;  //-> 원주율(변수의 상수화)
	int r;                       //-> 원의 반지름

	//메소드(1)		
    //멤버 메소드 -> 주요 기능(동작, 행위)
	//반지름 입력 기능 -> 메소드 정의
	void input() throws IOException
	{
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());


	}

	
	//메소드(2)
	//넓이 계산 기능 -> 메소드 정의
	double calArea()
	{

		double result;

		result = r * r * PI;

		return result;

		//return r * r * PI;

	}


	//메소드(3)
	//둘레 계산 기능 -> 메소드 정의
	double calLength()
	{
		double result;

		result = 2 * r * PI;

		return result;
				
		//return 2 * r * PI;
		
	}

	//메소드(4)
	//결과 출력 -> 메소드 정의
	void print(double a, double l)
	{
		System.out.printf(">>반지름이 %d 인 원의\n", r);
		System.out.printf(">>넓이 : %.2f\n", a);
		System.out.printf(">>둘레 : %.2f\n", l); 
			
	}


}
