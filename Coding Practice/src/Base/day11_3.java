//������(Constructor)

package Base;

public class day11_3 {
	
	int val1;
	double val2;

	day11_3()
	{
		val1=0;
		val2=0;
		System.out.println("�Ű����� ���� ������");
	}
	
	day11_3(int x)
	{
		val1=x;
		val2=0;
		System.out.println("int�� �����͸��Ű������� �޴� ������");
		
	}

	day11_3(double y)
	{
		val1=0;
		val2=y;
		System.out.println("double�� ������ �Ű������� �޴� �Ű����� ���� ������");
	}

	day11_3(int x, double y)
	{
		val1=x;
		val2=y;
		System.out.println("int�� ������ double�� ������ �Ű������� �޴� ������");
	}

	public static void main(String[] args)
	{
		day11_3 ob1 = new day11_3();

		day11_3 ob2 = new day11_3(4);

		day11_3 ob3 = new day11_3(4,0);

		day11_3 ob4 = new day11_3(4,4);

		System.out.println(ob1.val1 + ", " + ob1.val2);

		System.out.println(ob2.val1 + ", " + ob2.val2);

		System.out.println(ob3.val1 + ", " + ob3.val2);

		System.out.println(ob4.val1 + ", " + ob4.val2);

	}

}


//���
/*
�Ű����� ���� ������
int�� �����͸��Ű������� �޴� ������
int�� ������ double�� ������ �Ű������� �޴� ������
int�� ������ double�� ������ �Ű������� �޴� ������
0, 0.0
4, 0.0
4, 0.0
4, 4.0
*/
