//������(Constructor)

package Base;

class NumberTest2
{
	int num;

	//����� ���� �����ڰ� ���ǵǾ� �����Ƿ� default ������ �ڵ����� ���Ե��� ����.
	/*
	NumberTest2()
	{
	}
	*/

	//������ -> ����� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}


	int getNum()
	{
		return num;
	}
	


}


public class day11_1 {
	
	public static void main(String[] args)
	{
		
		//NumberTest2 �ν��Ͻ� ����
		//NumberTest2 ob1 = new NumberTest2();
		//������ ���� �߻�
		// �ڡڡڡڡ�
		//����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		//����Ʈ �����ڰ� �ڵ����� ���Ե��� ������
		//����ڰ� ������ �����ڴ� �Ű������� ���� �����̱� ������ 
		//���� ���� �Ű����� ���� ������ ȣ�� �� ������ �߻��ϰ� �ȴ�.
		
		NumberTest2 ob1 = new NumberTest2(10);
		System.out.println("�޼ҵ� ��ȯ �� : " + ob1.getNum());
		
		System.out.println("===========================");
		
		NumberTest2 ob2 = new NumberTest2(3567);
		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());

	}

}

//���
/*
������ ȣ�� �� �Ű����� ���� : 10
�޼ҵ� ��ȯ �� : 10
===========================
������ ȣ�� �� �Ű����� ���� : 3567
�޼ҵ� ��ȯ �� : 3567
*/
