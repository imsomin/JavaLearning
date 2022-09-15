//����(sort) �˰���

//���� ����(��ǰ ����, Bubble Sort)

//���� ��)
//Source Data : 52 42 12 62 60
//Sorted Data : 12 42 52 60 62


package Medium;

public class day17_1 {
	
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		
		/*

		42  52  12  62  60
		==  --
		
		42  12  52  62  60
		    ==  --

		42  12  52  62  60
		        ==  --

		42  12  52  60  62
		            ==  --
		
		---------------------------------1ȸ��

		12  42  52  60  62
		==  --

		12  42  52  60  62
		    ==  --
		
		12  42  52  60  62
				==  --

		----------------------------------2ȸ��

		12  42  52  60  62
		==  --

		12  42  52  60  62
			==  --
		
		----------------------------------3ȸ��

		12  42  52  60  62
		==  --

		----------------------------------4ȸ��

		*/


		int i, j;

		System.out.print("Source Date : ");

		

		for ( int b : a )
		{
			System.out.print(b + " " ); 
		}
		System.out.println();

		
		//Bubble Sort(���� ����)
		for (i=1; i<a.length; i++)   //�ڿ��� �� ����� �ϳ��� �ٿ��ִ� ����
		{                                  //1      2      3      4
			for (j=0; j<a.length-i; j++)   //0123   012    01     0 (�񱳱����ڸ�) vs 1234  123  12  1 (�񱳴���ڸ�)
			{
				if (a[j] > a[j+1])
				{
					//�ڸ��ٲ�
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}


		System.out.print("Sorted Data : ");

		for (int b : a)
		{
			System.out.print(b + " ");
		}
		System.out.println();


		
	}

}


//���
/*
Source Date : 52 42 12 62 60 
Sorted Data : 12 42 52 60 62 
*/
