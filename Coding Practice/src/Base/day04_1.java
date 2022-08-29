//break; : 멈춘다 빠져나간다
//continue; : 뒷부분 무시하고 계속해라

//case 문 뒤에 'break;'가 없는 형태인 경우
//다음 case 문의 문장을 계속해서(이어서) 수행하게 된다 (->기본모델)

//'break;'가 존재할 경우
//해당지점에서 수행을 멈춘 후 switch 문을 빠져나간다(->일반모델)


package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day04_1 {
	
	public static void main(String[] args)  throws IOException
	{
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int a;


		System.out.print("임의의 정수 입력(1~3) :");
		a = Integer.parseInt(br.readLine());
	
		
		/*
		//방법 1
        switch (a)
        {
			case 1 : System.out.println("★")             ; break;
			case 2 : System.out.println("★★")           ; break;
			case 3 : System.out.println("★★★")         ; break;
			default : System.out.println("입력오류~!!!")  ; //break;
        }  
		
		System.out.println("스위치 문 끝!");
		
		//방법1의 결과
		임의의 정수 입력(1~3) :3
		★★★
		스위치 문 끝!
		*/
	
		
		

		/*
		//방법2
		switch (a)
		{
			default: System.out.println("입력 오류~!!!"); break;
			case 3 : System.out.print("★");       
			case 2 : System.out.print("★");        
			case 1 : System.out.print("★");  
		
		}

			System.out.println();
		
		//방법2의 결과
		임의의 정수 입력(1~3) :3
		★★★
		*/

		
		
		
		
		//방법3
		switch (a)
		{
			case 3 : System.out.print("★");       
			case 2 : System.out.print("★");        
			case 1 : System.out.print("★");  break;

			default: System.out.println("입력 오류~!!!"); 
		
		}

			System.out.println();
		
		//방법3의 결과
		//임의의 정수 입력(1~3) :3
		//★★★
		

			
			
	}


}



