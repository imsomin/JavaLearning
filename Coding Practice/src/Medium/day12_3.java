//�迭�� �⺻�� Ȱ��

//����ڷκ��� �ο����� �Է¹ް�
//�Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
//�̸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
//����� ����� �� �ִ� ���α׷��� �����Ѵ�.

package Medium;

import java.util.Scanner;

public class day12_3 {
	
	public static void main(String[] args)
	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//����ڰ� �Է��ϴ� �л����� ��Ƴ� ����
		int n = 0;

		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1-10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		
		System.out.printf("����ڰ� �Է��� �ο� �� : %d%n" , n);
		System.out.println();
		
		//�ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[n];

		//�ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		//String[] tels = new String[n];
		String[] tels = new String[names.length];

		//�ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		//for (int i=0; i<names.legnth; i++)
		//for (int i=0; i<tels.legnth; i++)
		for (int i=0; i<n; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		//���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println("-----------------------");
		System.out.printf("��ü �л� �� : %d��%n", n);
		System.out.println("-----------------------");
		System.out.println("�̸�      ��ȭ��ȣ   ");

		for (int i=0; i<n; i++)
		{
			System.out.printf("%4s %14s%n", names[i], tels[i]);
		}
		System.out.println("-----------------------");
		
	}

}


//���
/*
�Է� ó���� �л� �� �Է�(��, 1-10) : 2
����ڰ� �Է��� �ο� �� : 2

�̸� ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : ���ٻ� 010-2222-2222
-----------------------
��ü �л� �� : 2��
-----------------------
�̸�      ��ȭ��ȣ   
 ������  010-1111-1111
 ���ٻ�  010-2222-2222
-----------------------
*/
