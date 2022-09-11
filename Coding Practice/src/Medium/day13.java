//배열의 배열(2차원 배열)

//2차원 배열은 배열 요소로 1차원 배열을 가지는 배열이며,
//3차원 배열은 배열 요소로 2차원 배령을 가지는 배열이다.

package Medium;

public class day13 {
	
	public static void main(String[] args)
	{
		
		//배열의 배열 선언과 초기화
		//방법 (1)
		//int[] arr1 = new int[3];
		int[][] arr1 = new int[3][3];

		//arr1[0] = 1;
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		
		
		//방법 (2)
		//int[] arr2 = {1,2,3};
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		//arr2의 길이는 3에 해당함

		
		
		//방법 (3)
		int[][] arr3 = new int[3][3];
		int n=1;
		for (int i=0; i<arr3.length; i++)     
		{
			for (int j=0; j<arr3[i].length; j++) 
			{
				//테스트
				//System.out.println("i:" + i + ", j:" + j);
				//-->>결과
				/*
				i:0, j:0
				i:0, j:1
				i:0, j:2
				i:1, j:0
				i:1, j:1
				i:1, j:2
				i:2, j:0
				i:2, j:1
				i:2, j:2
				*/

				arr3[i][j] = n;
				n++;
			}
		}

		//배열의 배열 요소 전체 출력
		for (int i=0; i<arr1.length; i++)  
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				System.out.printf("%2d", arr1[i][j]);
			}
			System.out.println();
		}

	}
	
}

//결과
/*
 1 2 3
 4 5 6
 7 8 9
*/
