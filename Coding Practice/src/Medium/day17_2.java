//정렬(sort) 알고리즘

//향상된 버블 정렬(Bubble Sort)

//앞에서 본 Selection Sort 와 Bubble Sort의 성능 비교(->반복의 횟수로 추정)시, 성능은 같다.
//하지만 향상된 버블 정렬은 대상 데이터의 구조에 따라서
//일반 버블 정렬이나 선택 정렬보다 성능이 좋을 수 있다.

//원본 데이터 : 61  15  20  22  30
//              15  20  22  30  61 (-> 스왑(자리바꿈) 발생 => true)  -> 다음 회전 진행 ○
//				15  20  22  30  61 (-> 스왑(자리바꿈) 발생 => false) -> 다음 회전 진행 X
//+ swap(스왑) : 두 개의 데이터의 자리를 바꾸어 주는 것



package Medium;

public class day17_2 {
	
	public static void main(String[] args)
	{

		int[] a = {10,  50, 20, 30, 40};

		/*
		10  50  20  30  40
		==  --

		10  20  50  30  40
		    ==  --

		10  20  30  50  40 
		        ==  --
		
		10  20  30  40  50
		            ==  --

		----------------------------------1회전 -> 스왑 발생

		10  20  30  40  50
		==  --

		10  20  30  40  50
		    ==  --
		
		10  20  30  40  50
		        ==  --

		-----------------------------------2회전 -> 스왑 발생하지 않음
		//-->> 1회전 수행과 2회전 수행 후,
		//     2회전에서 스왑이 전혀 일어나지 않았기 때문에
		//     추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
		//     수행하지 않도록 한다.
		
				X
				X
		-----------------------------------3회전 없음
		        X
		-----------------------------------4회전 없음

		*/

		int i, j;

		System.out.print("Source Date : ");

		

		for ( int b : a )
		{
			System.out.print(b + " " ); 
		}
		System.out.println();
		//실행결과
		//Source Date : 10 50 20 30 40


		int pass=0;

		boolean flag;  //-> 자리가 바뀌었는지 아닌지 확인하는 데 필요

		
		//향상된 Bubble Sort(버블 정렬)
		do
		{
			flag = false;   // 이번 회전에서는 자리 바꿈이 일어나지 않을 것이라고 전제함
			pass++;         // 자리 회전이 일어나지 않으면 false하고 마무리


		for (i=0; i<a.length-pass; i++)   
		{     
			//테스트
			//System.out.println("정렬");   
			//실행결과
			/*
			정렬
			정렬
			정렬
			정렬
			정렬
			정렬
			정렬
			 */
			//-->> 총 7번의 정렬이 발생함을 알 수 있다.

				if (a[i] > a[i+1])
				{
					//자리바꿈
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;
					//-- 단 한번이라도 스왑이 발생하게 되면
					//   flag 변수는 true 로 변경된다!
				}
			}
		}
		while (flag);
		//--flag 변수가 false 라는 것은
		//  회전이 부분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//  더 이상의 반복문 수행은 무의미한 것으로 판단이 가능하다!




		System.out.print("Sorted Data : ");

		for (int b : a)
		{
			System.out.print(b + " ");
		}
		System.out.println();
		//실행결과
		//Sorted Data : 10 20 30 40 50 

	}

}
