//�ڹ��� �ֿ� Ŭ����

//Calendar Ŭ����

/*
- java.util.Calendar Ŭ������
��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
��, ��, ��, ����, ��, ��, �� ������
�ð��� ��¥�� ���õ� ������ �����Ѵ�.
�׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� 
���� ��ü�� ������ �� ������ �������� �޼ҵ� ������ 
Calendar Ŭ������ ���� Ŭ������
GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

- �ý������κ��� ���� �ý��� �ð� ������ ���� �� getInstance() ��� 
����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������
�� ��ü�� �����Ǹ� �����ִ� �ð� ��������
get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

- getInstance() �޼ҵ�� ���������� 
GregorianCalendar ��ü�� �����Ͽ� �����ֱ� ������ 
GregorianCalendar ��ü�� ���� �����Ͽ� 
�ð� ������ ���� ���� �ִ�.
*/

//�ǽ� ����
//����ڷκ��� ��, ���� �Է¹޾�
//�޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
//'getActualMaximum()' �޼ҵ� Ȱ��

//���� ��)
//���� �Է� : 0
//���� �Է� : 2022
//�� �Է�   : -2
//�� �Է�   : 16
//�� �Է�   : 7

/*
    [2022�� 7��]

�� �� ȭ �� �� �� ��
====================
                1  2
 3  4  5  6  7  8  9
10 11 12 13 14 15 16
17 18 19 20 21 22 23
24 25 26 27 28 29 30
31
====================
*/

package High;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;


public class day25_1 {
	
	public static void main(String[] args) //throws IOException
	{

		//�ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Calendar ob = new GregorianCalendar();
		Calendar ob = Calendar.getInstance();



		//���� ����
		int y, m;   //��, ��
		int w;      //����
		int i;      //��������

		/*
		//��ü ����
		//int y; //����
		int y = ob.get(Calendar.YEAR);

		//int m; //��
		int m = ob.get(Calendar.MONTH)+1; 

		//int d; //��¥
		int d = ob.get(Calendar.DATE);

		//int a; //����
		int a = ob.get(Calendar.DAY_OF_WEEK);

		//int h; //�ִ� ��¥
		int h = ob.getActualMaximum(Calendar.DATE);

		//�׽�Ʈ
		System.out.println(y + "-" + m + "-" + d + " " + a + "," + h);
		//--> 2022-9-24 7,30
		*/


		
		//���� ó��(�ݺ�)
		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();    //y = Integer.parseInt(br.readLine());
		}
		while (y<=0);  //y<1

		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);  //'��'�� 1���� ���� �ʰ� 12���� ũ�� �ʾƾ� �Ѵ�.


		//����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		//�޷��� ��¥ ����
		ob.set(y, m-1, 1);
		//�� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//�Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.

		//�� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�

		//���õ� �޷��� ��¥�κ��� ���� ��������
		w = ob.get(Calendar.DAY_OF_WEEK);

		//Ȯ��
		System.out.println(w);
		//���� �Է� : 2022
		//��   �Է� : 6
		//4         -> ������(6�� 1��)


		//��� ���
		System.out.printf("\t[%d�� %d��]\n" , y, m);
		System.out.printf(" ��      ��      ȭ      ��      ��      ��      ��");
		System.out.println("\n===========================\n");

		for (i=1; i<w; i++)
		{
			System.out.printf("    ");   //���� 4ĭ �߻�
		}
		
		//�׽�Ʈ
		//System.out.printf("%4d", 1);

		
		for (i=1; i<=ob.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;    //'4'���� �ӹ��� ���� �ƴ϶� �ϳ��� ��������� �ϱ� ������
			        //�ݺ����� �����ϸ� ��¥�� ������ ������
				    //���ϵ� �Բ� ������ �� �ֵ��� ó��
				    //������ ������ �Ͽ����� �� ������
				    //������ �� �ֵ��� ó��
			if(w%7==1)
			{
				System.out.println();
			}
		}

		if (w%7!=1)                   //�Ͽ��� ������ ������� �ʾ��� ��츸
		{
			System.out.println();     //���� ����
		}

		System.out.println("\n===========================\n");
		//���� ���
		/*
			[2022�� 6��]
 		��      ��      ȭ      ��      ��      ��      ��
		===========================

               		1   2   3   4
   		5   6   7   8   9  10  11
 	   12  13  14  15  16  17  18
  	   19  20  21  22  23  24  25
  	   26  27  28  29  30

	    ===========================
		 */
		
		


	}


}
