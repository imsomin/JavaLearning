//�迭�� �迭(2���� �迭)

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//  A  B  C  D  E
//  F  G  H  I  J
//  K  L  M  N  O
//  P  Q  R  S  T
//  U  V  W  X  Y


package Medium;

public class day14 {
	
	public static void main(String[] args)
	{

		//5X5 �迭 �����
		char[][] arr = new char[5][5];

		//�迭�� ���� ������ ���ĺ� ����
		char a = 'A';

		//�迭�� �� ä���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = a;
				a++;
			}
		}


		//�迭 ����ϱ�
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}



	}

}

//���
/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
*/
