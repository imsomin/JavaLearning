package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day02 {
	
	
	public static void main(String[] args) throws IOException
	{
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� ����
		int a, b;  //-- ����� �Է°��� ���� ����
		int c, d, e, f, g; //-- ���� ����� ���� ����
		
		//���� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		c = a + b;
		
		d = a - b;
		
		e = a * b;
		
		f = a / b;
		
		g = a % b;
		
		//���
		System.out.printf("\n=====[���]=====\n");
		
		System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.printf("%d + %d = %d\n", a, b, d);
		System.out.printf("%d + %d = %d\n", a, b, e);
		System.out.printf("%d + %d = %d\n", a, b, f);
		System.out.printf("%d + %d = %d\n", a, b, g);
		
		
		System.out.printf("\n===============\n");
		
		
		
		
		
	}
	

}

/*
ù ��° ���� �Է� : 12
�� ��° ���� �Է� : 24

=====[���]=====
12 + 24 = 36
12 + 24 = -12
12 + 24 = 288
12 + 24 = 0
12 + 24 = 12

===============
*/



