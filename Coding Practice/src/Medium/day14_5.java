//�迭�� ����

//day14_4.java ���ϰ� ���� ��!

// �� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
// (1)�ּҰ� ���� 
//->������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
//(�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)
// (2)������ ���� 
//->���� ��ҷ� ����ִ� ���� ���� ����� 
//������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���


// day14_5.java
// ������ ����

//-- int �� �迭�� ���� ������ ���縦 ó���ϴ� �޼ҵ带 �����ϴ� ������ �ǽ�

package Medium;

public class day14_5 {
	
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};   //--�迭 ����

		//�ּҰ� ����
		int[] copys1 = nums;				 
											 
		//����� ���� �޼ҵ� ȣ��
		int[] copys2 = copyArray(nums);     
										    
		//���⼭ nums�� �迭�̴�.
		//nums  -> ��ü
		//nums. -> ��ü ���赵�� ����� �ִ� �غ� �Ϸ�
		//��ü ������ �迭 ���簡 �Ұ����ϴ�. �׷��� �� ��ȯ�� �ؾ��Ѵ�.
		
		//  �ڹ� ������ clone() �޼ҵ�
		int[] copys3 = (int[])nums.clone();    //-- �迭 ������ ���� ����
											  
		//���� �迭 ����� ���� 
		nums[1] = 2;

		
		// ��� Ȯ��
		for (int i=0; i<nums.length; i++)
		{
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
		//-->>  10   2  30  40  50
		
	
		for (int i=0; i<copys1.length; i++)
		{
			System.out.printf("%4d", copys1[i]);
		}
		System.out.println();
		//-->>  10   2  30  40  50
		//���⼭, �迭�� 1��° ��Ұ� �ٲ��� ������ Ȯ���� �� �ִ�.

	
		for (int i=0; i<copys2.length; i++)
		{
			System.out.printf("%4d", copys2[i]);
		}
		System.out.println();
		//-->>  10  20  30  40  50
		//������ �����ص� �����Ϳ� ������ ������ Ȯ���� �� �ִ�.
	
		for (int i=0; i<copys3.length; i++)
		{
			System.out.printf("%4d", copys3[i]);
		}
		System.out.println();
		//-->>  10  20  30  40  50

		

	}

	// �Ű������� int �迭 Ÿ���� �Ѱܹ޾� �̸� ������ ��
	// ������ �迭�� ��ȯ�ϴ� ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os)
	{
		//�Ű������� �Ѱܹ��� �迭(os)
		//��, ���� �迭 ��ŭ�� �迭 ����(=�޸� ����)�� Ȯ����
		//������ �迭���� ����
		int[] temp = new int[os.length];

		//������ ���� �迭(os)�� ����ִ� ��ҵ��� ���� �迭(temp)�� ��Ƴ���
		//temp = os; -- X
		for (int i=0; i<os.length; i++)
		{
			temp[i] = os[i];
			//�Űܴ�´�... 
			//��, temp�� os���� ���
		}

		//������ �迭(temp) ��ȯ
		return temp;


	}
   


}
