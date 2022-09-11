//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//  1  2  3  4  5
//  5  1  2  3  4
//  4  5  1  2  3
//  3  4  5  1  2
//  2  3  4  5  1


package Medium;

public class day13_3 {
	
	public static void main(String[] args)
	{
		
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		
		for (int i=0; i<arr.length; i++) //행은 배열의 길이만큼 도므로 5행이 출력될 것이다.
		{
			for(int n=1, j=i ; n<=5; n++)   //n -> 1 2 3 4 5
			{
				//System.out.println(i + "-" + j + " "); 
				//결과
				/*
				0-0 
				0-1 
				0-2 
				0-3 
				0-4 
				1-1 
				1-2 
				1-3 
				1-4 
				1-0 
				2-2 
				2-3 
				2-4 
				2-0 
				2-1 
				3-3 
				3-4 
				3-0 
				3-1 
				3-2 
				4-4 
				4-0 
				4-1 
				4-2 
				4-3
				 */
														
				arr[i][j] = n;  //인덱스를 이용한 초기화
				/*
				00  01  02  03  04  
				10  11  12  13  14  
				20  21  22  23  24
				30  31  32  33  34
				40  41  42  43  44
				(ij  ij  ij  ij  ij)
				 */
														
				j++;                                    
				if(j==5)
					j=0;


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
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
*/
