package Base;

public class day07_1 {
	
	public static void main(String[] args)
	{
		
		//문제(1)
		//1 부터 100까지의 정수 중에서
		//4의 배수만 출력하는 프로그램을 구현
		//단, for문을 활용해야 하며
		//한 줄에 5개씩만 출력할 수 있도록 함
		
		
		//방법1
		
		for (int n=4  ; n<=100  ;  n+=4 )     //4의 배수
		{ 
			if (n%4==0)                       //만약 4의 배수라면
			{
				System.out.printf("%4d", n);  //해당 값을 출력하라
			}
			
			if (n%(4*5)==0)                   //출력 구문이 4*5의 배수가 될 때 마다
			{
				System.out.println();         //개행
			}
			
		}
	
		


		//방법2
		/*
		for (int i=1  ; i<=100  ;  i++ )     
		{ 
			if (i%4==0)                       //만약 4의 배수라면
			{
				System.out.printf("%4d", i);  //해당 값을 출력하라
			}
			
			if (i%(4*5)==0)                   //출력 구문이 4*5의 배수가 될 때 마다
			{
				System.out.println();         //개행
			}
		}
		*/



	}


}


//결과
/*
 4   8  12  16  20
24  28  32  36  40
44  48  52  56  60
64  68  72  76  80
84  88  92  96 100
*/