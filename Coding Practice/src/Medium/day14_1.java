//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//  A  
//  B  C
//  D  E  F
//  G  H  I  J
//  K  L  M  N  O

package Medium;

public class day14_1 {
	
	public static void main(String[] args)
	{

		//5X5 배열 만들기
		char[][] arr = new char[5][5];

		//배열에 넣을 변수에 알파벳 지정
		char a = 'A';


		//배열에 값 채우기
		for (int i=0; i<arr.length; i++)  
		{ 
			for (int j=0; j<i+1; j++)
			{
				arr[i][j] = a;
				a++;
			}
		}
		
		//==================================
		// 'j<i+1'을 해주는 이유
		// j가 i+1보다 작을 때에 루프를 만들게 한다.
		// (열이 행보다 그 숫자가 하나가 더 작을 때)
	    // i(=행, 줄)가 다음 줄로 넘어가면
	    // 그에 따라 나타나는 알파벳의 수가 늘어난다.
		// 즉,
		// 0열 < 1행
		// 1열 < 2행
		// 2열 < 3행
		// 3열 < 4행
		// 4열 < 5행
		//==================================




		//배열 출력하기
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}
		System.out.println();
		}


	}

}

//결과
/*
A
B  C
D  E  F
G  H  I  J
K  L  M  N  O
*/