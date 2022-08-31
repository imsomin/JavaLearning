package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_2 {
	
	public static void main(String[] args) throws IOException
	{
		
		//문제(1)
		/*
		//사용자로부터 임의의 두 정수를 입력받아
		//작은 수 부터 큰 수 까지의 합을 구햐여
		//결과를 출력하는 프로그램을 구현
		
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int n;  //--루프 변수로 활용할 변수
		int su1, su2; //--첫번째, 두번째 사용자 입력값을 담아낼 변수
		int result=0; //-- 누적합을 담을 변수
		

		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());
		
		
		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1이 su2봐 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
		if (su1>su2)
		{
			//자리 바꿈
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//반복 연산 수행
		//반복 연산을 수행하기 전에
		//작은 수를 따로 저장하여 루프 변수로 활용한다.
		//(결과 출력 과정에서 입력받은 작은 수가 필요한데 그 수를 반복과정에서 사용하게 되면 원래의 값을 확인할 수 없기 때문)
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		//결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d%n", su1, su2, result);
		
		//결과
		//첫 번째 정수 입력 : 45
		//두 번째 정수 입력 : 8
		//>> 8 ~ 45 까지의 합 : 1007
		*/
		
		
		
		
		//문제(2)
		//사용자로부터 임의의 정수를 입력받아
		//1부터 입력받은 그 정수까지의
		//전체 합과, 짝수의 합과, 홀수의 합을
		//각각 결과값으로 출력하는 프로그램을 구현
		
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//변수 선언
		int n;        //-->> 사용자로부터 임의의 정수를 받을 변수
		int sum;      //-->> 정수합 변수
		int oddSum;   //-->> 홀수합 변수
		int evenSum;  //-->> 짝수합 변수
		int num=1;    //-->> 1 ~ num까지 더해진다, 이때 num의 초기값은 1이다.
				
		sum = oddSum = evenSum = 0;  //★중요!!!! 합의 값은 '0'으로 초기화해놓은다.
				
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

				
		//연산 처리
		while (num<=n)   
		{
			sum += num;           //-->>정수합

			if (num%2==0)         //-->>짝수합
			{
				evenSum += num; 
			}
		    else if (num%2==1)    //-->>홀수합
			{
				oddSum += num;
			}
			num++;

		}
				
	
		//결과 출력 
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d%n", n, sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d%n", n, evenSum);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d%n", n, oddSum);
						
		//결과
		//임의의 정수 입력 : 34
		//>> 1 ~ 34 까지 정수의 합 : 595
		//>> 1 ~ 34 까지 짝수의 합 : 306
		//>> 1 ~ 34 까지 홀수의 합 : 289
		
	}

}
