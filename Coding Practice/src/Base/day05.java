//while�� 
//while(���ǽ�)
//{ ���๮ ; }

/*
���ǽ��� ���� ���Ͽ�
���ǽ��� ó�� ����� ���� ���
Ư�� ������ �ݺ� �����ϴ� ����
�ݺ� Ƚ���� ������ ���� ���� ��쳪 �ݺ� Ƚ���� ���� ��� �ַ� ���
������ ���� �ʴ� ��� �� �ѹ��� ������� ���� �� ����
*/


package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05 {
	
	public static void main(String[] args) throws IOException
	{
		
		//����(1)
		/*
		//1���� 100������ ���� ����Ͽ�
		//����� ����ϴ� ���α׷��� ����
		
		//1���� ���ʷ� ��� 1�� �����ϴ� ���� ���� �� �ʱ�ȭ
		int n=1;
		
		//�������� ����Ͽ� ��Ƴ� ���� ���� �� �ʱ�ȭ
		int sum=0;
		
		//���� �� ó��(�ݺ��� ����)
		while(n<=100)    //���� n�� 100���� ���ų� �۴ٸ�
		{
			sum += n;    //sum�� n��ŭ �������Ѷ�
			
			n++;        //n�� 1�� ������ ������ ���� �߰�
		}
		
		//��� ���
		System.out.println("1���� 100������ �� : " + sum);
		//-->> 1���� 100������ �� : 5050
		*/
		
		
		
		
		//����(2)
		/*
		//1���� 100������ ���� �߿���
		//¦������ ���� ����Ͽ� ������� ����ϴ� ���α׷��� ����
		
		//�ֿ� ���� ���� �� �ʱ�ȭ
		int n = 2;
		int sum=0; //¦������ ���� ���� ��
		
		//���� �� ó��(�ݺ� ����)
		while(n<=100)
		{
			sum += n; //sum ���� n ��ŭ ����
			n += 2;   //n ���� 2 ��ŭ ����
		} 
		
		//��� ���
		System.out.println("1���� 100������ �� �� ¦���� �� : " + sum);
		//-->>1���� 100������ �� �� ¦���� �� : 2550
		*/
		
		
		
		
		//����(3)
		/*
		//1���� 100������ ���� �߿���
		//¦������ �հ� Ȧ������ ���� ���� �����Ͽ� ���
		
		//�ֿ� ���� ����
		int n=1;
		int even=0;
		int odd=0;
		
		//���� �� ó��
		while (n<=100) {
			if (n%2==0) {
				even += n;
			}
			else if (n%2!=0) {
				odd += n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			
			n++;
		}
		
		//������
		System.out.println("1���� 100������ ���� ��");
		System.out.println("¦���� �� : " + even);
		System.out.println("Ȧ���� �� : " + odd);
		
		//���
		//1���� 100������ ���� ��
		//¦���� �� : 2550
		//Ȧ���� �� : 2500
		*/
		
		
		
		
		//����(4)
		/*
		//�ش� �������� �������� ���ϴ� ���α׷� ����
		
		//�ֿ� ���� ���� �� �ʱ�ȭ
		int n = 0;
		int result = 1; //���� ���� ���� ������ 1�� �ʱ�ȭ�Ѵ�
		
		//���� �� ó��
		//�ش簪�� 5�� �������� ���...
		while (n<5) {
			n++;
			result *= n;
		}
		
		//��� ���
		System.out.print("���� ��� : " + result);
		//-->>���� ��� : 120
		*/
		
		
		
		
		//����(5)
		// n / (n+1) �� ���� ó���� ����ϴ� ���α׷� ����
		
		//�ֿ� ���� ���� �� �ʱ�ȭ
		int n = 0;       //1���� 1�� �����ϰ� �� ����
		double sum = 0;  //�������� ��Ƴ� ���� (�Ǽ� ���·� ó��)
		
		//���� �� ó��
		// 0 1 2 3 4 5 6 7 8 
		while (n<9) {
			//������ ����
			//�̴� ���������� �ݺ����� ������ ���ʶ߸��� ���谡 �Ǵ� ������
			n++;
			
			sum += (double)n/(n+1);
			//���� ��� ������ ������ ���� ��ȯ�ϱ� ������
			//�Ǽ� ��� ������ �����ϵ��� ó���ϱ� ���ؼ�
			//������ �����ڸ� �߽����� �ǿ����� �� �ϳ���
			//�Ǽ� ���·� ������ִ� ���� �߿��ϴ�.
			//��, n���� ���� ���������� �Ǽ��� �ٲ��ִ� ���̴�.
			
		}
		
		//��� ���
		System.out.printf("���� ��� : %f%n " , sum);
		//-->>���� ��� : 7.071032
		
		
		
		
		
	}

}








