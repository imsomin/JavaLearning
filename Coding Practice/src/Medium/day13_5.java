//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//	E J O T Y   --  0
//	D I N S X   --  1
//	C H M R W   --  2
//	B G L Q V	--  3
//	A F K P U   --  4

package Medium;

public class day13_5 {
	
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		char start = 'A';

		for (int i=0; i<5; i++)   
		{
			for (int j=4; j>=0; j--) 
				arr[j][i] = start++;
			// [4][0] 
			// [3][1] 
			// [2][2]  
			// [1][3]  
			// [0][4]  
			
		}


		//전체 요소 출력 구문
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}


	}

}

//결과
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
 */
