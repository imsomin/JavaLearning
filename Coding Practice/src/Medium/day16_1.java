//�޼ҵ��� �ߺ�����(Method Overloading)

package Medium;

public class day16_1 {
	
	public static void main(String[] args)
	{

		//��� 1
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

	//���� �׸��� �޼ҵ� ����
	//public void drawLine() 
	public static void drawLine()  //���(2)
	{
		System.out.println("====================");
	}
	
	//���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}


	//���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

	


}
