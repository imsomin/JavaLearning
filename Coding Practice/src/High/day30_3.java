//�÷��� �����ӿ�ũ(Collection Framework)

//Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
�� HashMap<K, V> Ŭ����

- Hashtable Ŭ������ ���������� Map �������̽����� ��ӹ���
  HashMap Ŭ������ ����� Hashtable �� ����������
  Synchronization �� ���� ������ ���ü� ������ ���ٸ�
  (��, ��Ƽ ������ ���α׷��� �ƴ� �����)
  HashMap �� ����ϴ� ���� ������ ����ų �� �ִ�.

- ����, HashMap �� Hashtable Ŭ�����ʹ� �޸� null �� ����Ѵ�.

*/



package High;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class day30_3 {
	
	public static void main(String[] args) throws IOException
	{
		//HashMap �ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();

		// map �̶�� HashMap �ڷᱸ���� ��� �߰�
		// -> put();
		map.put("���", "���¿�Ŭ��");
		map.put("��ȭ", "�����̴���");
		map.put("��ȭ", "������ũ");

		// ���� Ȯ��
		System.out.println(map);
		//-->>{���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}

		// null �Է� �õ�
		map.put(null, null);
		map.put("�Ҽ�", null);
		map.put(null, "���̾�");
		//-- ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//   ������ null �� key �� ���ε� '���̾�'��
		//   ���� null �� key �� �����ϴ� null �� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//   ��, HashMap �� null �� �ϳ��� ������ key �� �����Ѵ�.(�ν��Ѵ�.)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ");
		String[] temp;

		for (String str; ((str=br.readLine()) != null); )
		{
			temp = str.split(",");
			if (temp.length < 2)
			{
				System.out.print("ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : " );
				continue;
			}
		

		map.put(temp[0].trim(), temp[1].trim());
		System.out.println(map);
	
		}
		//������
		/*
		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ���, ���¿�Ŭ��
		{null=���̾�, �Ҽ�=null, ���=���¿�Ŭ��, ��ȭ=�����̴���, ��ȭ=������ũ}

		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : ���, �����ƾ���
		{null=���̾�, �Ҽ�=null, ���=�����ƾ���, ��ȭ=�����̴���, ��ȭ=������ũ}

		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : �Ҽ�, ���̾�
		{null=���̾�, �Ҽ�=���̾�, ���=�����ƾ���, ��ȭ=�����̴���, ��ȭ=������ũ}
		
		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : null, �ΰ�
		{null=���̾�, �Ҽ�=���̾�, null=�ΰ�, ���=�����ƾ���, ��ȭ=�����̴���, ��ȭ=������ũ}

		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : �׸�, �����Ƹ�
		{null=���̾�, �Ҽ�=���̾�, �׸�=�����Ƹ�, null=�ΰ�, ���=�����ƾ���, ��ȭ=�����̴���, ��ȭ=������ũ}

		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : �Ҽ�, �����̾߱�
		{null=���̾�, �Ҽ�=�����̾߱�, �׸�=�����Ƹ�, null=�ΰ�, ���=�����ƾ���, ��ȭ=�����̴���, ��ȭ=������ũ}

		ī�װ�, Ÿ��Ʋ �Է�(�ĸ� ����) : null, �γΰ�
		{null=���̾�, �Ҽ�=�����̾߱�, �׸�=�����Ƹ�, null=�γΰ�, ���=�����ƾ���, ��ȭ=�����̴���, ��ȭ=������ũ}

		 */
		
		//--�������� ctrl+z

	}

}
