//�迭�� �迭(2���� �迭)

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//	E J O T Y   --  0
//	D I N S X   --  1
//	C H M R W   --  2
//	B G L Q V	--  3
//	A F K P U   --  4

package Medium;

public class day13_5 {
	
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		char start = 'A';

		for (int i=0; i<5; i++)   
		{
			for (int j=4; j>=0; j--) 
				arr[j][i] = start++;
			// [4][0] 
			// [3][1] 
			// [2][2]  
			// [1][3]  
			// [0][4]  
			
		}


		//��ü ��� ��� ����
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
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
 */
