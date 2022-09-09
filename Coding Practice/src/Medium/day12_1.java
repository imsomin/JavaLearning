//배열의 기본적 활용

//임의의 정수들이 들어있는 배열의 숫자 데이터들 중
//짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
//프로그램을 구현한다.

package Medium;

public class day12_1 {
	
	public static void main(String[] args)
	{
		//배열 선언(두 가지 방법으로 선언 가능)
		/*
		int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		//첫번째 배열
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		
		//System.out.println(arr);
		//-->>arr : [I@15db9742
		//일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		//배열에 담긴 데이터들을 출력할 수 없다.

		
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<9; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("============================");
		
		
		//두번째 배열
		int[] arr2 = {4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8};

		
		//배열 arr의 길이(방의 갯수) 확인
		//arr.length
		//System.out.println(arr.length);
		//->9
		//System.out.println(arr2.length);
		//->45


		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("============================");
		
		
		
		System.out.println("짝수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{
			/*
			if (i%2==0)  //-> i가 짝수라면... -> 짝수 번째에 해당하는 요소라면...
			{ 
			System.out.print(arr[i] + " ");
			}
			*/

			if (arr[i]%2==0) //-> i번째 요소가 짝수라면... 
			{
			System.out.print(arr[i] + " ");
			}
		}
		System.out.println(); 

		
		System.out.println("============================");
		
		
		System.out.println("3의 배수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%3==0)  //i번째 요소가 3의 배수라면...
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

	}

}


//결과
/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8 
============================
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8 
============================
짝수 선택적 출력
4 2 6 8 
============================
3의 배수 선택적 출력
9 3 6 
*/