//���� (Exception) ó��

//day26_3.java �� ��

package High;


class Practice
{
	private int value;

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;    //���� -> �޼ҵ� ����
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}


public class day26_2 {
	
	public static void main(String[] args) 
	{
		Practice ob = new Practice();
		//ob.setValue(-3);  //--> 0
		//ob.setValue(3);   //--> 3
		ob.setValue(-5);    //--> 0
		int result = ob.getValue();
		System.out.println(result);
	}

}
