//�迭�� �⺻�� Ȱ��

//����ڷκ��� ������ �л� ���� �Է¹ް�
//�׸�ŭ�� ����(���� ����)�� �Է¹޾�
//��ü �л� ������ ��, ���, ������ ���Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

package Medium;

import java.util.Scanner;

public class day12_5 {
	
	public static void main(String[] args)
	{

		//���� ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		
		int n; //�л���
		int sum=0;  //��
		double avg=0, dev=0;  //���, ����

		
		//���� �� ó��
		System.out.print("�л� �� �Է� : ");
		n = sc.nextInt();


		//�Է¹��� �л� ���� ���� �迭 ����
		int[] arr = new int[n];


		//�迭�� ���ڸ� �ϳ��� �Է¹ޱ�
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1);

			arr[i]= sc.nextInt();

			sum += arr[i];
		}
		

		//��� ���ϱ�
		avg = sum/n;  


		System.out.println();
		System.out.printf(" >> �� : %d%n", sum);
		System.out.printf(" >> ��� : %.1f%n", avg);
		System.out.println(" >> ���� : ");



		for (int i=0; i<n; i++)
		{
			System.out.printf("%d : %.1f%n", arr[i], avg-arr[i]);
		}


	}
}

//���
/*
�л� �� �Է� : 3
1�� �л��� ���� �Է� : 85
2�� �л��� ���� �Է� : 97
3�� �л��� ���� �Է� : 78

 >> �� : 260
 >> ��� : 86.0
 >> ���� : 
85 : 1.0
97 : -11.0
78 : 8.0
*/
