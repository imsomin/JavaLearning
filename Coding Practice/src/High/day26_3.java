//예외 (Exception) 처리

//day26_2.java 와 비교

// ※ throw      cf) throws

package High;

class Practice2
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{
			//return;    
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class day26_3 {
	
	public static void main(String[] args) throws Exception //setValue 때문에...
	{
		Practice2 ob2 = new Practice2();

		try
		{
			//ob2.setValue(-3);  
			//--> java.lang.Exception: value 는 0보다 작거나 같을 수 없습니다.
			
			ob2.setValue(3);
			//--> 3 

			int result = ob2.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

}
