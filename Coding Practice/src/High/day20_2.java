//�������̽�(Interface)

package High;


//�������̽�
interface Demo2
{
	public void write();
	public void print();
}

//Ŭ����
//class DemoTest
// ��
//class DemoTest implememts Demo
// ��
abstract class DemoTest3 implements Demo2 //-> �������̽��� �����ϴ� �߻� Ŭ����
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������");
	}

	//public void print();

}



//class DemoTestSub
// ��
//class DemoTestSub extends DemoTest
// ��
//abstract class DemoTestSub extends DemoTest  //-->�߻�Ŭ������ ��ӹ޴� �߻�Ŭ����
// ��
//-->�������̵��ϸ鼭 �߻� ��� �� ���� 
//��, �߻� Ŭ������ ��ӹ޴� Ŭ������ �ȴ�.
class DemoTestSub extends DemoTest3          
{
	/*
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������");
	}
	*/

	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������");
	}
	
	
}


public class day20_2 
{
	public static void main(String[] args)
	{
		//Demo ob5 = new Demo();
		//�ν��Ͻ� ���� �Ұ� -> �������̽�

		//DemoTest ob5 = new DemoTest();
		//�ν��Ͻ� ���� �Ұ� -> �߻�Ŭ����

		DemoTestSub ob5 = new DemoTestSub();

		ob5.write();
		ob5.print();
		//-->write() �޼ҵ� ������
		//-->print() �޼ҵ� ������

	}

}
