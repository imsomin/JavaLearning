package Base;

import java.util.Scanner;

public class day03_2 {
	
	public static void main(String[] args)
	{
		//���� ����
		Scanner sc = new Scanner(System.in);

		int evenSum = 0;  //¦���� ���� ��Ƴ� ���� ���� �� �ʱ�ȭ
		int oddSum = 0;   //Ȧ���� ���� ��Ƴ� ���� ���� �� �ʱ�ȭ
		int a, b, c, d, e;  //�Է¹��� �ټ� ���� ������ ��Ƶ� ���� ����

		//���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���鱸��) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		//a�� ¦���� �� evenSum�� a��ŭ ����
	    //    Ȧ���� �� oddSum�� a��ŭ ����


		if (a%2==0)
		{
			evenSum += a;                  //evensum ������ ���� ������ �밳 '0'���� �ʱ�ȭ�Ѵ�.
				                           //'evensum + a'�� ���� evensum�� �ٽ� �ֱ�
										   //�������� ��쿡�� '1'�� ������ �� ������.
		}
		else 
		{
			oddSum += a;
		}

		//b�� ¦���� �� evenSum�� b��ŭ ����
	    //    Ȧ���� �� oddSum�� b��ŭ ����

		if (b%2==0)
		{
			evenSum += b;
		}
		else 
		{
			oddSum += b;
		}


		//c�� ¦���� �� evenSum�� c��ŭ ����
	    //    Ȧ���� �� oddSum�� c��ŭ ����

		if (c%2==0)
		{
			evenSum += c;
		}
		else 
		{
			oddSum += c;
		}


		//d�� ¦���� �� evenSum�� d��ŭ ����
	    //    Ȧ���� �� oddSum�� d��ŭ ����

		if (d%2==0)
		{
			evenSum += d;
		}
		else 
		{
			oddSum += d;
		}

		//e�� ¦���� �� evenSum�� e��ŭ ����
	    //    Ȧ���� �� oddSum�� e��ŭ ����

		if (e%2==0)
		{
			evenSum += e;
		}
		else 
		{
			oddSum += e;
		}



		//��� ���
		System.out.printf("\n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", evenSum, oddSum);


		
	}

}

/*
������ ���� 5�� �Է�(���鱸��) : 23 56 12 5 7

>> ¦���� ���� 68 �̰�, Ȧ���� ���� 35 �Դϴ�.
*/
