//break; : ����� ����������
//continue; : �޺κ� �����ϰ� ����ض�

//case �� �ڿ� 'break;'�� ���� ������ ���
//���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ� (->�⺻��)

//'break;'�� ������ ���
//�ش��������� ������ ���� �� switch ���� ����������(->�Ϲݸ�)


package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day04_1 {
	
	public static void main(String[] args)  throws IOException
	{
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� ����
		int a;


		System.out.print("������ ���� �Է�(1~3) :");
		a = Integer.parseInt(br.readLine());
	
		
		/*
		//��� 1
        switch (a)
        {
			case 1 : System.out.println("��")             ; break;
			case 2 : System.out.println("�ڡ�")           ; break;
			case 3 : System.out.println("�ڡڡ�")         ; break;
			default : System.out.println("�Է¿���~!!!")  ; //break;
        }  
		
		System.out.println("����ġ �� ��!");
		
		//���1�� ���
		������ ���� �Է�(1~3) :3
		�ڡڡ�
		����ġ �� ��!
		*/
	
		
		

		/*
		//���2
		switch (a)
		{
			default: System.out.println("�Է� ����~!!!"); break;
			case 3 : System.out.print("��");       
			case 2 : System.out.print("��");        
			case 1 : System.out.print("��");  
		
		}

			System.out.println();
		
		//���2�� ���
		������ ���� �Է�(1~3) :3
		�ڡڡ�
		*/

		
		
		
		
		//���3
		switch (a)
		{
			case 3 : System.out.print("��");       
			case 2 : System.out.print("��");        
			case 1 : System.out.print("��");  break;

			default: System.out.println("�Է� ����~!!!"); 
		
		}

			System.out.println();
		
		//���3�� ���
		//������ ���� �Է�(1~3) :3
		//�ڡڡ�
		

			
			
	}


}



