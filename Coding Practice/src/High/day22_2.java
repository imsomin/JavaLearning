//�ڹ��� �ֿ�(�߿�) Ŭ����

//Object Ŭ����

package High;

class Testclass   // extends Object
{
	/*
	...
	public boolean equals(Object obj)
	{
		 ...
	}
	...

	*/

	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}




public class day22_2 {
	
	public static void main(String[] args)
	{
		Testclass ob1 = new Testclass();
		Testclass ob2 = new Testclass();

		System.out.println("10 == 9 : " + (10 == 9));
		//-> 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		//-> a == b : true

		//(1) '==' �� �����ڴ� �ǿ������� ũ�⸦ ��!

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//-> ob1 == ob2 : false

		//(2) ��ü(object)���� ���ϴ� �������� ����ϴ� '==' �����ڴ�
		//    ũ�⸦ ���ϴ� ���� �ƴ϶� ��ü�� �ּҸ� ��!

		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		//-> ob1.equals(ob2) : false

		//(3) '==' �����ڿ� Object Ŭ������ equals() �޼ҵ��
		//    ������ �������� ��ü�� �ּҸ� ��!

		System.out.println();
		System.out.println("---------------------------------------");

		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());

		System.out.println("ob2            : " + ob2);
		System.out.println("ob2.toString() : " + ob2.toString());

		System.out.println("---------------------------------------");
		System.out.println();

		//======================================
		//'Ŭ������ @ �ؽ��ڵ�'

		// �ؽ��ڵ�(hashcode)
		// : �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��
		// : �޸��� �ּҰ����� �����ϸ� ����� �� �ȴ�.

		// ��ü�� ������ hashcode(�ؽ��ڵ�)�� ������,
		// �ؽ��ڵ尡 ���ٰ� �ؼ� ���� ��ü�� �ƴϴ�.
		//======================================


		
	}

}

//���
/*
---------------------------------------
ob1            : High.Testclass@7852e922
ob1.toString() : High.Testclass@7852e922
ob2            : High.Testclass@4e25154f
ob2.toString() : High.Testclass@4e25154f
---------------------------------------
*/
