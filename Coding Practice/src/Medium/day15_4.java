//Ŭ������ �ν��Ͻ� Ȱ��

//1~3 ������ ������ �߻�����
//����, ����, �� ���� ���α׷��� �����Ѵ�.
//��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ -> 1:����, 2:����, 3:��

package Medium;

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	private int user;
	private int com;

	//��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;    // 0  1  2  ->  (+1)  -> 1  2  3
	}

	//������ ����������
	public void input()
	{
		//������ ���������� �ϱ� ����... ��ǻ��(������) ���� ����������
		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����, 2:����, 3:��  �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	//�߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println();
		System.out.println(" - ����   : " + str[user-1]);  //str[1] str[2] str[3] -> str[0] str[1] str[2]
		System.out.println(" - ��ǻ�� : " + str[com-1]);
	}

	//�ºο� ���� ���� ��� ����
	public String resultCalc()
	{
		String result = "���º� ��Ȳ�Դϴ�~";


		// (����=="����" && ��=="��") || (����=="����"&& ��=="����") || (����=="��" && ��=="����")
		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "����� �¸��߽��ϴ�~";
		}
		// (����=="����" && ��=="����") || (����=="����"&& ��=="��") || (����=="��" && ��=="����")
		else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~";
		}
		return result;
	}

	//��� ���
	public void print(String str)
	{
		System.out.printf("\n>> �º� ���� ��� : %s%n", str);
	}

} //end class RpsGame





public class day15_4 {
	
	public static void main(String[] args)
	{

		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	

	}

}

//���
/*
1:����, 2:����, 3:��  �� �Է�(1~3) : 3

 - ����   : ��
 - ��ǻ�� : ����

>> �º� ���� ��� : ����� �¸��߽��ϴ�~
*/