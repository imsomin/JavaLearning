//���� (Exception) ó��

//�ٸ� ���� �ٽ� ������

package High;

public class day26_5 {
	
	public int getValue(int value)  throws Exception          //(7) �� ���� ������  
	{
	
		int a = 0;

		try
		{
			a = getData(-2);								  //(3) �� ���� �߻�
		}												


		catch (Exception e)									  //(4) �� ���� ��Ƴ���
		{													
			// (5) �� ���� ó�� 
			System.out.println("�� printStackTrace");
			e.printStackTrace();

			// (6) �� ���� �߻� 
			throw new Exception("value �� �����Դϴ�.");


		}

		return a;

	}

	public int getData(int data) throws Exception              //(2) �� ���� ������
	{														  
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");   //(1) �� ���� �߻�
		}													
		return data + 10;
	}


	public static void main(String[] args)
	{
		day26_5 ob = new day26_5();

		try
		{
			int a = ob.getValue(-2);                               //(8) �� ���� �߻�

			System.out.println("a : " + a);
		}
		catch (Exception e)										   //(9) �� ���� ��Ƴ��� 
		{
			// (10) �� ���� ó�� 
			System.out.println("�� printStackTrace");
			e.printStackTrace();
		}

	}

}

//���
/*
�� printStackTrace
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
�� printStackTrace
	at High.day26_5.getData(day26_5.java:40)
	at High.day26_5.getValue(day26_5.java:16)
	at High.day26_5.main(day26_5.java:52)
java.lang.Exception: value �� �����Դϴ�.
	at High.day26_5.getValue(day26_5.java:27)
	at High.day26_5.main(day26_5.java:52)
*/