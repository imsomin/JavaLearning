//�÷��� �����ӿ�ũ(Collection Framework)

//Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
�� Hashtable<K, V> Ŭ����

 - �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
   �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

 - �ؽ����̺��̶� Ű(key) �� �׿� �����ϴ� ������(value)��
   ���е� ������ �����̴�.

 - �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
   �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

 - ����, Hashtable Ŭ������ key �Ǵ� value �� ������ 
 null �� ������� �ʴ´�.
 
*/



package High;

import java.util.Hashtable;

public class day30_2 {
	
	private static final String[] names
	= {"������", "���ٻ�", "������", "Ÿ����", "������"};

	private static final String[] tels
	= {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"};

	public static void main(String[] args)
	{
		//Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();

		//ht ��� Hashtable �ڷᱸ���� �迭(names, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		// -> put(k, v);
		for (int i=0; i<names.length; i++)  //�ݺ����� �� 5�� ����ȴ�(10�� �ƴ� ����)
		{
			ht.put(names[i], tels[i]);
		}
		
		//-----------------------------------------------------------

		//ht ��� Hashtable �� ���� 'key' �� �̿��Ͽ� �˻�
		// -> get(k)
		String findName1 = "Ÿ����";   //key��
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " �� ��ȭ��ȣ : " + str);
		}
		System.out.println();
		//-->>Ÿ���� �� ��ȭ��ȣ : 010-4444-4444

		
		//ht ��� Hashtable �ڷᱸ����  'key' �� �����ϴ����� ���� Ȯ��
		// -> containsKey(k)
		String findName2 = "�����";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//-->>����� �����Ͱ� �������� �ʽ��ϴ�.
	
		String findName3 = "������";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//-->>������ �����Ͱ� �����մϴ�.
	
	
		//-----------------------------------------------------------
		
		
		//ht ��� Hashtable �ڷᱸ���� 'value' �� �����ϴ����� ���� Ȯ��
		// -> contains(v)
		String findTel1  = "010-1111-1111";   //value��
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//-->>010-1111-1111 �����Ͱ� �����մϴ�.

		
		//ht ��� Hashtable �ڷᱸ������ '������' ������ ����
		// -> remove(k)
		ht.remove("������");
		//-- 'remove()' �޼ҵ�� ���ڰ����� key �� �Ѱܹ�����
		//   �� ��, key �� �����Ǵ� ���� �ƴϴ�.
		//   �ش� key �� ����Ǿ�(���εǾ�)�ִ� value �� �Բ� remove() �ȴ�.

		// ����(remove()) ���� 'key' �� �����ϴ��� Ȯ��
		if (ht.containsKey("������"))
		{
			System.out.println("�����մϴ�.");
		}
		else
		{
			System.out.println("�������� �ʽ��ϴ�.");
		}
		System.out.println();
		//-->>�������� �ʽ��ϴ�.
	

		//����(remove()) ���� 'value' �� �����ϴ� �� Ȯ��
		if (ht.contains("010-3333-3333"))  //������ '������'�� ��ȣ�� '010-3333-3333'
		{
			System.out.println("�����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//-->>�����Ͱ� �������� �ʽ��ϴ�.

		//===================================================
		// �� null ���� ó��
		//ht.put(null,null);           //--key, value ��� null  
		//-->> ���� �߻�(��Ÿ�� ����)
		//     NullPointexception 
		//ht.put("������", null);        //--value �� null       
		//-->> ���� �߻�(��Ÿ�� ����) 
		//     NullPointexception
		//ht.put(null, "010-1234-2345"); //--key �� null
		//-->> ���� �߻�(��Ÿ�� ����) 
		//     NullPointexception
		//===================================================

		//�ߺ��� key �Է�
		ht.put("������", "010-1234-1234");

		System.out.println(ht.get("������"));
		//-->>010-1234-1234
		//--������ ��ȣ���� 010-1234-1234 �� ����Ǿ����� Ȯ��
		//  ����� ����
	
		System.out.println();

		//�ߺ��� value �Է�
		ht.put("������", "010-5555-5555");

		System.out.println(ht.get("������"));
		//-->>010-5555-5555
		System.out.println(ht.get("������"));
		//-->>010-5555-5555
		//--value �� ����̰� �ߺ��ǰ� ����� ������
		//  key�� ����ؼ� ����̰� �ȴ�.



	}

}
