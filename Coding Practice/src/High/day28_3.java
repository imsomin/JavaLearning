//�÷��� �����ӿ�ũ(Collection Framework)

//�˻� �� ����

package High;

import java.util.Vector;

public class day28_3 {
	
	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		//���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		//���� �ڷᱸ�� v �� colors �迭 �����͸� ��ҷ� �߰�
		for (String color : colors)
		{
			v.add(color);
		}

		//���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//-->> ��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����


		String s1 = "��ȫ";

		//indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + " -> �ε��� ��ġ : " + i);
		System.out.println();
		//-->> ��ȫ -> �ε��� ��ġ : -1

		String s2 = "���";

		//contains()
		//'v.contains(s)'
		//���� �ڷᱸ�� v �� ã�����ϴ� s�� ���ԵǾ� �ִٸ�...
		//-> �ε��� ��ġ Ȯ��!
		if (v.contains(s2))    //->���ԵǾ� �ִ��� �ƴ��� Ȯ���ϴ� �޼ҵ�
		{
			i = v.indexOf(s2); //-->>�� ���ڰ� ���°�� �ִ��� Ȯ��
			System.out.println(s2 + " -> index ��ġ : " + i);
			//-->> ��� -> index ��ġ : 1

			//�켱 ���� �ڵ带 ���� ã��...
			//ã������ �����϶�(�����϶�)
			v.remove(i);
		}
		


		//ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("���� �� ��ü ��� ��� : ");
		for(String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//-->> ���� �� ��ü ��� ��� : ���� �ʷ� �Ķ� ���� ����


		//�߰� ���ǻ���
		System.out.println(colors);
		//[Ljava.lang.String;@7852e922


		System.out.println(v);
		//[����, �ʷ�, �Ķ�, ����, ����]


		//==================================
		//+TIP
		//Ȯ�ο� ���� �����ʹ�
		//���� ���(������)�� �ƴϱ� ������
		//�̸� Ȱ���Ͽ� ������ �����ϰ� ó���ؼ��� �ȵȴ�. 
		//==================================

	}

}
