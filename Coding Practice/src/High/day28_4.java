//�÷��� �����ӿ�ũ(Collection Framework)

//���� �ڷᱸ�� ��ü ���� �� ���� ��
//����� ���� Ŭ���� Ȱ��
//-> �ڷ���


package High;


import java.util.Vector;



//����� ���� Ŭ���� ���� -> �ڷ���ó�� Ȱ��
class MyData
{
	//�ֿ� �Ӽ� ���� -> �ֿ� ���� ����(��� ����)
	private String name;    //--�̸�
	private int age;        //--����

	//getXxx() -> getter
	//steXxx() -> setter
	//getter �� main �Լ����� �ν��Ͻ� �ʵ忡 �����ؼ� ����ϴ� �Լ�
	//setter �� main �Լ����� �ν��Ͻ� �ʵ忡 �����ؼ� ����ϴ� �Լ�

	//getter / setter ����
	//������������ public
	//�޼ҵ� getName()
	public String getName()
	{
		return name;
	}

	//�ܺο��� (�Ű�����)���� �޾ƿ´�
	public void setName(String name) 
	{ 
		this.name = name;
		
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}


	//������(�Ű����� 2���� ������) -> ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//�� ����� ���� �����ڰ� ������ ���
	//   default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//   default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//	 �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//	 (��, �ݵ�� �����ؾ� �� �ʿ�� ����)

	// ������(�Ű����� ���� ������) -> ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}

}

public class day28_4 {
	
	public static void main(String[] args)
	{
		//���� �ڷᱸ�� ����
		//Vector v = new Vector();
		//���ʸ� ǥ����
		Vector<MyData> v = new Vector<MyData>();
		//--���� �ڷᱸ���� �����ϴµ�
		//  �� �ȿ��� MyData�� ���������� ��Ÿ��

		//���� �ڷᱸ�� v ��
		//������ 13�� / ���ٻ� 7�� / ������ 78��
		//��Ƴ���


		//���(1)
		//MyData Ÿ������ �ν��Ͻ��� �����ϰ�,
		//�̷��� ������ ��ü�� �̸� �ְ�,
		//�̷��� ������ ��ü�� ���� �ֱ�,
		//�׸��� �װ��� ���Ϳ� �ֱ�
		/*
		MyData st1 = new MyData();
		st1.setName("������");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("���ٻ�");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(78);
		v.add(st3);
		*/

		
		
		//���(2)
		//����� ���� �����ڸ� Ȱ���ϴ� ���
		/*
		MyData st1 = new MyData("������", 13);
		v.add(st1);
		MyData st2 = new MyData("���ٻ�", 7);
		v.add(st2);
		MyData st3 = new MyData("������", 78);
		v.add(st3);
		*/
		

		//���(3)
		//���� �ٷ� vector�� add ��Ű�� ���
		v.add(new MyData("������",13));
		v.add(new MyData("���ٻ�",7));
		v.add(new MyData("������",78));
		
		
		//------------------------------------------------------------------------

		
		//���� �ڷᱸ�� v �� ��� ����(���) ��ü ����ϱ�
		//���� ��)
		//�̸�:������, ����:13
		//�̸�:���ٻ�, ����:7
		//�̸�:������, ����:78

		//���� ��ü ��� ���	
		System.out.print("��ü ��� ���: ");
		for (MyData str : v )
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//������
		//-->> ��ü ��� ���: High.MyData@7852e922 High.MyData@4e25154f High.MyData@70dea4e 

		
		//���(1)
		/*
		for (MyData m : v)  //MyData 'Ÿ��'�� '������Ʈ' m �̴�
		{
			System.out.printf("�̸�:%s, ����:%d\n", m.getName(), m.getAge());
		}
		System.out.println();
		*/
		//���� Record Ŭ������ �迭�� �ν��Ͻ� �־ �ߴ� ��ó��
		//���� �ϳ��� ��Ҹ��� ������ MyData �ν��Ͻ��� �� �ִٰ� ����� �� ��~!
		//������
		/*
		�̸�:������, ����:13
		�̸�:���ٻ�, ����:7
		�̸�:������, ����:78
		 */

		
		//���(2)
		/*
		for (int i=0; i<v.size(); i++)  //�� size()�޼ҵ� �����ŭ �ݺ��ϰڴ�
		{
			System.out.printf("�̸�:%s, ����:%d��\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
			//v              => Vector Ÿ��
			//v.elementAt(i) => MyData Ÿ��
		}
		System.out.println();
		*/
 		//������
		/*
		�̸�:������, ����:13
		�̸�:���ٻ�, ����:7
		�̸�:������, ����:78
		 */

		//���(3)
		for (Object temp : v)    //�̷� ���� ���¸� ��Ƴ��� ������ MyDataó�� Ư���� ��ü Ÿ���� �ƴ϶� ������Ʈ�� ������ �� ���� �ִ�.
		{
			System.out.printf("�̸�:%s, ����:%d��\n", ((MyData)temp).getName(), ((MyData)temp).getAge()); //MyData Ÿ������ �ٿ� ĳ������ �ϴ� ��
		}
		System.out.println();
 		//������
		/*
		�̸�:������, ����:13
		�̸�:���ٻ�, ����:7
		�̸�:������, ����:78
		 */
		
	}

}
