//�ڹ��� �ֿ� Ŭ����

//Calendar Ŭ����

/*
- Calendar Ŭ������ �߻� Ŭ������
�׷��Ƿ� ��ü�� ������ �� ����.
(�߻� Ŭ���� : �̿ϼ��� Ŭ����)

- Calendar ob = new Calendar();
-> �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�!

- Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���
  1. Calendar ob1 = Calendar.getInstance();
  
  2. Calendar ob2 = new GregorianCalendar();
	-> GregorianCalendar�� �����ڴ�.
  	-> GregorianCalendar��� Ŭ������ �ְڴ�.
  	-> GregorianCalendar�� CalendarŬ������ ��ӹ޴´�.
    -> �߻�޼ҵ带 �ϼ��ؼ� GregorianCalendar �ڽ��� �߻� Ŭ���� ����ǥ�� ��������.
  	-> Calendar ob2 = new GregorianCalendar(); 
  	-> �ش� ������ ��ĳ���� ���� �����̴�.

  3. GregorianCalendar ob3 = GregorianCalendar();

  (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
*/

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ����Ѵ�!

package High;

import java.util.Calendar; //import ���� �ʿ��ϴ�!

import java.util.GregorianCalendar;

public class day25 {
	
	public static void main(String[] args) 
	{

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar ob = new Calendar();   -->> �Ұ�
		Calendar rightNow = Calendar.getInstance();

		//������ �޷�(Calendar) �ν��Ͻ��� ����
		//��¥ ���� ������ �� �� �ִ� �޼ҵ� -> get()

		int y = rightNow.get(Calendar.YEAR);
		//static -> Calendar.
		//final  -> YEAR(=> �빮��)

		System.out.println(y);
		//--> 2022

		int m = rightNow.get(Calendar.MONTH)+1;  //'+1' �ϴ� �� üũ!!!
		//-> 0�� �������� 1��
		//   1�� �������� 2��

		System.out.println(m);
		//--> 9 

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--> 24 (���� ��¥�� 9�� 24��)

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--> 7 (�����)

		//�� �������� ���� �˾Ƴ���
		System.out.println(Calendar.SUNDAY);    //1
		System.out.println(Calendar.MONDAY);    //2
		System.out.println(Calendar.TUESDAY);   //3
		System.out.println(Calendar.WEDNESDAY); //4
		System.out.println(Calendar.THURSDAY);  //5
		System.out.println(Calendar.FRIDAY);    //6
		System.out.println(Calendar.SATURDAY);  //7
		//��� �� static & final�� ������ Ȯ���� �� �ֵ��� �����ϰ� �ִ�

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--> 2022-9-24 7
		
		String week = "";
		switch (w)
		{
			/*
			case Calendar.SUNDAY : week = "�Ͽ���"; break;
			case Calendar.MONDAY : week = "������"; break;
			case Calendar.TUESDAY : week = "ȭ����"; break;
			case Calendar.WEDNESDAY : week = "������"; break;
			case Calendar.THURSDAY : week = "�����"; break;
			case Calendar.FRIDAY : week = "�ݿ���"; break;
			case Calendar.SATURDAY : week = "�����"; break;
			*/

			case 1 : week = "�Ͽ���"; break;
			case 2 : week = "������"; break;
			case 3 : week = "ȭ����"; break;
			case 4 : week = "������"; break;
			case 5 : week = "�����"; break;
			case 6 : week = "�ݿ���"; break;
			case 7 : week = "�����"; break;
		
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--> 2022-9-24 �����

		
		System.out.println("--------------------------------------------------");


		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		//�޷��� ��¥ ���� -> 'set()' �޼ҵ� Ȱ��
		rightNow2.set(2022, 8, 24);   //  11�� 3�� -> ������� ���� '-1'�� �� ���ش�


		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--> 7

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--> �����


	}

}
