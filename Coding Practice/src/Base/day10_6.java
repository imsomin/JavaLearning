//Ŭ������ �ν��Ͻ� Ȱ��
//��� �ǽ�(2)

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� ������ �����ϴ� ���α׷��� �����Ѵ�.

package Base;

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	int su1, su2;
	char op;

	//�޼ҵ�(1)
	//�ش簪 �Է�
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.printf("������ ������ �Է�(+ - * /)  : ");
		op = (char)System.in.read();

	}

	
	//�޼ҵ�(2)
	//�޼ҵ� ����(��� : ����)
	int cal()
	{
		int result = 0;

		switch (op)
		{
			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			case '*' : result = su1 * su2; break;
			case '/' : result = su1 / su2; break;
			//default : result = -1;
		}

		return result;
	}


	//�޼ҵ�(3)
	//�޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s); 
	}

}




public class day10_6 {
	
	public static void main(String[] args) throws IOException
	{
		//Calculate �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();          //--������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int r = cal.cal();    //--������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		cal.print(r);         //--������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��

	}

}


//���
/*
������ �� ���� �Է�(���� ����) : 3 6
������ ������ �Է�(+ - * /)  : *
>> 3 * 6 = 18

������ �� ���� �Է�(���� ����) : 45 30
������ ������ �Է�(+ - * /)  : -
>> 45 - 30 = 15

*/
