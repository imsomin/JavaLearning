//자바의 기본 입출력(I/O)

//Reader 실습
//Reader : 문자 기반 스트림 객체

package High;

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;


public class day31_2 {
	
	public static void main(String[] args)  throws IOException
	{
		int data;
		char ch;

		Reader rd = new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료:Ctrl+z)");

		while (  (data = rd.read())  !=  -1  )  //문자기반
		{
			ch = (char)data;

			//System.out.print(ch);  //--문자기반 print
			//실행결과
			/*
			문자열 입력(종료:Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
			가나다라
			*/

			
			System.out.write(ch); //--바이트기반 write
			//실행결과
			/*
			문자열 입력(종료:Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
                             섆|
			*/

		}


	}

}
