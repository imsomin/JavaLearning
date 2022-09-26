//예외 (Exception) 처리

//다른 예외 다시 던지기

package High;

public class day26_5 {
	
	public int getValue(int value)  throws Exception          //(7) ● 예외 던지기  
	{
	
		int a = 0;

		try
		{
			a = getData(-2);								  //(3) ○ 예외 발생
		}												


		catch (Exception e)									  //(4) ○ 예외 잡아내기
		{													
			// (5) ○ 예외 처리 
			System.out.println("○ printStackTrace");
			e.printStackTrace();

			// (6) ● 예외 발생 
			throw new Exception("value 가 음수입니다.");


		}

		return a;

	}

	public int getData(int data) throws Exception              //(2) ○ 예외 던지기
	{														  
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");   //(1) ○ 예외 발생
		}													
		return data + 10;
	}


	public static void main(String[] args)
	{
		day26_5 ob = new day26_5();

		try
		{
			int a = ob.getValue(-2);                               //(8) ● 예외 발생

			System.out.println("a : " + a);
		}
		catch (Exception e)										   //(9) ● 예외 잡아내기 
		{
			// (10) ● 예외 처리 
			System.out.println("● printStackTrace");
			e.printStackTrace();
		}

	}

}

//결과
/*
○ printStackTrace
java.lang.Exception: data 가 0 보다 작습니다.
● printStackTrace
	at High.day26_5.getData(day26_5.java:40)
	at High.day26_5.getValue(day26_5.java:16)
	at High.day26_5.main(day26_5.java:52)
java.lang.Exception: value 가 음수입니다.
	at High.day26_5.getValue(day26_5.java:27)
	at High.day26_5.main(day26_5.java:52)
*/