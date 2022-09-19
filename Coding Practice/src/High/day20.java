//�������̽�(Interface)

/*
(1)�������̽��� ������ �̿ϼ��� ä�� ������
�������̽� �ȿ� �����ϴ� �� � �޼ҵ嵵
��ü(���Ǻ�)�� ���� ������ ��ǻ� ���� �κ��� �������� �ʴ´�.
  
(2)��, Ŭ������ ���� ���ø����ν��� ����� �����ϴ�
�߻� Ŭ������ �� �����̴�.
�ϳ��� �߻� Ŭ������ �ƴϸ� �ȵȴ�.

(3)�������̽��� Ŭ������ �޸� ���� ����� �����ϸ�
�������̽� ��ü�� ��ӵȴ�.

(4)������ C++ ��� ��� �����Ǵ� '���� ���'�� 
��� �������� ���� �������� ������ױ� ������
�ڹٿ����� ���� ����� ������ '�������̽�'��� �������� �����Ͽ�
�������̽��� ���� ���� ����� �����ϴ� ����� �����Ѵ�.

(5)�������̽��� ����� �߻� �޼ҵ常 ���� �� ������
�������̽� ���� �޼ҵ���� �������������ڸ� ������� �ʾƵ�
'public'���� �����Ǿ� Ŭ�������� ����(implements)�����ν�
�ٷ� ������ �̷���� �� �ִ�.

(6)Ư¡
  -�߻� Ŭ������ ������ ���� �ְ� ���ǰ� ����.
  -final ������ ���� �� �ִ�. (����� ����)
  -�������̽��� 'public static final' ����� ���� �� �ִ�.
  -�������̽��� �����ϱ� ���ؼ��� extends ��ſ� implements �� �̿��Ѵ�.
  -�ϳ� �̻��� �������̽��� implements �� �� �ִ�.
  -�������̽��� implements �� Ŭ������ �������̽��� ��� �޼ҵ带 �������̵��ؾ��Ѵ�.
  -�������̽��� �ٸ� �������̽��� ��ӹ��� �� ������ �̶�, extends Ű���带 ����Ѵ�.
  -����, Ŭ������ �޸� �������̽��� ���� ����� �����ϴ�.

*/

package High;

//�������̽�
interface Demo
{
	public static final double PI = 3.141592;

	//�������̽��� ��� ������
	//'static final'�� ������ ������� �ʾƵ�
	//�ڵ����� 'static final'�� �����̴�!
	public int a = 10;


	//�������̽� ���� Ŭ������ ��� �߻��̹Ƿ�
	//abstract�� �ڵ����� �Ǿ��ִ� �����̴�!
	//public abstract void print() 
	public void print();  //-> �������̽����� �޼ҵ尡 ���ǵǾ �ȵȴ�, '����'�� �ؾ��Ѵ�.
	/*
	{
		System.out.println("PI : " + PI);
	}
	*/


}


//Ŭ����
//class DemoTest
//class DemoTest extends Demo    // X
//class DemoTest implements Demo // O
//��
//�߻� Ŭ���� - �������̽��� �����ϴ� �߻� Ŭ����
//abstract class DemoTest implements Demo

//Ŭ���� - �������̽��� �����ϴ� Ŭ����
class DemoTest implements Demo
{
	@Override
	public void print()
	{
		System.out.println("�������̽� �޼ҵ� ������");
	}
	
	public void write()
	{
		System.out.println("Ȯ��");
		System.out.println("Ŭ������ ���ǵ� �޼ҵ�");
	}
}



//main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����
public class day20 {
	
	public static void main(String[] args)
	{
		//Demo�� �������̽��̹Ƿ� ��ü ���� �Ұ�
		//Demo ob = new Demo();

		//DemoTest ob = new DemoTest();
		//--> print() �޼ҵ� ������ �� ����!!!

		//DemoTest obTemp = new DemoTest(); -- (O)
		//Demo ob = (Demo)obTemp;  -- (O)
		//Demo ob = obTemp;  -- (O)


		//�� �� ĳ����
		//�������̽� ��ü�� ���� ��ü
		Demo ob = new DemoTest();
		
		ob.print();
		//--> �������̽� �޼ҵ� ������

		//ob.write();
		//���� �߻�(�����Ͽ���)

		
		//�� �ٿ� ĳ����
		((DemoTest)ob).write();
		//--> Ȯ��
		//--> Ŭ������ ���ǵ� �޼ҵ�

		System.out.println(Demo.PI);   
		//static�̹Ƿ� ������ ���� �������
		//-->>3.141592

		System.out.println(Demo.a);    
		//static(�ڵ����� ����)
		//-->>10

		//Demo.a = 30;                   
		//final �־ �ȵ�
		//���� �߻�(�����Ͽ���)

	}

}
