package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day02_1 {
	
	public static void main(String[] args) throws IOException
	{
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� ����
		int year;  //-- �Է��� ����
		String result; //-- �Ǻ� ���
		
		//���� ó��
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine()); //���ڿ��� �ٷ� ���� �� �����Ƿ� integer ó�� �ʿ�

		//���� or ��� ���ϱ�
		result = year%4==0 && year%100!=0 || year%400==0 ? "����" : "���";
		
		//���
		System.out.printf("%d�� -> %s%n", year, result);
		
		
		
		
		
		
	}

}


/*
������ ���� �Է� : 2022
2022�� -> ���

������ ���� �Է� : 2000
2000�� -> ����
*/



