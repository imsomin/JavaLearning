//break �ǽ�
//�����, (+�׸��� ����������.)

package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day09 {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s, i;
		//   n : ����ڰ� �Է��� ������ ���� ��
		//   s : ������ ���� ����� ��Ƴ� ����  --'s'�ʱ�ȭ Ȯ���ϱ�! ������ ���⼭ ������ �ʱ�ȭ�� ���߿�(���� ������)
		//   i : 1���� 1�� ������� �Է°����� ������ ����

		char ch;  //-- ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����

		//�Է°��� ��ȿ�� ���� �ƴҶ� ��� �ݺ��� (��ȿ�� ���� �ش��ϸ� ����)
		while (true)
		{
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			//�׽�Ʈ(Ȯ��)
			//System.out.println("��ȿ�� ���� �Է� �Ϸ�!");

			s = 0;   //--�ʱ�ȭ�ϴ� ��ġ Ȯ���ϱ�

			//--------------�������ʹ� ������ ���ϱ�------------------

			for (i=1; i<=n ; i++)
				s += i;
		
			System.out.printf(">>1~%d������ �� : %d%n", n, s);
		

		
		System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
		ch = (char)System.in.read();   //--�빮�ڼҹ��ڸ� �񱳿����ؾ��ϴµ� �������·δ� �Ұ����ؼ� �� ��ȯ

		//�׸��� �ǻ� ǥ�� ó��
		//�ݺ����� ���߰� �������� �� �ִ� ó��
		//if(ch=='N' || ch=='n')   
		// Y �Ǵ� y �Է��� �� �ƴѰ� Ȯ���Ѱ�?
		// Y �Ǵ� y ����� �� NO ���
		if(ch!='Y' && ch!='y')    //�빮�� Y�� �ƴϾ�������� �ҹ��� y�� �ƴϾ�� �Ѵ�.
			{
				//�ݺ����� ���߰� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//--���� ���� �ǻ� ǥ���� �ߴٸ�
				//  �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				System.out.println("��� ������");
				break;
				//--�����, (+�׸��� ����������.)

			}//end if

			//���Ͱ�(\r\n) ó��
			System.in.skip(2);

		}//end while

		
		
		


	}//end main

}

//���
/*
������ ���� �Է� : 64
>>1~64������ �� : 2080
����Ͻðڽ��ϱ�(Y/N)? : y

������ ���� �Է� : 1000

������ ���� �Է� : 23
>>1~23������ �� : 276
����Ͻðڽ��ϱ�(Y/N)? : n
��� ������
*/
