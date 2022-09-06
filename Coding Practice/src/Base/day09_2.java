//return 실습

//return의 두가지 의미
//1. 값의 반환
//2. 메소드의 종료

package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day09_2 {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s;

		System.out.print("임의의 정수 입력(10 이상): ");
		n =Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return;
			//--메소드 종료 - 종료 대상 : main()메소드 -> 프로그램 종료
			//return을 썼을 때와 안 쓸때의 결과 비교하기
		}

		s=0;
		for (int i=0 ; i<=n ; i++)
		{
			s += i;
		}

		System.out.println("결과 : " + s);


	}

}

//결과
/*
임의의 정수 입력(10 이상): 12
결과 : 78

//return을 썼을 때
임의의 정수 입력(10 이상): 2
10 이상의 정수를 입력해야 합니다.

//return을 쓰지 않았을 때
임의의 정수 입력(10 이상): 7
10 이상의 정수를 입력해야 합니다.
결과 : 28
*/