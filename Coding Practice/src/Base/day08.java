//for문을 활용한 별찍기 실습1

/*
//문제(1)
    *
   **
  ***
 ****
*****
	
	
//문제(2)
*****
****
***
**
*

*/

package Base;

public class day08 {
	
	public static void main(String[] args)
	{
		//문제(1) 풀이
		
		//변수 선언을 for문 안에서 처리 가능
		//i는 row를 의미함
		//가로행(0부터 시작); 세로열(5미만까지); 0 1 2 3 4... 총 5줄 출력
		for (int i=0; i<5; i++)   
		{
			//공백처리 구문
			//0번째 행은 4-0 즉, 공백이 4개 존재
			for (int j=0; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			//별찍기 처리
			for (int k=0; k<=i; k++)
			{
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		
		
		//문제(2) 풀이
		/*
		//변수 선언
		int i;
		int j;
		
		//연산 및 처리
		//i 같은 경우는 row를 의미함
		//첫번째 for문에서 i의 값이 5번 반복된다. (i = 1 2 3 4 5)
		for (i=1; i<=5; i++)
		{
			//j는 5부터 i까지 별을 찍게 되는데 5 4 3 2 1... 총 5개의 별을 찍음
			//갈수록 하나씩 줄어들어야 하므로 j--가 온다.
			for (j=5; j>=i ;j--)   
			{
				System.out.print("*");
			}
			//두번째 for문을 한번 마칠 때마다 한번씩 줄바꿈을 하도록 한다.
			System.out.println();
		}
		*/
	
	}
	
}
