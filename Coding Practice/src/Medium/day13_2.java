//�迭�� �迭(2���� �迭)

//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//  1  2  3  4  5
//  2  3  4  5  6
//  3  4  5  6  7
//  4  5  6  7  8
//  5  6  7  8  9

package Medium;

public class day13_2 {
	
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n;   
		
		for (int i=0; i<arr.length; i++)  
		{
			n=1+i;   //��ġ Ȯ���� ��!, 0�������� ��������Ƿ� +1 �� ���־�� �Ѵ�.

			for(int j=0; j<arr[i].length; j++) 
			{
				//�׽�Ʈ
				//System.out.print("i:" + i + ", j:" + j + "/")
				//System.out.print(n + " ");
				
				//n++;

				arr[i][j] = n;
				n++;
			}
		}
		//System.out.println();


		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

    } 

}

//���
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
*/
