//정렬(sort) 알고리즘

//버블 정렬(거품 정렬, Bubble Sort)

//실행 예)
//Source Data : 52 42 12 62 60
//Sorted Data : 12 42 52 60 62


package Medium;

public class day17_1 {
	
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		
		/*

		42  52  12  62  60
		==  --
		
		42  12  52  62  60
		    ==  --

		42  12  52  62  60
		        ==  --

		42  12  52  60  62
		            ==  --
		
		---------------------------------1회전

		12  42  52  60  62
		==  --

		12  42  52  60  62
		    ==  --
		
		12  42  52  60  62
				==  --

		----------------------------------2회전

		12  42  52  60  62
		==  --

		12  42  52  60  62
			==  --
		
		----------------------------------3회전

		12  42  52  60  62
		==  --

		----------------------------------4회전

		*/


		int i, j;

		System.out.print("Source Date : ");

		

		for ( int b : a )
		{
			System.out.print(b + " " ); 
		}
		System.out.println();

		
		//Bubble Sort(버블 정렬)
		for (i=1; i<a.length; i++)   //뒤에서 비교 대상을 하나씩 줄여주는 역할
		{                                  //1      2      3      4
			for (j=0; j<a.length-i; j++)   //0123   012    01     0 (비교기준자리) vs 1234  123  12  1 (비교대상자리)
			{
				if (a[j] > a[j+1])
				{
					//자리바꿈
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}


		System.out.print("Sorted Data : ");

		for (int b : a)
		{
			System.out.print(b + " ");
		}
		System.out.println();


		
	}

}


//결과
/*
Source Date : 52 42 12 62 60 
Sorted Data : 12 42 52 60 62 
*/
