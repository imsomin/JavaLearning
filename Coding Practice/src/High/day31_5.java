//��ü ����ȭ(Object Serialization)

/*
�� ��ü ����ȭ��
-> �޸𸮿� ������ Ŭ���� ��ü�� ��� ������
���� ���¸� �״�� �����ؼ� ���Ͽ� �����ϰų�
��Ʈ��ũ�� ���� ������ �� �ִ� �������
��� ������ ���� �����Ѵٰų�
�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

-> ��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ� ������ִ� ������ 
�� ��, ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�.
����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.


�� ��ü ����ȭ�� ����
-> ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������
��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

-> ��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
�� ������ RMI��  Bean�����̾���.
RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
��ü�� �״�� �̵��� �� �־�� �Ѵ�.
���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

-> ����, Bean�� ���� �� ���¿� ���� ������ ������ ��
�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.


+-> RMI(Romote Method Invocation) ==>> ���� ��ü ���
 	���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
	ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
	���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
	��� ������ �����ϴ� �����̶� �� �� �ִ�.

+-> Bean(��)
	C/S ������ �𵨿��� ������ ������ �ش��ϸ�,
	���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���.
	�ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
	Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �����ϴ� ������� ó��.

*/


/*
��Serializable �������̽�
-> ��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
java.io.Serializble �������̽��� ������ �־��� �Ѵ�.
�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
JVM ���� �˷��ִ� ������ �����Ѵ�.
����, Serializable �������̽���
�ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
���� ���� ���ָ� �ȴ�.

����)
(1)
public class Ŭ������ implements Serializable
{ // }

(2)
Serializble �������̽��� ������ ��
ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
��ü ������ ������� �����ϰ� �ȴ�.

�� ��� ������ static ���� ����� ���(��, Ŭ���� ������ ���)
     ��ü ����ȭ�� ��󿡼� ���ܵȴ�.
*/


/*
�� Object Stream
<java.io.ObjectInputStream>
<java.io.ObjectOutputStream>
-> ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ����
���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü�� ����ȭ�� �����ϴ� ����� �����Ѵ�.
��, Java.io.Serializable �������̽��� java.io.Externalizble �������̽��� 
�������ִ� ��ü�� ���ؼ��� ����� �����ϴ�.
-> ��, Serializable �������̽��� Externalizble �������̽���
������ ��ü������ ����� �����ϴٴ� ���̴�.
�� ��, readObject() �޼ҵ带 �̿��Ͽ� ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������
�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü �� ������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.

*/


/*
+ ��ü ����ȭ�� �ʿ伺!
- ���� Ŭ������ �ϵ��ũ��  �����ȴ�. �װ� �����ؼ� ���Ϸ� �����ϸ� 
    �װ� ���赵�� ������ ������, ��ü�� ������ ���� �ƴϴ�!
    ��ü�� �����Ѵٴ� ���� ���赵�� �����Ѵٴ� �Ͱ� �ٸ� �ǹ��̴�.
- ������ ��ü�� �޸𸮿� ��������� ���̰�, 
    �׷��� �޸𸮿� �ۿ÷��� ���� �����ϴ� ���̴�.
    �׷��� �̹����� �̹������ �ؽ�Ʈ�� �ؽ�Ʈ��� 
    ������� �� ����Ǵ� ���� �ƴ϶� ���صǾ� ����ȴ�.
- �׷��� ��ü�� ����ȭ�� �ʿ伺 �����Ѵ�!

- �ν��Ͻ� ���� �������� Ŭ������ �޸𸮿� ����Ǳ�� ������,
    �޼ҵ�� �ν��Ͻ� ���� �������� �޸𸮿� �ۿ÷����� �ʴ´�.
    ���, �� Ŭ������ �ִ� ����������� �ö󰣴�.
    �׷��� �̶�, static �� ������ �� �ö󰣴�.
  (static�� Ŭ������ �ε��ϴ� ��������
    ���� ���� �޸𸮸� �Ҵ�޴� �༮���̹Ƿ�...)
*/

package High;


import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class day31_5 {
	
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		//�׽�Ʈ
		//System.out.println(appDir);
		//-->>C:\JavaStudy

		//���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir -> C:\JavaStudy
		//-- appDir ��ġ�� ��������(�߽�����) "\\data\\test.ser" ��
		//   �����ϰڴٴ� �ǹ�
		//   ��������� "C:\JavaStudy\data\test.ser" ����

		//�׽�Ʈ(1)
		//System.out.println(f0.getParentFile().exists());
		//-->> false
		//-- 'test.ser' ������ ������� ���͸� ��ΰ� �����Ǿ����� ������ �޹�


		//�׽�Ʈ(2)
		//'C:\JavaStudy' ��ο� 'data' ���͸�(����) ���� �� �ٽ� Ȯ��
		//System.out.println(f0.getParentFile().exists());
		//-->> true
		//-- 'test.ser' ������ ������� ���͸� ��ΰ� �����Ǿ� �ִ�.


		// 'test.ser' ������ ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴٸ�...
		if (!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�
			f0.getParentFile().mkdirs(); //mk = make
		}

		//������� data���� ���� test���� h1 ��ü�� �� �ִ� ���̴�!!! ��

		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String,String> h1 = new Hashtable<String, String>();

		// ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("2202091", "������");
		h1.put("2202097", "���ٻ�");
		h1.put("2202090", "������");
		h1.put("2202094", "Ÿ����");

		//�׽�Ʈ
		//System.out.println(h1.get("2202094"));
		//-->>Ÿ����

		//���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)��
		//   f0 ��� ���� ��ü�� ���ڴ�...
		//-- InputStreamReader isr = new InputStreamReader(System.in);
		//   ���� ���� �����̴�

		//��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//   fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�...
		//-- BufferedReader br = new BufferedReader(isr);
		//   ���� ���� �����̴�
		//-- ���� ���� ����
		//   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

	
		//==================================
		//�� ObjectOutputStream Ŭ������
		//	��ü���� ����ϴ�  ����� �����ϴ� Ŭ������
		//  ��� ��Ʈ���� ����ϱ� ����
		//	���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//  �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//  ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//  ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.
		//==================================

		oos.writeObject(h1);
		//--������ ��Ʈ���� ������ ��ü�� ���

		oos.close();
		//--ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//--FileOutputStream ���ҽ� �ݳ�


		//--------------------------------------------------------

		//(��ü�� ����ȭ�Ͽ� ������ ����) �о���̱� ����!

		//f0 ���� ��ü�� �����Ѵٸ�...
		if (f0.exists())
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStream)�� ���� �о���� ��ü(Object)��
			//ĳ����(Hashtable) �Ͽ�
			//h2 ��� Hashtable �ڷᱸ���� ��Ƴ���
			//Object obj = ois.readObject();
			Hashtable h2 = (Hashtable)ois.readObject();
			//�ٿ� ĳ������ �ϰ� ����

			ois.close();
			//-- ois �ݳ� -> ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//-- fis �ݳ� -> FileInputStream ���ҽ� �ݳ�

			//------------------------------------������� �����ϸ� �о���̴� �۾� ��

			//�о���� h2 ��ü�� ���� Ȯ��

			String key;
			String value;

			// �� Iterator ����� �� ����!!

			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- Hashtable �ڷᱸ���� ������� key ���� �о���̴� ����

				//�׽�Ʈ
				//System.out.println(key);

				value = (String)h2.get(key);
				//Hashtable �ڷᱸ���� ������� Key �� Ȱ���Ͽ� value �� ���� ����

				System.out.println(key + " -> " + value);
			}


			

		}



	}

}