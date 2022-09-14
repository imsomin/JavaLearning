//메소드의 중복정의(Method Overloading)

package Medium;

public class day16_1 {
	
	public static void main(String[] args)
	{

		//방법 1
		/*
		day16_1 ob = new day16_1();

		ob.drawLine();
		*/
	
		drawLine();  //-- non-static
		//====================

		drawLine('-');
		//--------------------
		
		drawLine('<');
		//<<<<<<<<<<<<<<<<<<<<

		drawLine('+', 30);
		//++++++++++++++++++++++++++++++

		drawLine('/', 50);
		////////////////////////////////////////////////////
		
	}

	//선을 그리는 메소드 정의
	//public void drawLine() 
	public static void drawLine()  //방법(2)
	{
		System.out.println("====================");
	}
	
	//선의 형태를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}


	//선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

	


}
