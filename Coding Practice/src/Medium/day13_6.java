//�迭�� �迭(2���� �迭)

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//	1   2   3   4   10  �� �������� �ش� ���� ���� ��µȴ�. 
//	5   6   7   8   26
//	9   10  11  12  42
//  13  14  15  16  58
//	28  32  36  40  136

//  ��
// �������� �ش� ���� ���� ��µȴ�.

package Medium;

public class day13_6 {

	public static void main(String[] args)
	{

		int[][] arr = new int[5][5];

		int n=0;

		int sum=0;  		//--�׽�Ʈ ����

		for (int i=0; i<arr.length-1; i++)        // i -> 0 1 2 3
		{
			for(int j=0; j<arr[i].length-1; j++)  // j -> 0 1 2 3
			{
				n++;    //-1 �� �����Ƿ�, 1 2 3 4 5 6 ... 16 -->> 4 X 4 ���� ����
				arr[i][j] = n;

				sum += arr[i][j];

				//arr[4][4] += arr[i][j];
				/*
				  1  2  3  4  0
				  5  6  7  8  0
				  9 10 11 12  0
				 13 14 15 16  0
				 0  0  0  0  136
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
				*/

				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];
				//     �� ���� ����
				/*
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
				*/
				
			}
		}

		//=============================================
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//���� ���� ������ �߻��ϱ� ������
		//arr.length-1 �� ���ִ� ���̴�.
		//=============================================
		
		
		//�׽�Ʈ
		//System.out.println("sum : " + sum);
		//-->>sum : 136

		//��ü ��� ��� ����
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

	}
}

//���
/*
    1    2    3    4   10
    5    6    7    8   26
    9   10   11   12   42
   13   14   15   16   58
   28   32   36   40  136
 */
