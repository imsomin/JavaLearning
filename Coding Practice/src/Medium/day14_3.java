//배열과 난수 처리 (※ Random 클래스 활용)

//사용자로부터 임의의 정수를 입력받아
//그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
//배열에 담겨있는 데이터들 중
//가장 큰 값과 가장 작은 값을 선택하여
//결과를 출력하는 프로그램을 구현한다.

package Medium;

import java.util.Random;
import java.util.Scanner;

public class day14_3 {
	
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		//size 변수에 담아낼 수 만큼의 배열 공간 만들기
		//(배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		//무작위 정수(난수)를 발생시키기 위해서는
		//난수 발생 전용 객체가 필요하다.
		// -> Random 클래스 활용
		// -> java.util.Random

		Random rd = new Random();

		//=======================================================
		// * Random 클래스의 nextInt() 메소드
		//   0 ~ 매개변수로 넘겨받은 정수 n-1 까지의 수 중
		//   무작위 정수(난수) 1개를 발생시킨다.

		//테스트
		//rd.nextInt(10) // 0 ~ 9
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		//-->> 발생한 난수: 6
		//-> 0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생한다.
		//=======================================================
		
		
		//size만큼 즉 입력받은 수 만큼 난수를 발생시켜야 한다.
		//배열 구성
		for (int i=0; i<arr.length; i++)
		{
			//rd.nextInt(101);  //-> 0 ~ 100
			//rd.nextInt(100); //-> 0 ~ 99
			arr[i] = rd.nextInt(100) + 1;  //-> 0 ~ 99 >> 1 ~ 100

		}
		//-->> rd.nextInt(100)    ->  0 ~ 99 까지의 무작위 정수 한 개 발생
		//     rd.nextInt(100)+1  ->  1 ~ 100까지의 무작위 정수 한 개 발생

		//테스트
		//구성된 배열의 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		//실행 결과
		//발생시킬 난수의 갯수 입력 : 10
		//71  95   8  64  94  59   9  62   5  98


		//가장 작은 값, 가장 큰 값 출력하기
		int max, min;  //--최대값, 최솟값
		max=min=arr[0];  //--max = min = 96; -> 96을 대입하겠다

		//구성요소들간의 크기 비교 필요
		for (int i=1; i<arr.length; i++)  
		{
			if(max<arr[i]) 
			{
				max = arr[i];  //max보다 큰 값
			}
			
			//두 사이에 논리적인 연관성 없으므로 else if 안해도 됨

			if(min>arr[i])
			{
				min = arr[i];  //min보다 작은 값
			}
		}

		//결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d%n", max, min);
		//실행 결과
		//가장 큰 값 : 98, 가장 작은 값 : 5
	}

}

//결과
/*
발생시킬 난수의 갯수 입력 : 10
8  23  50 100  37  65  20  59  50  55
가장 큰 값 : 100, 가장 작은 값 : 8
*/



