//��ø Ŭ����

package High;


//outer
class Test2
{
	static int a = 10;  //--> ��������, Test2�� �������, static ����(Ŭ����class ����)
	int b = 20;         //--> ��������, Test2�� �������, non-static����(�ν��Ͻ�instance ����)    

	void write()  //--> ù ��° write �޼ҵ� (b�� write�� ź�������� ����)
	{
		System.out.println("write()...(1)");
		//�������� c,d
		final int c = 20;  //c�� ���ȭ�� ������(���� ������ �ʴ� ����)
		int d = 40;        //d�� ���������̳� ���� ���÷� ���� �� �ִ� �����̴�

		//�޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, local class, ���� Ŭ����)
		//inner
		class LocalTest  //����Ŭ����, ����Ŭ����  
		{
			void write()  //--> �� ��° write �޼ҵ�
			{
				System.out.println("write()...(2)");
				System.out.println("a :" + a);
				System.out.println("b :" + b);
				System.out.println("c :" + c);
				//System.out.println("d :" + d);  -->>������ ���� �߻�
			}
		}

		//===============================================
		//    ���� c�� ���� d�� �Ѵ� ��������������
		//    c�� fianl �����̱� ������
		//    �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//    ������ ������ ������� �� �ִ�.
		//    �ݸ鿡 d �� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//    LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//    ������ �� �� �� �� ���� ������
		//    �̷� ������ d �� � ���� ����ִ��� ������� �� ���� ������
		//    ���� d �� �����ϴ� ���� ���� �� �ֵ��� ���������� ó���Ѵ�.
		//===============================================


		//LocalTest lt = new LocalTest(); //��

		d = 10;  
		d -= 30;

		LocalTest lt = new LocalTest(); //��
		//�� �ν��Ͻ��� ��ġ(ź������)�� �� �� ����.
		//�׷��� d���� ��� ��� ���� �� �𸣹Ƿ� d�� �������� ���ϵ��� ���Ƴ��� ���̴�.
		lt.write();  //-->> �� ��° write() �޼ҵ� ȣ��


		d += 10;

		//LocalTest lt = new LocalTest(); //��



	}



}

public class day21_1 {
	
	public static void main(String[] args)
	{

     Test2 ob = new Test2();
	 ob.write();   //-->> ù ��° write() �޼ҵ� ȣ��
	 //������
	 /*
	 write()...(1)
	 write()...(2)
	 a :10
	 b :20
	 c :20
	 */



	}

}
