//�迭�� ����

//day14_5.java ���ϰ� ���� ��!

// �� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
// (1)�ּҰ� ���� 
//->������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
//(�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)
// (2)������ ���� 
//->���� ��ҷ� ����ִ� ���� ���� ����� 
//������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

// day14_4.java
// �ּҰ� ����

package Medium;

public class day14_4 {
	
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};   //-- �迭 ����
		int[] copys;                         //-- ���纻���� ���� �迭

		int temp;                            //-- ������ ���� �ӽ� ����

		copys = nums;                        //-- ���� ����
											 //-- �߻� ���� Ȯ�� ��

		temp = nums[0];                      //-- temp = 10;	

		//���� �迭 ����
		nums[0] = 1000;                      
		//1000 20 30 40 50 ���� ������ ��								 

		// copys �迭�� ��ü ��� ���
		for (int i=0; i<copys.length; i++)
		{
			System.out.printf("%4d", copys[i]);
		}
		System.out.println();
		//���� ���
		//--> 1000  20  30  40  50


		System.out.println("temp : " + temp);
		//���� ���
		//--> temp : 10
		
		//temp�� �ּҸ� ��� ���� �ƴ϶� ���� �����Ƿ� ��ȭ�� ����.
		//������ ������ ������ ��� ��!
	
	}

}