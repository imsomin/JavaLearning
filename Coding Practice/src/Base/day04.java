package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day04 {
	
	public static void main(String[] args) throws IOException
	{
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;
		int avg;
		
		//�Է°� ���� ó��
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		
		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());
				
		
		// 90�� ~ 100�� : A       
		// 80 ~ 89��     : B
		// 70�� ~  79�� : C       
		// 60 ~ 69��     : D
		// 60�� �̸�         : F
		
		//���� + ���� + ����
		tot = kor + eng + mat;
		
		//���
		avg = tot / 3;
		//avg = tot / 3.0;
		//int avg = (kor+eng+mat)/3;
		
		//switch ���� Ȱ���Ͽ� ��� ��� ó���ϱ�
		//���� ���� ����
		char grade;
		//A,B,C,D,F �� �����̹Ƿ� CHAR!
		
		grade = (char)System.in.read();
		//ȭ�鿡�� '����'�� ���� �Է¹��� ���̴�
		
		switch (avg/10) {
		case 10: case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;

		default: grade='F'; break;
		}
		
		
		//��� ���
		System.out.println();
		System.out.printf("���� �̸��� %s ���ϴ�~ \n", name);
		System.out.printf("�̹� ���� ���... ������ %d, ����� %d�Դϴ�... \n" , tot, avg);
		System.out.printf("�׷��� ����� %c �Դϴ�!!! \n", grade);
		
		
	}

}



/*
�̸� �Է� : ������
�������� �Է� : 90
�������� �Է� : 76
�������� �Է� : 56


���� �̸��� ������ ���ϴ�~ 
�̹� ���� ���... ������ 222, ����� 74�Դϴ�... 
�׷��� ����� C �Դϴ�!!! 
*/







