package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day03 {
	
	public static void main(String[] args) throws IOException
	{ 
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		int n;
		
		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		//결과 출력
		//2와 3의 배수 처리
		
		if (n%2==0 && n%3==0) {
			System.out.printf("%d -> 2와 3의 배수\n" , n);
		}
		else if (n%2==0) {
			System.out.printf("%d -> 2의 배수\n" , n);
		}
		else if (n%3==0) {
			System.out.printf("%d -> 3의 배수\n" , n);
		}
		else if (n%2!=0 && n%3!=0) {
			System.out.println(n + "-> 2와 3의 배수가 아님\n");
		}
		else {
			System.out.println(n + "-> 판정 불가\n");
		}
		
		
	}

}




/*
임의의 정수 입력 : 3
3 -> 3의 배수

임의의 정수 입력 : 71
71-> 2와 3의 배수가 아님
*/
