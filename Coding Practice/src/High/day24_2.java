//StringBuffer Ŭ����

/*
-StringBuffer Ŭ������ 
  ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� �������� 
 String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
 StringBuffer Ŭ������ ���ڿ��� ����� ��
  ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

-��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
  ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
  ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

-���� JDK 1.5 ���ĺ��ʹ�
  ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
 StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
  ���� ū �������� multi-thread unsafe ��� ���̴�.
  ��, Synchronization �� ���� ������(����ȭ�� �������� �ʱ⶧����)
  ���ڿ� ������ ���� ���Ͼ������̰ų� ����ȭ�� ������� �ʾƵ� �Ǵ� ��쿡��
 StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.
*/


package High;

public class day24_2 {
	
	public static void main(String[] args)
	{
		
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		//--> false
		//--> false
		//--���ڿ��� ���� ���ϴ� equals
		//  �������̵��� ���ߴ�

		System.out.println(sb1);
		//--> korea

		System.out.println(sb1.toString());
		//--> korea
		//--���ڿ��� ��ȯ
		

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--> true
		//--���� ���ڿ��̴��� ó���� �� �ȵ� ���� ������ �� �����ϴ� ���� �ʿ�


		StringBuffer sb3 = new StringBuffer();
		//--StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//  �⺻������ �����Ǵ� ������ ũ��� '16'

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--> ���� ũ�� : 16

		System.out.println(sb3);
		//--> �ƹ��͵� �� ����

		
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
		//--> ȫ�浿�̼��Ű�����

		sb3.append("seoul");      //sb3 += "seoul";
		sb3.append("korea");      //sb3 += "korea";
		sb3.append("�츮����");      //sb3 += "�츮����";
		sb3.append("���ѹα�");      //sb3 += "���ѹα�";

		System.out.println(sb3);
		//--> seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());
		//--> seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--> ���� ũ�� : 34

	
		System.out.println("--------------------------------------------------");
		

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//StringBuffer���� upper���̽��� lower���̽� ����

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--> SEOULKOREA�츮������ѹα�

		System.out.println(sb3.toString().toUpperCase());
		//--> SEOULKOREA�츮������ѹα�

		
		
        System.out.println("--------------------------------------------------");

		// ���� ��Ȳ [1]
		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    '����ϴ�' �̶�� ���ڿ� �߰�
		// -> ����ϴ�seoulkorea�츮������ѹα�
		sb3.insert(0, "����ϴ�");
		System.out.println("seoul �տ� '����ϴ�' �߰� : " + sb3.toString());
		//--> seoul �տ� '����ϴ�' �߰� : ����ϴ�seoulkorea�츮������ѹα�

		
		//=========================================
		// �׽�Ʈ(1) 
		// ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		// "����" �̶�� ���ڿ� �߰�
		// ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�!!

		// �׽�Ʈ(1) - 0�ܰ�
		//System.out.println(sb3.toString());
		//--> ����ϴ�seoulkorea�츮������ѹα�
		
		// �׽�Ʈ(1) - 1�ܰ�  (�ε����� Ȯ���� ���)
		//sb3.insert(14, "����");
		//System.out.println("korea �ڿ� '����' �߰� : " + sb3.toString());
		//--> korea �ڿ� '����' �߰� : ����ϴ�seoulkorea�����츮������ѹα�
		
		// �׽�Ʈ(1) - 2�ܰ�  (�ε����� Ȯ������ ���� ���)
		//sb3.indexOf("korea");
		//System.out.println(sb3.indexOf("korea"));
		//--> 9

		// �׽�Ʈ(1) - 3�ܰ�
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "����"));
		//--> ����ϴ�seoul����korea�츮������ѹα�
		//��insert�� �����ϰ� �����Ƿ� �׽�Ʈ(1) - 4�� �����ϱ� ���� �ּ� ó���Ѵ�.

		
		// �׽�Ʈ(1) - 4�ܰ�
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "����"));
		//--> ����ϴ�seoulkorea�����츮������ѹα�
		//��insert�� �����ϰ� �����Ƿ� �׽�Ʈ(1) - 5�� �����ϱ� ���� �ּ� ó���Ѵ�.

		
		// �׽�Ʈ(1) - 5
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "����"));
		//--> ����ϴ�seoulkorea�����츮������ѹα�
		//=========================================


		System.out.println("--------------------------------------------------");

		
		// ���� ��Ȳ [2]
		// �� ��� ���ڿ�(sb3)����
		//    '�츮����' ���ڿ� ����
		
		//=========================================
		// �׽�Ʈ(2) - 0�ܰ�
		//System.out.println(sb3);
		//--> ����ϴ�seoulkorea�츮������ѹα�
		
		// �׽�Ʈ(2) - 1�ܰ�
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--> ����ϴ�seoulkorea���ѹα�

		// �׽�Ʈ(2) - 2�ܰ�
		sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		//--> ����ϴ�seoulkorea���ѹα�
		//=========================================
		

		System.out.println("--------------------------------------------------");
		
	
		// ���� ��Ȳ [3]
		// �� ��� ���ڿ� sb3����
		//    korea ������ ���ڿ��� �����Ѵ�(korea ����)
		//'����ϴ�seoulkorea�츮������ѹα�' ���� 'korea�츮������ѹα�' ����
		
		//=========================================
		// �׽�Ʈ(3) - 0�ܰ�
		//sb3.delete(9, 22);
		//System.out.println(sb3);
		//--> ����ϴ�seoul
		
		// �׽�Ʈ(3) - 1�ܰ�
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--> ����ϴ�seoul
		//=========================================

		
		System.out.println("--------------------------------------------------");
		
		
		//���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--> ���� ũ�� : 34


		//���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--> ���ڿ��� ���� : 9


		//���� ũ�� ����
		//--���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();


		//���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--> ���� ũ�� : 9
		
	}

}
