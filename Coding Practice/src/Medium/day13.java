//�迭�� �迭(2���� �迭)

//2���� �迭�� �迭 ��ҷ� 1���� �迭�� ������ �迭�̸�,
//3���� �迭�� �迭 ��ҷ� 2���� ����� ������ �迭�̴�.

package Medium;

public class day13 {
	
	public static void main(String[] args)
	{
		
		//�迭�� �迭 ����� �ʱ�ȭ
		//��� (1)
		//int[] arr1 = new int[3];
		int[][] arr1 = new int[3][3];

		//arr1[0] = 1;
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		
		
		//��� (2)
		//int[] arr2 = {1,2,3};
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		//arr2�� ���̴� 3�� �ش���

		
		
		//��� (3)
		int[][] arr3 = new int[3][3];
		int n=1;
		for (int i=0; i<arr3.length; i++)     
		{
			for (int j=0; j<arr3[i].length; j++) 
			{
				//�׽�Ʈ
				//System.out.println("i:" + i + ", j:" + j);
				//-->>���
				/*
				i:0, j:0
				i:0, j:1
				i:0, j:2
				i:1, j:0
				i:1, j:1
				i:1, j:2
				i:2, j:0
				i:2, j:1
				i:2, j:2
				*/

				arr3[i][j] = n;
				n++;
			}
		}

		//�迭�� �迭 ��� ��ü ���
		for (int i=0; i<arr1.length; i++)  
		{
			for (int j=0; j<arr1[i].length; j++)
			{
				System.out.printf("%2d", arr1[i][j]);
			}
			System.out.println();
		}

	}
	
}

//���
/*
 1 2 3
 4 5 6
 7 8 9
*/
