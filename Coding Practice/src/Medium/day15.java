//���� ���а� ���� ���� ������(=����������, ����������)

package Medium;


import java.util.Scanner;

class CircleTest2
{

	// ��� ����, �ν��Ͻ� ����, ���� ������ 'num'
	// int num;
	
	//    ��
	
	// ���� ����(Information Hiding)
	// 'private' �̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�

	// int �� ���� ���� -> �ڵ� 0���� �ʱ�ȭ ����
	// �׷��� �װ͵� ���ϰ� ���������� '�����̺�'
	private int num;
	
	//============================
	// getter / setter ����  
	// -->> ���� ä��� �޲ܼ� �ִ� �޼ҵ�
	/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
	*/
	//============================
	
	//�Է� �޼ҵ�
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	
	}

	//���� ��� �޼ҵ�
	double calArea()
	{
		return num * num * 3.141592;
	}

	//��� �޼ҵ�
	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("���� : " + area);
		
	}

	
}


public class day15 {
	
	public static void main(String[] args)
	{
		CircleTest2 ob = new CircleTest2();

		//===================================================
		//ob.num = 10;    -->> �����̺��ϹǷ� �ƿ� ���� �Ұ�!!
		//    ��
		//ob.setNum(10);  -->> �׷��Ƿ� �̿� ���� �������ش�!

		//System.out.println("���� ������ : " + ob.num);
		//    ��
		//System.out.println("���� ������ : " + ob.getNum());
		//===================================================
		
		ob.input();

		double result = ob.calArea();
		ob.write(result);

	}

}

//���
/*
������ �Է� : 6
������ : 6
���� : 113.097312
*/
