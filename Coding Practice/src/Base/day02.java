package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day02 {
	
	
	public static void main(String[] args) throws IOException
	{
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int a, b;  //-- 사용자 입력값을 담을 변수
		int c, d, e, f, g; //-- 연산 결과를 담을 변수
		
		//연산 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		c = a + b;
		
		d = a - b;
		
		e = a * b;
		
		f = a / b;
		
		g = a % b;
		
		//결과
		System.out.printf("\n=====[결과]=====\n");
		
		System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.printf("%d + %d = %d\n", a, b, d);
		System.out.printf("%d + %d = %d\n", a, b, e);
		System.out.printf("%d + %d = %d\n", a, b, f);
		System.out.printf("%d + %d = %d\n", a, b, g);
		
		
		System.out.printf("\n===============\n");
		
		
		
		
		
	}
	

}

/*
첫 번째 정수 입력 : 12
두 번째 정수 입력 : 24

=====[결과]=====
12 + 24 = 36
12 + 24 = -12
12 + 24 = 288
12 + 24 = 0
12 + 24 = 12

===============
*/



