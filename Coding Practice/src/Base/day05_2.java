package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05_2 {
	
	public static void main(String[] args) throws IOException
	{
		
		//����(1)
		/*
		//����ڷκ��� ������ �� ������ �Է¹޾�
		//���� �� ���� ū �� ������ ���� ���Ῡ
		//����� ����ϴ� ���α׷��� ����
		
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� ����
		int n;  //--���� ������ Ȱ���� ����
		int su1, su2; //--ù��°, �ι�° ����� �Է°��� ��Ƴ� ����
		int result=0; //-- �������� ���� ����
		

		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());
		
		
		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2�� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1>su2)
		{
			//�ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//�ݺ� ���� ����
		//�ݺ� ������ �����ϱ� ����
		//���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		//(��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ� �� ���� �ݺ��������� ����ϰ� �Ǹ� ������ ���� Ȯ���� �� ���� ����)
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		//��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d%n", su1, su2, result);
		
		//���
		//ù ��° ���� �Է� : 45
		//�� ��° ���� �Է� : 8
		//>> 8 ~ 45 ������ �� : 1007
		*/
		
		
		
		
		//����(2)
		//����ڷκ��� ������ ������ �Է¹޾�
		//1���� �Է¹��� �� ����������
		//��ü �հ�, ¦���� �հ�, Ȧ���� ����
		//���� ��������� ����ϴ� ���α׷��� ����
		
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� ����
		int n;        //-->> ����ڷκ��� ������ ������ ���� ����
		int sum;      //-->> ������ ����
		int oddSum;   //-->> Ȧ���� ����
		int evenSum;  //-->> ¦���� ����
		int num=1;    //-->> 1 ~ num���� ��������, �̶� num�� �ʱⰪ�� 1�̴�.
				
		sum = oddSum = evenSum = 0;  //���߿�!!!! ���� ���� '0'���� �ʱ�ȭ�س�����.
				
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

				
		//���� ó��
		while (num<=n)   
		{
			sum += num;           //-->>������

			if (num%2==0)         //-->>¦����
			{
				evenSum += num; 
			}
		    else if (num%2==1)    //-->>Ȧ����
			{
				oddSum += num;
			}
			num++;

		}
				
	
		//��� ��� 
		System.out.printf(">> 1 ~ %d ���� ������ �� : %d%n", n, sum);
		System.out.printf(">> 1 ~ %d ���� ¦���� �� : %d%n", n, evenSum);
		System.out.printf(">> 1 ~ %d ���� Ȧ���� �� : %d%n", n, oddSum);
						
		//���
		//������ ���� �Է� : 34
		//>> 1 ~ 34 ���� ������ �� : 595
		//>> 1 ~ 34 ���� ¦���� �� : 306
		//>> 1 ~ 34 ���� Ȧ���� �� : 289
		
	}

}
