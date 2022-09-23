//StringTokenizer 클래스

/*
 -이는 문자열 파싱(parsing)을 위한 정보를 제공하는 클래스로
  파싱하고자 하는 문자열을 인자로 받아 생성하는데,
  여기에 '파싱 parsing'이란 하나의 문자열을 여러 문자열로
  나누는 작업을 의미하게 되며, 이때 나누는 단위가 되는 문자열을
  토큰(token)이라고 한다.

 -StringTokenizer 클래스를 사용하기 위해서는
 java.util 패키지의 StringTokenizer 를 import 해야 한다.

 -StringTokenizer 클래스는 호환성을 유지하는 목적으로
  보관 유지되고 있으며 문자열을 파싱하기 위해서는
 String 클래스의 split() 메소드나 java.util.regex 패키지를(regular 정규표현)
  사용할 것을 권장하고 있다.
 */

/*
   StringTokenizer(String str)
   StringTokenizer(String str, String delim)
   StringTokenizer(String str, String delim, boolean returnDelims)
   -> 주어진 문자열 str 을 단어로 분리하는 객체를 생성하며
             공백(구분)문자는 delim 에 포함된 문자로 처리하게 된다.
	    만약 returnDelims 가 true 이면
	    구분 문자도 분리된 데이터로 처리하게 된다.
*/
 

package High;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class day24_4 {
	
	public static void main(String[] args) throws IOException
	{

		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파싱할 문자열 입력(컴마 구분) : ");
		strTemp = br.readLine();
		//--"사과,딸기,바나나,토마토"


		//StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp를 대상 문자열로("사과,딸기,바나나,토마토")
		//  ','를 구분자로 설정

		//st 의 'countTokens()' 메소드 호출
		//'int countTokens()'
		// : 파싱된 문자열의 갯수를 리턴(반환)한다.
		strArr = new String[st.countTokens()];
		//                  ----------------
		//                          4

		//strArr = new String[4];
		//--4개짜리 방을 만든다.


		n=0;
		while (st.hasMoreTokens())
		{
			strArr[n++] = st.nextToken();
		}
		//대상이 보이니까(다음값이 있으니까, true) 데려올 수 있다.
		//strArr[0] = "사과";
		//strArr[1] = "딸기";
		//strArr[2] = "바나나";
		//strArr[3] = "토마토";

		//--'hasMoreTokens()'
		//  : 사용할 수 있는 토큰이 남아있는 경우 true 를 반환
		//    더 이상 사용할 토큰이 없는 경우 flase 를 반환
		//    확인 결과만 반환할 뿐
		//    실제 내용을 읽어들이지 않고,
		//    실제 내용을 읽어들이는 헤드를 이동시키지 않는다.

		//--'nextToken()'
		//  : 다음 토큰을 얻어온다.
		//    다음 토큰을 얻어오며 헤드를 이동시키게 된다.
		//    구분자를 바꾸었을 경우 다음 호출에도
		//	     바뀐 구분자를 이용하여 토큰을 분리한다.


		System.out.print("파싱된 토큰(문자열) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//실행결과
		/*
		파싱할 문자열 입력(컴마 구분) : 사과,딸기,바나나,토마토
		파싱된 토큰(문자열) : 사과 딸기 바나나 토마토 
		 */


	}

}
