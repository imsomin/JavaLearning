//break 실습
//멈춘다, (+그리고 빠져나간다.)

package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day09 {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s, i;
		//   n : 사용자가 입력할 변수를 담을 값
		//   s : 누적합 연산 결과를 담아낼 변수  --'s'초기화 확인하기! 선언은 여기서 하지만 초기화는 나중에(누적 방지용)
		//   i : 1부터 1씩 사용자의 입력값까지 증가할 변수

		char ch;  //-- 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수

		//입력값이 유효한 값이 아닐때 계속 반복됨 (유효한 값에 해당하면 멈춤)
		while (true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			//테스트(확인)
			//System.out.println("유효한 정수 입력 완료!");

			s = 0;   //--초기화하는 위치 확인하기

			//--------------이제부터는 누적합 구하기------------------

			for (i=1; i<=n ; i++)
				s += i;
		
			System.out.printf(">>1~%d까지의 합 : %d%n", n, s);
		

		
		System.out.print("계속하시겠습니까(Y/N)? : ");
		ch = (char)System.in.read();   //--대문자소문자를 비교연산해야하는데 문자형태로는 불가능해서 형 변환

		//그만할 의사 표현 처리
		//반복문을 멈추고 빠져나갈 수 있는 처리
		//if(ch=='N' || ch=='n')   
		// Y 또는 y 입력한 거 아닌게 확실한가?
		// Y 또는 y 빼고는 다 NO 취급
		if(ch!='Y' && ch!='y')    //대문자 Y도 아니어야하지만 소문자 y도 아니어야 한다.
			{
				//반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				//--위와 같은 의사 표현을 했다면
				//  그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				System.out.println("계산 마무리");
				break;
				//--멈춘다, (+그리고 빠져나간다.)

			}//end if

			//엔터값(\r\n) 처리
			System.in.skip(2);

		}//end while

		
		
		


	}//end main

}

//결과
/*
임의의 정수 입력 : 64
>>1~64까지의 합 : 2080
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 1000

임의의 정수 입력 : 23
>>1~23까지의 합 : 276
계속하시겠습니까(Y/N)? : n
계산 마무리
*/
