//����(Sort) �˰���

//����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

package Medium;

import java.util.Scanner;

public class day17_3 {
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);


		int inwon;  //--�ο� ��


		//���� ���� Ȱ��===========================================
		//'flag' ������ 
		//�ڵ��� �ϰ� ó���� �� �� Ư�� ������ �������� ��� 
		//Ư�� ����� �����ϵ��� �ϱ� ���ؼ� ���
		//�� flag ������ Ư�� ������ �����Ͽ����� ���θ� ��Ÿ����!
		//������ �ϳ��� ���� booleanŸ��, ������ ���� ���� ���� intŸ�� ���
		//====================================================
		
		
		int pass = 0;
		boolean flag;
		

		//�ο� �� �Է�
		System.out.print("�ο� �� �Է� : ");
		inwon = sc.nextInt();
		

		//�ο� ����ŭ �迭�� ����
		String[] name = new String[inwon];  //--�̸�

		int[] score = new int[inwon];  //--����

		int[] grade = new int[inwon];  //--���



		//�迭 ������ �̸��� ���� ���
		for (int i=0; i<score.length; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : " , i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}


		
		//�⼧�� Bubble Sort(���� ����)
		do
		{
			flag = false;  // �̹� ȸ�������� �ڸ� �ٲ��� �Ͼ�� ���� ���̶� ����
			pass++;        // �ڸ� ȸ���� �Ͼ�� ������ false�ϰ� ������


			//���� ��
			for (int i=0; i<score.length-pass; i++)
			{
				if (score[i] < score[i+1])
				{
					score[i] = score[i]^score[i+1];
					score[i+1] = score[i+1]^score[i];
					score[i] = score[i]^score[i+1];

					String str;						
					str = name[i];
					name[i] = name[i+1];
					name[i+1] = str;

					flag = true;
				}
			}
		}

		while (flag);
		//--flag ������ false ��� ����
		//  ȸ���� ���������� �߻��ϴ� ���� ���� ������ �Ͼ�� ���� ����
		//  �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����!



		//��� ���
		System.out.println();
		System.out.println("=======================");
		

		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d�� %s %d\n", i+1, name[i], score[i]);	
		}


		System.out.println("=======================");




	}

}


//���
/*
�ο� �� �Է� : 4
�̸� ���� �Է�(1, ���� ����) : ������ 90
�̸� ���� �Է�(2, ���� ����) : ���ٻ� 80
�̸� ���� �Է�(3, ���� ����) : ������ 95
�̸� ���� �Է�(4, ���� ����) : Ÿ���� 76

=======================
1�� ������ 95
2�� ������ 90
3�� ���ٻ� 80
4�� Ÿ���� 76
=======================
*/
