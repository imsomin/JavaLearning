//�� day10_3�� ��Ʈ

//���� ���̿� �ѷ� ���ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.

package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day10_4 {
	
	//��� ���� -> �ֿ� �Ӽ�
	final double PI = 3.141592;  //-> ������(������ ���ȭ)
	int r;                       //-> ���� ������

	//�޼ҵ�(1)		
    //��� �޼ҵ� -> �ֿ� ���(����, ����)
	//������ �Է� ��� -> �޼ҵ� ����
	void input() throws IOException
	{
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());


	}

	
	//�޼ҵ�(2)
	//���� ��� ��� -> �޼ҵ� ����
	double calArea()
	{

		double result;

		result = r * r * PI;

		return result;

		//return r * r * PI;

	}


	//�޼ҵ�(3)
	//�ѷ� ��� ��� -> �޼ҵ� ����
	double calLength()
	{
		double result;

		result = 2 * r * PI;

		return result;
				
		//return 2 * r * PI;
		
	}

	//�޼ҵ�(4)
	//��� ��� -> �޼ҵ� ����
	void print(double a, double l)
	{
		System.out.printf(">>�������� %d �� ����\n", r);
		System.out.printf(">>���� : %.2f\n", a);
		System.out.printf(">>�ѷ� : %.2f\n", l); 
			
	}


}
