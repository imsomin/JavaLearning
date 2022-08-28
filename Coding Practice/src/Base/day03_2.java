package Base;

import java.util.Scanner;

public class day03_2 {
	
	public static void main(String[] args)
	{
		//변수 선언
		Scanner sc = new Scanner(System.in);

		int evenSum = 0;  //짝수의 합을 담아낼 변수 선언 및 초기화
		int oddSum = 0;   //홀수의 합을 담아낼 변수 선언 및 초기화
		int a, b, c, d, e;  //입력받은 다섯 개의 정수를 담아둘 변수 선언

		//연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		//a가 짝수일 때 evenSum을 a만큼 증가
	    //    홀수일 대 oddSum을 a만큼 증가


		if (a%2==0)
		{
			evenSum += a;                  //evensum 누적합 때의 기준은 대개 '0'으로 초기화한다.
				                           //'evensum + a'의 값을 evensum에 다시 넣기
										   //누적곱의 경우에는 '1'로 세팅을 해 놓은다.
		}
		else 
		{
			oddSum += a;
		}

		//b가 짝수일 때 evenSum을 b만큼 증가
	    //    홀수일 대 oddSum을 b만큼 증가

		if (b%2==0)
		{
			evenSum += b;
		}
		else 
		{
			oddSum += b;
		}


		//c가 짝수일 때 evenSum을 c만큼 증가
	    //    홀수일 대 oddSum을 c만큼 증가

		if (c%2==0)
		{
			evenSum += c;
		}
		else 
		{
			oddSum += c;
		}


		//d가 짝수일 때 evenSum을 d만큼 증가
	    //    홀수일 대 oddSum을 d만큼 증가

		if (d%2==0)
		{
			evenSum += d;
		}
		else 
		{
			oddSum += d;
		}

		//e가 짝수일 때 evenSum을 e만큼 증가
	    //    홀수일 대 oddSum을 e만큼 증가

		if (e%2==0)
		{
			evenSum += e;
		}
		else 
		{
			oddSum += e;
		}



		//결과 출력
		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", evenSum, oddSum);


		
	}

}

/*
임의의 정수 5개 입력(공백구분) : 23 56 12 5 7

>> 짝수의 합은 68 이고, 홀수의 합은 35 입니다.
*/
