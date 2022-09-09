//배열의 기본적 활용

//사용자로부터 임의의 학생 수를 입력받고
//그만큼의 점수(정수 형태)를 입력받아
//전체 학생 점수의 합, 평균, 편차를 구하여
//결과를 출력하는 프로그램을 구현한다.
//단, 배열을 활용하여 처리할 수 있도록 한다.

package Medium;

import java.util.Scanner;

public class day12_5 {
	
	public static void main(String[] args)
	{

		//변수 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		
		int n; //학생수
		int sum=0;  //합
		double avg=0, dev=0;  //평균, 편차

		
		//연산 및 처리
		System.out.print("학생 수 입력 : ");
		n = sc.nextInt();


		//입력받은 학생 수를 담을 배열 설정
		int[] arr = new int[n];


		//배열에 숫자를 하나씩 입력받기
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);

			arr[i]= sc.nextInt();

			sum += arr[i];
		}
		

		//평균 구하기
		avg = sum/n;  


		System.out.println();
		System.out.printf(" >> 합 : %d%n", sum);
		System.out.printf(" >> 평균 : %.1f%n", avg);
		System.out.println(" >> 편차 : ");



		for (int i=0; i<n; i++)
		{
			System.out.printf("%d : %.1f%n", arr[i], avg-arr[i]);
		}


	}
}

//결과
/*
학생 수 입력 : 3
1번 학생의 점수 입력 : 85
2번 학생의 점수 입력 : 97
3번 학생의 점수 입력 : 78

 >> 합 : 260
 >> 평균 : 86.0
 >> 편차 : 
85 : 1.0
97 : -11.0
78 : 8.0
*/
