//for���� Ȱ���� ����� �ǽ�2

/*
//����(1)
      *
	 ***
    *****
   *******
  *********

//����(2)
  *********
   *******
    *****
     ***
      *

//����(3)
      *
     ***
    *****
   *******	
  *********
   *******
    *****
     ***
      *
*/


package Base;

public class day08_1 {
	
	
	public static void main(String[] args)
	{
		//����(1)
		/*
		//���� ����
		int i;
		int j;
		
		//���� �� ó��
		//���� ������ 1,3,5,7,9�� 2���� �þ�� ��Ģ�� ������ �ִ�.
		//���� ��Ģ�� 2*i-1�̶�� ��Ģ���� ���ǵ� �� �ִ�.

		//ù° ���� ���� + �� 1��
		//��° ���� ���� + �� 3��
		//��° ���� ���� + �� 5��
		//��° ���� ���� + �� 7��
		//������ ���� ���� + �� 9��
		//������ ���� �پ���, ���� ���� �������� ������ �ݺ��ȴ�.
		
		for (i=1; i<=5; i++) //1 2 3 4 5... �� 5�� ���
		{
			for(j=0; j<=5-i; j++)  //4 3 2 1 0... ���� ���
			{
			System.out.print(" ");
			}
				for(j=0; j<2*i-1; j++)  //1 3 5 7 9... �� ���
				{
				System.out.print("*");
				}
			System.out.println();

		}
		*/
		
		
		
		//����(2)
		/*
		//���� ����
		int i, j, k;

		//���� �� ó��
		for (i=1; i<=5; i++)  //1 2 3 4 5... 5�� ���(=5�� �ݺ�)
		{
			for (j=0; j<i; j++)  //0 1 2 3 4... ���� ���
			{
				System.out.print(" ");  
			}
			//���� ������ 9,7,5,3,1�� ������ �پ���.
			//�� ��Ģ�� (2*i)-1�� ��Ÿ�� �� �ִ�.
				for(k=9; k>=(2*i)-1; k--) //9 7 5 3 1... �� ���
				{
					System.out.print("*");
				}
		System.out.println();
		}
		*/
		

		
		//����(3)
		//���� ����
		int i,j;

		//���� �� ó��
		for (i=0; i<5; i++)  //���ﰢ��, 5�� ���
		{
			for (j=0; j<5-i; j++)  //���� ���
			{
				System.out.print(" ");
			} 
			for (j=0; j<2*i+1; j++)  //�� ���
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (i=3; i>=0; i--)  //�Ʒ��ﰢ��, 4�� ���
		{
			for (j=0; j<5-i; j++)  //���� ���
			{
				System.out.print(" ");
			}
			for (j=0; j<2*i+1; j++)  //�� ���
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}