//�迭�� �⺻�� Ȱ��

//'char' �ڷ����� �迭�� �����
//�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
//ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
//��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

package Medium;

public class day12_2 {
	
	public static void main(String[] args) 
	{
		//�迭 ä���
		char[] arr = new char[26]; //���ĺ� �빮�ڴ� �� 26��
		
		//�빮�� 'A'�� 65��� �ڵ尪�� ������.
		for (int i=0, ch=65; i<arr.length; i++, ch++)
		{
			arr[i] = (char)ch;
		}
		

		//�迭 ��� ��ü ���
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}

//���
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
