//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//  1  8  9   16  17 
//  2  7  10  15  18
//  3  6  11  14  19
//  4  5  12  13  20

package Medium;

public class day13_4 {
	
	public static void main(String[] args)
	{

		int[][] arr = new int[4][5];

		int n=0;

		for (int i=0; i<5; i++) 
		{
			for (int j=0; j<4; j++)
			{
				n++;

				if(i%2==0)   // i -> 0 2 4 
				{
					arr[j][i] = n;
				}
				else		// i -> 1 3 
				{
					arr[3-j][i] = n;  // 0 1 2 3 을 3 2 1 0 으로...
					// [3-0][1]  [3-0][3]
					// [3-1][1]  [3-1][3]
					// [3-2][1]  [3-2][3]
					// [3-3][1]  [3-3][3]        //-->>좌표만 바꾼 결과
				}
			}
		}


		//전체 요소 출력 구문
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}


	}

}

//결과
/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
*/
