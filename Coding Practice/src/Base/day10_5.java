//Ŭ������ �ν��Ͻ� Ȱ��
//��� �ǽ�(1)

//����ڷκ��� ������ ������ �Է¹޾� 1���� �Է¹��� �� ������ ���� �����Ͽ�
//������� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է� �����Ͱ� 1 ���� �۰ų� 1000���� ū ���
//�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

package Base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//��� ���� -> �ֿ� �Ӽ�
	int su;
		
	//�޼ҵ�(1)
	//���� �Է� ���
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);

		}

	
	//�޼ҵ�(2)
	//���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;

		for (int i=1 ; i<su; i++)
			result += i;

		return result;
	}

	//�޼ҵ�(3)
	//��� ���
	void print (int sum)       //-->>sum�� ���⼭ ó�� ����
	{
		System.out.printf(">>1~%d������ �� : %d%n", su, sum);
	}


}



public class day10_5 {
	
	public static void main(String[] args) throws IOException
	{
		
		//Hap �ν��Ͻ� ����
		Hap ob = new Hap();   

		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��  -> input()
        //----------------------
		//   �������� Ȱ��

		ob.input();        //->���� �Է¹޴� ����

		
        //������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� -> calculate()
		int s = ob.calculate();

		//������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� -> print()
		ob.print(s);

		//ob.print(ob.calculate());    --->> s ���� �̿Ͱ��� �ᵵ ����


	}

}

//���
/*
������ ���� �Է�(1~1000) : 560
>>1~560������ �� : 156520
*/
