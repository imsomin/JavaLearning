//�ڹ��� �⺻ �����(I/O)

//flush�� ����

package High;

public class day31_3 {
	
	public static void main(String[] args)
	{

		// System.out  :   �ڹ� �⺻ ��� ��Ʈ��


		System.out.write(65);  //--> 'A'
		System.out.write(66);  //--> 'B'

		System.out.write(180); 
		System.out.write(235); 
		//--> 180 + 235 -> '��'

		System.out.flush();    //��

		// �� ��� ���۰� ä������ ������
		//	  ����� ������(�ڷ�)�� ��� ����̽�(��ġ)�� ������ �ʱ� ������
		//   flush() �޼ҵ带 ���� ���� �� ä������ ���� ��� ������ ������
		//	  ��� ��ġ�� �о�� ���� �� �ֵ��� ó���ؾ� �Ѵ�.

		//    ��, ���� ���������� 'System.out.flush()' ������ ������ �� ����.
		//    flush�� ���־�� �о�� ��µ�!


	}

}
