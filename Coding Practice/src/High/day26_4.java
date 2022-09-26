//���� (Exception) ó��

//(����)���� �ٽ� ������


package High;

public class day26_4 {
	
	public static void main(String[] args) 
	{
		day26_4 ob = new day26_4();

		try
		{
			int a = ob.getValue(-2);          //(7) ���� �߻�
			System.out.println("a : " + a);
		}
		catch (Exception e)					  //(8) ���� ��Ƴ���
		{
			//(9) ��Ƴ� ���� ó��
			System.out.println("�� printStackTrace");
			e.printStackTrace();
		}

		
	}
	
	public int getData(int data) throws Exception
	{
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");
			// (1) ���� �߻�
		}

		return data + 10;
	}

	public int getValue(int value) throws Exception //(6) ��Ƴ� ���ܸ� �ٽ� ������ ���� �����ϵ��� ó��
	{
		int a = 0;

		try
		{
			a = getData(-2);  //(2) ���� �߻�
		}
		catch (Exception e)   //(3) ���� ��Ƴ���
		{
			// (4) ��Ƴ� ���ܿ� ���� ó��
			System.out.println("�� printStackTrace");
			e.printStackTrace();

			
			// (5) ��Ƴ� ���ܸ� �ٽ� ������ ��
			//-->> (3)���� ��Ƴ� ���ܸ� �ٽ� ������.
			throw e ;
			

		}

		return a;
	}


}

//��� (getData�� -2 �϶�)
/*
�� printStackTrace
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
	at High.day26_4.getData(day26_4.java:33)
	at High.day26_4.getValue(day26_4.java:46)
	at High.day26_4.main(day26_4.java:16)
�� printStackTrace
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
	at High.day26_4.getData(day26_4.java:33)
	at High.day26_4.getValue(day26_4.java:46)
	at High.day26_4.main(day26_4.java:16)
*/

//��� (getData�� 2 �϶�)
//a : 12