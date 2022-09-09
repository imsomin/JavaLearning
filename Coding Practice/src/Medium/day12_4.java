//배열의 기본적 활용

//사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//단, 배열을 활용하여 구현할 수 있도록 한다.

package Medium;

import java.io.IOException;
import java.util.Scanner;

public class day12_4 {
	
	public static void main(String[] args) throws IOException
	{

		//변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);

		int max = 0;  //-->>최댓값이 담겨지는 변수

		
		//연산 처리
		System.out.print("입력할 데이터의 갯수 : ");
		int n = sc.nextInt();


		//배열 설정
		int[] arr = new int[n];


		//배열 빈 공간에 숫자 하나씩 넣기
		System.out.print("데이터 입력(공백 구분) : ");


		for (int i=0; i<n; i++)
		{
			int data = sc.nextInt();
			arr[i] = data;
		}


		//더 큰 수를 최댓값으로 하기
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max)
				max=arr[i];
			
		}

		//가장 큰 수 출력
		System.out.printf(">> 가장 큰 수 -> %d%n", max);

	}

}

//결과
/*
입력할 데이터의 갯수 : 5
데이터 입력(공백 구분) : 12 3 56 23 13
>> 가장 큰 수 -> 56
*/

