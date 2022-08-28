package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day03_1 {
	
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//사용자가 입력하는 임의의 정수를 담아둘 변수
		int a, b, c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		
		
		//1.  첫 번째 정수가 두 번째 정수보다 클 경우
		if (a>b)
		{
			//자리바꿈 (a와 b)
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a>c)
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		//-- 첫번째 조건 이후로 다음 조건도 확인 필요 있음
		//-- 첫번째 조건 이후로 다음 어떤 조건도 확인 필요 없을 때에만 else if 활용 가능
		//-- 그러므로 위에서는 독립적인 if문을 써야한다.


		//2.  첫 번째 정수가 세 번째 정수보다 클 경우... 자리바꿈

		//3.  두 번째 정수가 세 번째 정수보다 클 경우... 자리바꿈

		
		System.out.printf("\n>> 정렬 결과 : %d %d %d%n", a, b, c);

		
		}

}


/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 8
세 번째 정수 입력 : 9

>> 정렬 결과 : 5 8 9
*/