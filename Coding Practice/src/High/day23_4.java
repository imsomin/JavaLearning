//�ڹ��� �ֿ�(�߿�) Ŭ����

//Wrapper Ŭ����


package High;

public class day23_4 {
	
	public static void main(String[] args)
	{

		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		//3
		System.out.println(i2);
		//256

		print(b2);
		print(i2);
	

		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();   //--��ڽ�

		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();     //--��ڽ�
	
		int i4 = b2.byteValue();    //--�ڵ� ����ȯ �������� ����
	
		//byte b4 = i2.intValue();  //--���� �߻�(�ڵ� �� ��ȯ ����)
		byte b4 = i2.byteValue();

		
		System.out.println(b3);
		//3
		System.out.println(i3);
		//256

		System.out.println(b4); 
		//0
		System.out.println(i4);
		//3

	}




	/*
	static void print(Byte b)
	{
	}

	static void print(Integer i)
	{
	}

	static void print(Object obj)
	{
	}
	*/
	
	// java.lang.Number Ŭ����(�߻� Ŭ����)
	// ��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number�� �Ѿ���鼭
	// �� ĳ������ �Ͼ�� �ȴ�.
	// Auto-Boxing �� �Ͼ�� �ȴ�.
	static void print(Number n)
	{
		//System.out.println("n = " + n);
		/*
		n = 3
		n = 256
		*/
		
		System.out.println("n = " + n);
		System.out.println("iv = " + n.intValue());
		//������
		/*
		n = 3
		iv = 3
		n = 256
		iv = 256
		*/
	}



}
