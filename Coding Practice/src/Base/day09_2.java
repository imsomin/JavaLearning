//return �ǽ�

//return�� �ΰ��� �ǹ�
//1. ���� ��ȯ
//2. �޼ҵ��� ����

package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day09_2 {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s;

		System.out.print("������ ���� �Է�(10 �̻�): ");
		n =Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			//--�޼ҵ� ���� - ���� ��� : main()�޼ҵ� -> ���α׷� ����
			//return�� ���� ���� �� ������ ��� ���ϱ�
		}

		s=0;
		for (int i=0 ; i<=n ; i++)
		{
			s += i;
		}

		System.out.println("��� : " + s);


	}

}

//���
/*
������ ���� �Է�(10 �̻�): 12
��� : 78

//return�� ���� ��
������ ���� �Է�(10 �̻�): 2
10 �̻��� ������ �Է��ؾ� �մϴ�.

//return�� ���� �ʾ��� ��
������ ���� �Է�(10 �̻�): 7
10 �̻��� ������ �Է��ؾ� �մϴ�.
��� : 28
*/