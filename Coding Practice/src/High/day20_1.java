//�������̽�(Interface)

package High;


//�������̽�
interface ADemo
{
	public void write();
}

//�������̽�
interface BDemo
{
	public void print();
}

//�� �������̽��� 2�� �̻��� ������ �� �ִ�.
// -> ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����.


//Ŭ����
//class DemoTest
//class DemoTest extends ADemo, BDemo     // X
//class DemoTest implements ADemo, BDemo  //����(implements)�ϴ� ���� �߻�Ŭ�����̴�  // O


//Ŭ���� - �� �������̽��� ������ Ŭ����
class DemoTest2 implements ADemo, BDemo
{
	//======================================================
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带
	// �������̵��� ��
	// '@Override' ������̼�(annotation)�� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵��� ������
	// JDK 1.5������ '@Override' ������̼�(annotation)�� ����� �����ϴ�.
	//======================================================
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()");
	}

	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()");
	}
}



//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class day20_1 {
	
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();    //--�������̽� -> �ν��Ͻ� ���� �Ұ�
		//BDemo ob = new BDemo();    //--�������̽� -> �ν��Ͻ� ���� �Ұ�

		//ADemo, BDemo �������̽��� ������
		//Ŭ���� ����� �ν��Ͻ� ����
		DemoTest2 ob2 = new DemoTest2();

		ob2.write();
		ob2.print();
		//--> ADemo �������̽� �޼ҵ� write()
		//--> BDemo �������̽� �޼ҵ� print()

		ADemo ob3 = new DemoTest2();   //--�� ĳ����
		BDemo ob4 = new DemoTest2();   //--�� ĳ����

		//ob3.print(); //���� �߻�
		//ob4.write(); //���� �߻�


		((BDemo)ob3).print();
		((ADemo)ob4).write();
		//--> BDemo �������̽� �޼ҵ� print()
		//--> ADemo �������̽� �޼ҵ� write()
		//--DemoTest2 Ŭ������ �� �������̽��� ��� �����߱� ������ 
		//  ���� ���谡 �����Ǿ ���� ���̵� �����ϴ�.
		//  ����, DemoTest2 Ŭ������ �̵� �� �� �������̽��� �����ߴٸ�
		//  ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.


		ob4.print();
		ob3.write();
		//--> BDemo �������̽� �޼ҵ� print()
		//--> ADemo �������̽� �޼ҵ� write()


		//�ٿ� ĳ���ÿ� �ش���
		((DemoTest2)ob4).write();
		//--> ADemo �������̽� �޼ҵ� write()

	}

}
