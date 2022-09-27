//�÷��� �����ӿ�ũ(Collection Framework)

//ť(Queue)

/*
ť(Queue)�� ���Լ����� FIFO(First Input First Output) ������
���� �Էµ� �ڷḦ ���� ����ϸ�
ť �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

ť �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
new �����ڸ� �̿��Ͽ� ť �������̽��� ������ (implements)
Ŭ������ �����ڸ� ȣ���Ѵ�.

ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�

- E element()
  ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

- boolean offer(E o)
  ������ ��Ҹ� ť�� �����Ѵ�.

- E peek()
  ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

- E poll()
  ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

- E remove()
  ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.


class �÷���Ŭ����<E?>
{
	<E?>�ϳ��� ��� ������()
	{
	}
}
*/


package High;

import java.util.Queue;
import java.util.LinkedList;


public class day27_2 {
	
	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		//Queue muQue = new Queue();  -->> �Ұ�
		Queue<Object> myQue = new LinkedList<Object>();

		//������ ������ �غ�
		String str1 = "������";
		String str2 = "���ٻ�";
		String str3 = "������";
		String str4 = "Ÿ����";

		//myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		//�׽�Ʈ(Ȯ��)
		System.out.println(myQue);
		//[������, ���ٻ�, ������, Ÿ����]
		//--������ �Է�Ȯ���̳� ����Ȯ���� ���� ���� ������
		
		System.out.println(test);
		//true

		//Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " + (String)myQue.element());
		System.out.println("��2 : " + (String)myQue.element());
		//������
		/*
		��1 : ������
		��2 : ������
		*/

		System.out.println();

		String val;


		//(1)
		
		//peek()
		//--ť�� head ��� ��ȯ, ���� ����. ������ Ȯ�θ� ��
		//  ť�� empty �� ��� null �� ��ȯ.
		
		while (myQue.peek() != null)
		{
			//poll()
			//--ť�� head ��� ��ȯ, ������. ������ ���� ó��
			//  ť�� empty �� ��� null �� ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		
		//������
		/*
		��� : ������
		��� : ���ٻ�
		��� : ������
		��� : Ÿ����
		*/
		
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		//������
		/*
		��� : ���ٻ�
		��� : Ÿ����
		*/


		/*
		while (myQue.peek() != null)
		{
			val = (String)myQue.peek();
			System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		//������
		//-->> ��� : ������  ...�� ���Ӿ��� ��µ�


		//(2)
		
		while (true)
		{
			val = (String)myQue.poll();

			if(val==null)
				break;
			else
				System.out.println("��� : " + val);
		}
		
		//������
		/*
		��� : ������
		��� : ���ٻ�
		��� : ������
		��� : Ÿ����
		*/

		//(3)
		
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		//������
		/*
		��� : ������
		��� : ���ٻ�
		��� : ������
		��� : Ÿ����
		*/		



	}

}


