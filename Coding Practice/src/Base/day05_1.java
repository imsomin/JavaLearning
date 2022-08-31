package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_1 {
	
	public static void main(String[] args) throws IOException
	{
		//문제(1)
		/*
		//사용자로부터 원하는 단(구구단)을 입력받아
		//해당하는 구구단을 출력하는 프로그램을 구현
		//단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
		//이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan;   //사용자의 입력값을 정수 형태로 담아낼 변수
		
		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer.parseInt(br.readLine());
		
		//만약 단 입력이 1보다 작거나 9보다 크다면...
		if (dan<1 || dan>9) {
			System.out.println("1부터 9까지의 정수만 입력 가능");
			return;
		}
		
		//곱해지는 수 변수 선언
		int n=1;
		
		// 1 2 3 4 5 6 7 8 9
		//while(n<9){
		//	n++;
		//	System.out.printf("%d * %d = %d\n", dan, n, (dan*n));
		//}
		
		while(n<=9){
			System.out.printf("%d * %d = %d\n", dan, n, (dan*n));
			n++;
		}
		
		//결과
		//원하는 단(구구단) 입력 : 7
		//7 * 1 = 7
		//7 * 2 = 14
		//7 * 3 = 21
		//7 * 4 = 28
		//7 * 5 = 35
		//7 * 6 = 42
		//7 * 7 = 49
		//7 * 8 = 56
		//7 * 9 = 63
		
		//주의!!!!!
		//while(n<=9)를 했더니 7*10=70 까지 계산하여 출력되었다...
		//출력문 다음으로 n++; 의 위치를 변경하였더니 *0부터 *8까지 출력되었다...
		*/
		
		
		
		
		//문제(2)
		//사용자로부터 임의의 정수를 입력받아
		//입력받은 정수가 소수인지 아닌지를 판별하여
		//결과를 출력하는 프로그램을 구현
		
		//인스턴스 생성
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		//주요 변수 선언 및 초기화
		int num; //-- 사용자의 입력값을 담아낼 변수
		
		int n = 2; //-- 입력값을 대상으로 나눗셈 연산을 수행할 변수가 필요하다.
        //-- 2부터 시작해서 1씩 증가
		//-- ex) 입력값 27 -> n : 2 3 4 5 6 7 ... 26
		
		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());   //--br = BufferedReader, 입력값을 받아야하므로 형변환 필요

		//String result = "소수다";
		boolean flag = true; //--num(사용자 입력값)은 소수일 것이라고 가정
				
		while (n<num)   //--n은 num보다 작을 때에만 반복할 수 있다!
		{

			// n으로 num이 나누어 떨어지는지 확인해야 한다.
			if (num%n==0)
			{
				//나누어 떨어지면
				//소수가 아니다
				//result = "소수아니다";
				flag = false;   //--num은 소수 아니다.
				break;          //멈춘다. 그리고 빠져나간다.
						        //break를 감싸는 가장 가까운 반복문

			}

			n++; //--나중에 수행하게 된다.

			System.out.println("반복문 수행");   //--break의 존재로 인해 엄청난 리소스 소모 감소 가능
		}

		//System.out.println(result);
		//위와같이 'result' 변수를 추가하면 소수가 아닐때에에도 소수라고 나올 수 있다. (1의 경우)


		//결과 출력(출력 전에 수행해야 할 추가 확인 -> 1인지 아닌지에 대한 추가 검토
		if (flag && num!=1)   //--flag는 이미 true 값을 가지고 있음
		{
			//최종적으로 num은 소수다
			System.out.printf("%d -> 소수%n", num);
		}
		else
		{
			//최종적으로 num은 소수 아니다.
			System.out.printf("%d -> 소수아님%n", num);
		}
		
		//결과
		/*
		임의의 정수 입력 : 45
		반복문 수행
		45 -> 소수아님
		
		임의의 정수 입력 : 17
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		반복문 수행
		17 -> 소수
		 */

	
		
	}
}
