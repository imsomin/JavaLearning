//�迭�� �迭(2���� �迭)

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//  A  
//  C  B  
//  D  E  F
//  J  I  H  G     
//  K  L  M  N  O

package Medium;

public class day14_2 {
	

	public static void main(String[] args)
	{

		//5X5 �迭 �����
		char[][] arr = new char[5][5];

		//�迭�� ���� ������ ���ĺ� ����
		char a = 'A';      

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(i%2!=0) //���� i�� 2�� ���(0, 2, 4)��� ���ĺ��� ��������
				{
					arr[i][i-j] = a;
				}
				else       //���� i�� 2�� ����� �ƴ϶��(1, 3, 5) ���ĺ��� ����������
				{
					arr[i][j] = a;
				}
				a++;
			}
		}


		//�迭 ����ϱ�
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}
		System.out.println();
		}



	}

}

//���
/*
A
C  B
D  E  F
J  I  H  G
K  L  M  N  O
*/
