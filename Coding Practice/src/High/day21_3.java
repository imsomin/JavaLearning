//��ø Ŭ����


/*
�۹��� Ŭ����(�͸��� Ŭ���� : anonymous Ŭ����)

-awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
-���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
-Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.
 

������ �� ����

 new ����Ŭ������ ������()
 {
	 �������������� �ڷ��� �޼ҵ�()
	 {
		 ...;
	 }

};

*/


package High;


//outer class
class Test3 //extends Object  -->>Object class ���
{
	
	/*
	//Object class�� �����...
	public String toString()
	{
		...;
	}
	*/

	public Object getString()
	{
		/*
		return new Object();
		       ---------------->> Object ��
		*/

		
		/*
		return new Object(){};
		return new Object(){Ư���޼ҵ�(->toString)�籸��};
		*/

		return new Object()  //��ü�� ��ȯ�� ����
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����";
			}
		};  //<<-- �����ݷ� �� �ۼ� �� ���� �߻�!!!
	}
}



public class day21_3 //extends Object  -->>Object class ���
{
	
	/*
	Object�� ���� �ִ� �����...
	*/


	public static void main (String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//-->>High.Test3@7852e922


		System.out.println(ob1.getString());
		//-->>�͸��� Ŭ����

	}

}
