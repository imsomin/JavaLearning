//�ڹ��� �ֿ� Ŭ����

//Calendar Ŭ����

//�ǽ� ����
//������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//�� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� -> add

//���� ��)
//���� ��¥ : 2022-2-3 �����
//�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//===========[Ȯ�� ���]=============
//   200�� �� : xxxx-xx-xx x����
//===================================


package High;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class day25_2 {
	
	public static void main(String[] args)
	{
		//Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar ob = Calendar.getInstance();

		//Calendar ob = new GregorianCalendar();

		int y;
		int m;
		int d;
		int w;
		int days;  //������ ��¥ ��  -->> ����ڷκ��� �Է¹��� �� ��

		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};


		//���糯¥ ���
		//int y; //��
		y = ob.get(Calendar.YEAR);

		//int m; //��
		m = ob.get(Calendar.MONTH)+1;   //��'+1' 

		//int d; //��¥
		d = ob.get(Calendar.DATE);

		//int w; //����
		w = ob.get(Calendar.DAY_OF_WEEK);

		//���� ��¥ ���
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y,m,d,week[w-1]);
		//--> ���� ��¥ : 2022-9-24 ��

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			days = sc.nextInt();
		}
		while (days<1);


		ob.add(Calendar.DATE, days);

		/* �ѹ� �� �ʱ�ȭ�� �ʿ䰡 ���� �� (���� �������� ����)
		y = ob.get(Calendar.YEAR);

		
		m = ob.get(Calendar.MONTH)+1; 

		
		d = ob.get(Calendar.DATE);

		
		w = ob.get(Calendar.DAY_OF_WEEK);
		*/


		//��� ���
		System.out.println("\n===========[Ȯ�� ���]============");

		System.out.printf("%d�� �� : %tF %tA\n", days, ob, ob);    
		//��¥ ��ü �޴� �� %t
		//2022-05-14 -> %tF
		//�����     -> %tA

		System.out.println("===============================");
				

	}

}

//���
/*
���� ��¥ : 2022-9-24 ��
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 100

===========[Ȯ�� ���]============
100�� �� : 2023-01-02 ������
===============================

*/

