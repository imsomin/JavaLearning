//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//  1  2  3  4  5
//  2  3  4  5  6
//  3  4  5  6  7
//  4  5  6  7  8
//  5  6  7  8  9

package Medium;

public class day13_2 {
	
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		int n;   
		
		for (int i=0; i<arr.length; i++)  
		{
			n=1+i;   //위치 확인할 것!, 0에서부터 출발했으므로 +1 을 해주어야 한다.

			for(int j=0; j<arr[i].length; j++) 
			{
				//테스트
				//System.out.print("i:" + i + ", j:" + j + "/")
				//System.out.print(n + " ");
				
				//n++;

				arr[i][j] = n;
				n++;
			}
		}
		//System.out.println();


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
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
*/
