package Base;

import java.util.Scanner;

public class day01 {
	
	public static void main(String[] args) 
	{
		//�ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		//�ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;
		
		//���� �� ó��
		System.out.println("�̸�, ����, ����, ���� �Է�(',' ����) : ");
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*, \\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;
		
		//��� ���
		System.out.println("\n>> �̸� :" + name);
		System.out.println(">> ���� : " + tot);
		
		
		
	}
	
	

}






/*
 Exception in thread "main" java.util.NoSuchElementException
 �� Scanner ��ü ��� ����� ���� ���� �߻�! �������� �ʴ� ���� ���������� �� �� �߻��ϴ� �����̴�.
 
 */








