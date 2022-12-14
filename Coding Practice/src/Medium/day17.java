//정렬(sort) 알고리즘

/*
○정렬
: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○정렬의 목적
: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
: 즉, 보기 좋게 검색하기 위함

○정렬의 종류
: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ...

*/

//선택 정렬(Selection Sort)

//실행 예)
//Source Data : 52 42 12 62 60
//Sorted Data : 12 42 52 60 62



package Medium;

public class day17 {
	
	public static void main(String[] args)
	{
		//정수 형태의 배열 'a'
		int[] a = {52, 42, 12, 62, 60};
		
		
		/*

		42 52 12 62 60
		== --

		12 52 42 62 60
		==    --

		12 52 42 62 60
		==       --

		12 52 42 62 60
		==          --

		-------------------------------1회전

		12 42 52 62 60
		   == --
		
		12 42 52 62 60
		   ==    --

		12 42 52 62 60
		   ==       --

		-------------------------------2회전

		12 42 52 62 60
			  == --

		12 42 52 62 60
		      ==    --

		--------------------------------3회전

		12 42 52 60 62
				 == --

		--------------------------------4회전

		*/

		int i, j;

		System.out.print("Source Date : ");

		//향상된 for문
		//for ( 요소를 하나 꺼냈을 때의 데이터 타입  : 자료구조 )
		for ( int b : a )
		{
			System.out.print(b + " " );  //요소 하나 꺼내고 공백(반복)
		}
		System.out.println();



		//Selection Sort(선택 정렬)
		for (i=0; i<a.length-1; i++)       //비교기준데이터(0     1    2   3)
		{								   //			|    |    |   |
			for (j=i+1; j<a.length; j++)   //비교대상데이터(1234  234  34  4)
			{
				if (a[i] > a[j])  //현재 오름차순임, 내림차순하려면 부등호만 바꾸어주면 된다.
				{
					//자리바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
					
				}
			}
		}


		System.out.print("Sorted Data : ");

		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();





	}
	
	
	

}


//결과
/*
Source Date : 52 42 12 62 60 
Sorted Data : 12 42 52 60 62 
 */



