//예외 (Exception) 처리

package High;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class day26_1
{
	private String[] data = new String[3];

	public void proc() // throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;
		
		/*
		System.out.print("이름 입력[종료:Ctrl+z] : ");

		while ( (str = br.readLine() ) != null )
		{
			data[n++] = str;
			System.out.print("이름 입력[종료:Ctrl+z] : ");
		}

		System.out.println("입력된 내용");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
		 */

		try
		{ 
			System.out.print("이름 입력[종료:Ctrl+z] : ");

			while ( (str = br.readLine() ) != null )
			{
				data[n++] = str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace");
			e.printStackTrace();
		}
		

		System.out.println("입력된 내용");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}
	
	
	public static void main(String[] args) // throws IOException
	{
		day26_1 ob = new day26_1();
		ob.proc();
	}
}

//결과
/*
이름 입력[종료:Ctrl+z] : 가나다
이름 입력[종료:Ctrl+z] : 마바사
이름 입력[종료:Ctrl+z] : 아자차
이름 입력[종료:Ctrl+z] : 입력된 내용
가나다
마바사
아자차
*/
