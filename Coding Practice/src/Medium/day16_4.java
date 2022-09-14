//주민등록번호 유효성 검사

/*
-주민등록번호 검증 공식
1) 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
    123456 - 1234567 (주민번호)
	****** - *******  ---------------------각 자릿수에 곱하기
	234567   892345  (각 자리에 곱해질 수)


2) 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

 ex. 7 5 0 6 1 5 - 1 2 3 4 5 6 7
	* * *  * * *   * * * * * * 
 	2 3 4 5 6 7   8 9 2 3 4 5
	-----------------------------
= 14(7*2) + 15(5*3) + ...
= 217


3) 더해진 결과값은 11로 나누어 '나머지'를 취한다.
      19  -> 몫
     -------------------
  11 | 217		
       11 
	--------------------
	   107
	    99
	--------------------
	     8  -> 나머지

4) 11에서 나머지 8을 뺀 결과값을 구한다.
	
	11 - 8 = 3

	=> 3)의 처리 과정에서 나머지가 0으로 나오는 경우 -> 11 - 0 = 11
	                     1으로 나오는 경우 -> 11 - 1 = 10
	이를 다시 10으로 나누어 나머지를 취한다. (11 -> 1, 10 -> 0)

5) 4)의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지의 여부를 비교한다.
   일치 -> 유효한 주민번호
   불일치 -> 잘못된 주민번호

*/ 

package Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day16_4 {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//입력받는 주민번호(문자열형태)
		String str;

		//주민번호의 각 자릿수에 곱하게 될 수 -> 배열 형태로 구성
		//           7  5  0  6  1  5  -  1  2  3  4  5  6  7
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		//곱셈 연산 후 누적합 (각 곱셈의 결과를 더해 나갈것)
		//-->0으로 초기화
		int tot = 0;

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");   
		//Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.print(">>입력 오류");
			return;  //메소드 종류 -> main 메소드 종료 -> 프로그램 종료
		}

		//테스트
		System.out.println(">>자릿수 적합");

		//반복해서 연산 처리
		for (int i=0; i<13; i++)  // 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			//테스트
			//System.out.print(i + " ");
			
			//str.substring(0, 1); 
			//-->0만 가져옴


			if (i==6)    		 //하이픈(-)부분 건너뛰기
			{
				continue;        //뒷부분 무시하고 계속하라
			}

			
			//str.substring(i, (i+1));
			//곱해야 하므로 형 변환
			//        ↓
			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1))); //뒷부분

		}

		//----------여기까지 수행하면 1) 과 2)를 모두 끝낸 상황이며
		//          규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//          변수 tot에 담겨있는 상황이 된다.


		int su = 11 - tot % 11;
		
		//----------여기까지 수행하면 3) 과 4)를 모두 끝낸 상황이지만
		//          su 에 대한 연산 결과 두 자리로 나올 경우
		//          주민번호 마지막 자리의 숫자와 비교를 수행할 수 없는 상황

		su = su % 10;   // su %= 10;

		if ( su == Integer.parseInt(str.substring(13)) )  //형변환한 결과값이 su 와 같다면
		{
			System.out.println(">>정확한 주민번호");
		}
		else
		{
			System.out.println(">>잘못된 주민번호");
		}

		
	}

}

//결과
/*
주민번호 입력(xxxxxx-xxxxxxx) : 971001
>>입력 오류

주민번호 입력(xxxxxx-xxxxxxx) : 971001-1234567
>>자릿수 적합
>>잘못된 주민번호
*/
