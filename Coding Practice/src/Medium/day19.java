//�߻� Ŭ����(Abstract)

/*
���߻� Ŭ������ 
���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
���� Ŭ�������� �������̵��� ������ ����Ǵ� �޼ҵ忡 ����
�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

������ �� ����
[��������������] abstract class Ŭ������
{
	[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
}

��Ư¡
-Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
�� Ŭ������ Ŭ���� �տ� 'abstract' Ű���带 �ٿ�
�߻� Ŭ������ ����ؾ� �ϸ�,
�߻� Ŭ������ ������ ��쿡��
�ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
��ü�� ������ �� ���� ���̴�.

-��, �߻� Ŭ������ ���������� ������ �� ���� ������
����� ���ؼ��� �����ϸ�
�߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
�ݵ�� �߻� �޼ҵ带 �������̵��ؾ� �Ѵ�.

-'abstract' Ű�����
Ŭ������ �޼ҵ忡���� ����� �� ������
��� ������ ���� ���������� ��� �Ұ����ϴ�.

*/

package Medium;

abstract class Test190
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	//�߻� �޼ҵ�
	protected abstract void sorting();  

	protected int dataLength()
	{
		return value.length;
	}

	//================================================
	// 'final' Ű����� ���� 
	//�� Ŭ����(Test190)�� ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 ������(Method Overriding)�� �� ����.
	// final -->��ӹ��� Ŭ�������� ����� �������̵� ���� ����� ��!
	//================================================

	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if(x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}

	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}


}


// Test190(�߻� Ŭ����)�� ��ӹ��� Ŭ����          -> (�ϴ���)�߻� Ŭ����
// -> �߻� �޼ҵ�(sorting())�� Override -> �Ϲ� ���� Ŭ����
//                 ��
//public abstract class day19 extends Test190
public class day19 extends Test190
{

	/*�θ�(Test190)���Լ� ��������
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	//�߻� �޼ҵ�
	protected abstract void sorting();  

	protected int dataLength()
	{
		return value.length;
	}


	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if(x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}

	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

	*/


	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	@Override
	protected void sorting()
	{
		//���� -> �ϼ�

		//selection sort
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				// ũ���
				if (compare(i,j)>0)
				{
					//�ڸ��ٲ�
					swap(i, j);
				}
			}
		}

	}
	




	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		day19 ob = new day19();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();
		
	}
}


//���
/*
Source Data : 7 10 3 8 7 
Sorted Data : 3 7 7 8 10 
 */
