//예외 (Exception) 처리

//day26_3.java 와 비교

package High;


class Practice
{
	private int value;

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;    //종료 -> 메소드 종료
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
