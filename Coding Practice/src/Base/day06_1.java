package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day06_1 {
	
	public static void main(String[] args) throws IOException
	{
		//반복문(do-while문) 실습
		
		//사용자로부터 여러 개의 양의 정수를 입력받고
		//그 합을 계산하여 출력하는 프로그램을 작성한다.
		//단, -1이 입력되는 순간 입력 행위를 중지하고 
		//그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
		//즉, '-1'을 입력 중지 커맨드(명령)로 활용한다.
		//do-while 문을 활용하여 문제를 해결할 수 있도록 한다.
		
		
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//변수 선언 및 초기화
		int num;    //--사용자의 입력값을 담아낼 변수
		int sum=0;  //--누적합을 담아낼 변수
		
		int n=1;    //--루프 변수로 활용하며 몇 번째 입력값인지를 담아낼 변수
		//루프 변수란?
		//일부 반복을 실행하기 위해 설정된 변수
		
		  do
		 {
			  System.out.printf("%d번째 정수 입력(-1 종료) : " , n);
			  num = Integer.parseInt(br.readLine());
			  sum += num;   //sum을 num만큼 증가!!
			  
			  n++;
			  
		 }
		  while(num!=-1);  //-- num이 -1이 아닐 경우 (계속해서 반복)

		 //결과 출력
		 System.out.printf("\n>> 현재까지 입력된 정수의 합 : %d\n", (sum+1)); 


		
	}


}

/*
1번째 정수 입력(-1 종료) : 23
2번째 정수 입력(-1 종료) : 5
3번째 정수 입력(-1 종료) : 17
4번째 정수 입력(-1 종료) : -1

>> 현재까지 입력된 정수의 합 : 45
*/