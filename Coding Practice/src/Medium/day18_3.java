//���(Inheritance)

//�޼ҵ� �������̵�(Method Overriding)�� Ư¡
/*
-�޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
-�ݵ�� ��� ���谡 �־�� �Ѵ�.
-�����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� 'protected'�� ���
  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
  �������������ڴ� 'protected' �Ǵ� 'public' �̾�� �Ѵ�
-'static', 'final', 'private' �޼ҵ�� �������̵�(Overriding)�� �� ����.
-Exception�� �߰��� �Ұ����ϴ�. ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿� 
 ���ο� Exception �� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�.
*/

package Medium;

//�θ� Ŭ����(���� Ŭ����, super class)
class Super183
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}


//�ڽ� Ŭ����(���� Ŭ����, sub class)
class Sub183 extends Super183
{
	/*  
	private int a = 5;          -->> ��� �� ����
	protected int b = 10;       -->> ����
	public int c = 20;          -->> ����

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}		
	*/
	
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		//->> ����Ŭ�������� ����� ���� a ���� ������ �� ����.(private �����̱� ������)
		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);
		//Sub print() �޼ҵ� : 100 : 20
		
		System.out.println("Sub print() �޼ҵ� : " + b );
		System.out.println("Sub print() �޼ҵ� : " + this.b );
		System.out.println("Sub print() �޼ҵ� : " + super.b );
		//Sub print() �޼ҵ� : 100
		//Sub print() �޼ҵ� : 100
		//Sub print() �޼ҵ� : 10
		//-->> ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//     ���� Ŭ�������� ����� b vs ���� Ŭ�������� ����� b


		System.out.println("Sub print() �޼ҵ� : " + c );
		System.out.println("Sub print() �޼ҵ� : " + this.c );
		System.out.println("Sub print() �޼ҵ� : " + super.c );
		//Sub print() �޼ҵ� : 20
		//Sub print() �޼ҵ� : 20
		//Sub print() �޼ҵ� : 20
		//-->> ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		//     ���� Ŭ�������� ����� c
	}

	@Override
	public void write()
	{
		//System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--Super�ƴϰ� Sub
		//--�θ𿡰� �޾Ƽ� ��� ��ģ�ٰ� ��������
	
		//���� Ŭ�������� ����� ���� a���� ������ �� ����.  -->> private �����̱� ������...
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);													 
		//Sub print() �޼ҵ� : 100 : 20											  
														 
	}



}



public class day18_3 {
	
	public static void main(String[] args)
	{
		// ���� Ŭ����(Sub) �ν��Ͻ� ����
		Sub183 ob = new Sub183();

		ob.print();
		//--> Sub print() �޼ҵ� : 100 : 20


		ob.write();
		//--> Super write() �޼ҵ� : 5 : 10 : 20

		System.out.println("------------------------------");

		System.out.println(ob.b);
		//100

		System.out.println(((Super183)ob).b);
		//10

		((Super183)ob).write();
		//Sub write() �޼ҵ� : 100 : 20

	}

}
