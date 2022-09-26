//예외 (Exception) 처리

//(잡은)예외 다시 던지기


package High;

public class day26_4 {
	
	public static void main(String[] args) 
	{
		day26_4 ob = new day26_4();

		try
		{
			int a = ob.getValue(-2);          //(7) 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)					  //(8) 예외 잡아내기
		{
			//(9) 잡아낸 예외 처리
			System.out.println("ⓑ printStackTrace");
			e.printStackTrace();
		}

		
	}
	
	public int getData(int data) throws Exception
	{
		if (data < 0)
		{
			throw new Exception("data 가 0 보다 작습니다.");
			// (1) 예외 발생
		}

		return data + 10;
	}

	public int getValue(int value) throws Exception //(6) 잡아낸 예외를 다시 던지는 것이 가능하도록 처리
	{
		int a = 0;

		try
		{
			a = getData(-2);  //(2) 예외 발생
		}
		catch (Exception e)   //(3) 예외 잡아내기
		{
			// (4) 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace");
			e.printStackTrace();

			
			// (5) 잡아낸 예외를 다시 던진다 ★
			//-->> (3)에서 잡아낸 예외를 다시 던진다.
			throw e ;
			

		}

		return a;
	}


}

//결과 (getData가 -2 일때)
/*
ⓐ printStackTrace
java.lang.Exception: data 가 0 보다 작습니다.
	at High.day26_4.getData(day26_4.java:33)
	at High.day26_4.getValue(day26_4.java:46)
	at High.day26_4.main(day26_4.java:16)
ⓑ printStackTrace
java.lang.Exception: data 가 0 보다 작습니다.
	at High.day26_4.getData(day26_4.java:33)
	at High.day26_4.getValue(day26_4.java:46)
	at High.day26_4.main(day26_4.java:16)
*/

//결과 (getData가 2 일때)
//a : 12