//�� day10_4�� ��Ʈ

//���� ���̿� �ѷ� ���ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.

package Base;

import java.io.IOException;

public class day10_3 {
	
	public static void main(String[] args) throws IOException
	{

		//day10_4 Ŭ���� ��� �ν��Ͻ� ����
		//day10_4 ��ü ����
		day10_4 ob = new day10_4();   
		
		//import�� �� �ص� �ȴ�.
		//���� ��Ű�� �ȿ� �ֱ� ������ ���� ���ص� �ȴ�.

		ob.input();  //->������ �Է¹޴� ����

		double a = ob.calArea();

		double length = ob.calLength();

		ob.print(a, length);



	}

}

//���
/*
������ �Է� : 4
>>�������� 4 �� ����
>>���� : 50.27
>>�ѷ� : 25.13
*/