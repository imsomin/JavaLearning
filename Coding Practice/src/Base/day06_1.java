package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day06_1 {
	
	public static void main(String[] args) throws IOException
	{
		//�ݺ���(do-while��) �ǽ�
		
		//����ڷκ��� ���� ���� ���� ������ �Է¹ް�
		//�� ���� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
		//��, -1�� �ԷµǴ� ���� �Է� ������ �����ϰ� 
		//�׵��� �Էµ� ������ ���� ������ִ� ���α׷��� �����Ѵ�.
		//��, '-1'�� �Է� ���� Ŀ�ǵ�(���)�� Ȱ���Ѵ�.
		//do-while ���� Ȱ���Ͽ� ������ �ذ��� �� �ֵ��� �Ѵ�.
		
		
		//�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� ���� �� �ʱ�ȭ
		int num;    //--������� �Է°��� ��Ƴ� ����
		int sum=0;  //--�������� ��Ƴ� ����
		
		int n=1;    //--���� ������ Ȱ���ϸ� �� ��° �Է°������� ��Ƴ� ����
		//���� ������?
		//�Ϻ� �ݺ��� �����ϱ� ���� ������ ����
		
		  do
		 {
			  System.out.printf("%d��° ���� �Է�(-1 ����) : " , n);
			  num = Integer.parseInt(br.readLine());
			  sum += num;   //sum�� num��ŭ ����!!
			  
			  n++;
			  
		 }
		  while(num!=-1);  //-- num�� -1�� �ƴ� ��� (����ؼ� �ݺ�)

		 //��� ���
		 System.out.printf("\n>> ������� �Էµ� ������ �� : %d\n", (sum+1)); 


		
	}


}

/*
1��° ���� �Է�(-1 ����) : 23
2��° ���� �Է�(-1 ����) : 5
3��° ���� �Է�(-1 ����) : 17
4��° ���� �Է�(-1 ����) : -1

>> ������� �Էµ� ������ �� : 45
*/