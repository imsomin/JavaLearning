//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//	1   2   3   4   10  → 마지막에 해당 행의 합이 출력된다. 
//	5   6   7   8   26
//	9   10  11  12  42
//  13  14  15  16  58
//	28  32  36  40  136

//  ↓
// 마지막에 해당 열의 합이 출력된다.

package Medium;

public class day13_6 {

	public static void main(String[] args)
	{

		int[][] arr = new int[5][5];

		int n=0;

		int sum=0;  		//--테스트 변수

		for (int i=0; i<arr.length-1; i++)        // i -> 0 1 2 3
		{
			for(int j=0; j<arr[i].length-1; j++)  // j -> 0 1 2 3
			{
				n++;    //-1 을 했으므로, 1 2 3 4 5 6 ... 16 -->> 4 X 4 까지 나옴
				arr[i][j] = n;

				sum += arr[i][j];

				//arr[4][4] += arr[i][j];
				/*
				  1  2  3  4  0
				  5  6  7  8  0
				  9 10 11 12  0
				 13 14 15 16  0
				 0  0  0  0  136
				계속하려면 아무 키나 누르십시오 . . .
				*/

				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];
				//     ↓ 숫자 대입
				/*
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
				*/
				
			}
		}

		//=============================================
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//위와 같은 에러가 발생하기 때문에
		//arr.length-1 을 해주는 것이다.
		//=============================================
		
		
		//테스트
		//System.out.println("sum : " + sum);
		//-->>sum : 136

		//전체 요소 출력 구문
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

	}
}

//결과
/*
    1    2    3    4   10
    5    6    7    8   26
    9   10   11   12   42
   13   14   15   16   58
   28   32   36   40  136
 */
