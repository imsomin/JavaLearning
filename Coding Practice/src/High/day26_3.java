//���� (Exception) ó��

//day26_2.java �� ��

// �� throw      cf) throws

package High;

class Practice2
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{
			//return;    
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class day26_3 {
	
	public static void main(String[] args) throws Exception //setValue ������...
	{
		Practice2 ob2 = new Practice2();

		try
		{
			//ob2.setValue(-3);  
			//--> java.lang.Exception: value �� 0���� �۰ų� ���� �� �����ϴ�.
			
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
