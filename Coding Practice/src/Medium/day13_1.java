//배열의 배열(2차원 배열)

//숫자 1~25를 요소로 취하는 배열(5x5)을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

package Medium;

public class day13_1 {
	
	public static void main(String[] args)
	{
		
		//배열의 배열 선언
		//int[][] arr; 
		
		//배열의 배열 메모리 할당
		//arr = new int[5][5];

		// ↓

		//배열 선언 + 메모리 할당
		int[][] arr = new int[5][5];

		//변수 선언 및 초기화
		int n=1;              //1 2 3 4 5 6 7 ... 23 24 25

		//배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for (int i=0; i<arr.length; i++)          // -> outer -> 0      1      2      3      4
		{   
			for (int j=0; j<arr[i].length ; j++)  // -> inner -> 01234  01234  01234  01234  01234
			{
				// 00 01 02 03 04
				// 10 11 12 13 14
				// 20 21 22 23 24
				arr[i][j] =n;
				n++;   //제외할 시 전부 1로 나온다.
			}
		}

		//전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);  
			System.out.println();
		}

	}


}

//결과
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
*/
