//배열의 배열(2차원 배열)

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//  A  
//  C  B  
//  D  E  F
//  J  I  H  G     
//  K  L  M  N  O

package Medium;

public class day14_2 {
	

	public static void main(String[] args)
	{

		//5X5 배열 만들기
		char[][] arr = new char[5][5];

		//배열에 넣을 변수에 알파벳 지정
		char a = 'A';      

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(i%2!=0) //만약 i가 2의 배수(0, 2, 4)라면 알파벳을 역순으로
				{
					arr[i][i-j] = a;
				}
				else       //만약 i가 2의 배수가 아니라면(1, 3, 5) 알파벳을 순차적으로
				{
					arr[i][j] = a;
				}
				a++;
			}
		}


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
C  B
D  E  F
J  I  H  G
K  L  M  N  O
*/
