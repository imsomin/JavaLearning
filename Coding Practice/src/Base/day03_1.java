package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day03_1 {
	
	public static void main(String[] args)  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����
		int a, b, c;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		
		
		//1.  ù ��° ������ �� ��° �������� Ŭ ���
		if (a>b)
		{
			//�ڸ��ٲ� (a�� b)
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a>c)
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		//-- ù��° ���� ���ķ� ���� ���ǵ� Ȯ�� �ʿ� ����
		//-- ù��° ���� ���ķ� ���� � ���ǵ� Ȯ�� �ʿ� ���� ������ else if Ȱ�� ����
		//-- �׷��Ƿ� �������� �������� if���� ����Ѵ�.


		//2.  ù ��° ������ �� ��° �������� Ŭ ���... �ڸ��ٲ�

		//3.  �� ��° ������ �� ��° �������� Ŭ ���... �ڸ��ٲ�

		
		System.out.printf("\n>> ���� ��� : %d %d %d%n", a, b, c);

		
		}

}


/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 8
�� ��° ���� �Է� : 9

>> ���� ��� : 5 8 9
*/