//�迭�� �迭(2���� �迭)

//���� 1~25�� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

package Medium;

public class day13_1 {
	
	public static void main(String[] args)
	{
		
		//�迭�� �迭 ����
		//int[][] arr; 
		
		//�迭�� �迭 �޸� �Ҵ�
		//arr = new int[5][5];

		// ��

		//�迭 ���� + �޸� �Ҵ�
		int[][] arr = new int[5][5];

		//���� ���� �� �ʱ�ȭ
		int n=1;              //1 2 3 4 5 6 7 ... 23 24 25

		//�迭�� �迭�� �ݺ����� ��ø ������ Ȱ���Ͽ� ����ȭ
		for (int i=0; i<arr.length; i++)          // -> outer -> 0      1      2      3      4
		{   
			for (int j=0; j<arr[i].length ; j++)  // -> inner -> 01234  01234  01234  01234  01234
			{
				// 00 01 02 03 04
				// 10 11 12 13 14
				// 20 21 22 23 24
				arr[i][j] =n;
				n++;   //������ �� ���� 1�� ���´�.
			}
		}

		//��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);  
			System.out.println();
		}

	}


}

//���
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
*/
