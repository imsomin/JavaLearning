package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day03 {
	
	public static void main(String[] args) throws IOException
	{ 
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ֿ� ���� ����
		int n;
		
		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		//��� ���
		//2�� 3�� ��� ó��
		
		if (n%2==0 && n%3==0) {
			System.out.printf("%d -> 2�� 3�� ���\n" , n);
		}
		else if (n%2==0) {
			System.out.printf("%d -> 2�� ���\n" , n);
		}
		else if (n%3==0) {
			System.out.printf("%d -> 3�� ���\n" , n);
		}
		else if (n%2!=0 && n%3!=0) {
			System.out.println(n + "-> 2�� 3�� ����� �ƴ�\n");
		}
		else {
			System.out.println(n + "-> ���� �Ұ�\n");
		}
		
		
	}

}




/*
������ ���� �Է� : 3
3 -> 3�� ���

������ ���� �Է� : 71
71-> 2�� 3�� ����� �ƴ�
*/
