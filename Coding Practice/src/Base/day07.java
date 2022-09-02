//for문 (반복문) 실습

/*
'for'문은 정해진 횟수만큼 반복해야 하는 경우
유용하게 사용되어지는 반복문으로
'while'문과 마찬가지로 반복 실행해야 하는 구문이
조건에 맞지 않을 경우 한 번도 수행하지 않을 수 있으며
루프 변수의 초기값, 조건식/증감식 등을 한 지점에서 확인할 수 있기 때문에
가독성이 높은 반복문에 해당한다.
*/

//형식 및 구조
/*
for (수식1; 수식2; 수식3)
{
	실행문;
}
*/

package Base;

public class day07 {
	
	
	public static void main(String[] args)
	{

		//while문과 for문 비교 실습
		
		int n=1, m;   
		//n : while에서 사용할 수 있는 루프 변수
		//m : for에서 사용할 루프 변수

		while (n<=10)
		{
			System.out.println("n=" + n);
			n++;
		}

		System.out.println();

		//위의 while문을 for문으로 바꾼다.

		for (m=1; m<=10; m++)
			System.out.println("m=" + m);
		


	}
	
	

}

//결과
/*
n=1
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10

m=1
m=2
m=3
m=4
m=5
m=6
m=7
m=8
m=9
m=10
*/



