//�迭�� �⺻�� Ȱ��

//����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
//�Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

package Medium;

import java.io.IOException;
import java.util.Scanner;

public class day12_4 {
	
	public static void main(String[] args) throws IOException
	{

		//���� ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);

		int max = 0;  //-->>�ִ��� ������� ����

		
		//���� ó��
		System.out.print("�Է��� �������� ���� : ");
		int n = sc.nextInt();


		//�迭 ����
		int[] arr = new int[n];


		//�迭 �� ������ ���� �ϳ��� �ֱ�
		System.out.print("������ �Է�(���� ����) : ");


		for (int i=0; i<n; i++)
		{
			int data = sc.nextInt();
			arr[i] = data;
		}


		//�� ū ���� �ִ����� �ϱ�
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max)
				max=arr[i];
			
		}

		//���� ū �� ���
		System.out.printf(">> ���� ū �� -> %d%n", max);

	}

}

//���
/*
�Է��� �������� ���� : 5
������ �Է�(���� ����) : 12 3 56 23 13
>> ���� ū �� -> 56
*/

