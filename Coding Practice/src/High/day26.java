//���� (Exception) ó��

/*
���α׷����� �߻��ϴ� ����(Error)��

1. �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����(Error)��

2. ���α׷��� �����ϴ� �������� �߻��ϴ� ��Ÿ�� ����(Error)��
���� �� �ִ�.

- �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
    ������ ����� �������� �Ǵ� ������ ����(Error)��

- �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

- ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
     ���ܻ���(Exception)�� �ִ�.

      ���� ���,
   -> � ���� 0���� �����ų�
   -> �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�
   -> �������� �ʴ� ������ �����Ͽ� �о���δٰų�

   ==>> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
       ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ���� �ٷ�
   '����ó��'�̴�.


�� ������ ���� ���� ( -> Exception Ŭ����)

- ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
�ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

- ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
�޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
�װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� �������ش�.

- �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

- Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

- Throwable Ŭ�������� �Ļ��� Ŭ����(Exception Ŭ����)
Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
������ �� �ִ� ���� ��Ȳ����
�޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

- Error Ŭ����
�ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.


�� ������ ����

- checked exception
: �޼ҵ� ������ ���ܰ� �߻��� ���,
    �޼ҵ带 ������ �� 'throws' ���� �޼ҵ� ������ �߻��� �� �ִ�
    ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� 'try-catch'�ؼ�
    ó���� �־�߸� �ϴ� �����̴�.
    �����Ϸ��� ������ �ϴ� �������� 'checked exception'��
  'throws'�Ǵ°��� ���� Ȥ�� 'try~catch'�Ǵ����� ���θ� �Ǵ��Ͽ�
    ���α׷����� ���ܸ� � ������ε� ó������ ������
    ������ ��ü�� �Ұ����ϴ�.

- unchecked exception
: ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
     ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.
*/


/*
<java.lang.Throwable> Ŭ������ �ֿ� �޼ҵ�

 - String toString
 : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
 
 - void printStackTrace(PrintStream s)
 - void printStackTrace(printWriter w)
 : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.
*/

/*
<�ֿ� ��Ÿ�� ����> Ŭ����
 
 -ArithmeticExcpetion
: ��ġ ������ ����(0���� ������ ��)
 -ArrayStoreException
: �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����
 -IndexOutOfBoundException
: �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
 -ClassCastException
: Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
 -NullPointerException
: �� ��ü�� �����ϴ� ��� (�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����
 -SecurityException
: �ڹ��� ���� ���� ��Ȳ�� �����Ͽ��� ��� �߻��ϴ� ����
                         :
*/


package High;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class day26 {
	
   public static void main(String[] args)  // throws IOException  // (1) ����ó�����
   {

	   //BufferedReader Ŭ���� �ν��Ͻ� ����
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   //�ֿ� ���� ����
	   int a, b, c;


	   // (2) ����ó�����
	   /*
		try
		{
		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c = a + b;

		System.out.println("��� : " + c);

		}
		catch (IOException e)
		{
		// IOException - > checked exception
		//--�޼ҵ带 �����ϴ� �������� throws �� ����
		//  ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
		System.out.println(e.toString());
		}
		*/
	    //���� ���
		/*
		ù��° ���� �Է� : 9
		�ι�° ���� �Է� : 10
		��� : 19
		-----------------
		ù��° ���� �Է� : a
		Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
		at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		at java.lang.Integer.parseInt(Integer.java:580)
		at java.lang.Integer.parseInt(Integer.java:615)
		at High.day26.main(day26.java:126)
		 */

	   
	   	// (3) ����ó�����
	   	/*
		try
		{
		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c = a + b;

		System.out.println("��� : " + c);

		}
		catch (IOException e1)
		{
		// IOException - > checked exception
		//--�޼ҵ带 �����ϴ� �������� throws �� ����
		//  ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
		System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{
		// NumberFormatExceotion -> unchecked exception
		//--��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
		//  �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
		System.out.println(e2.toString());
		System.out.println("���� ������ �����͸� �Է��ؾ� �մϴ�!");
		}
		*/
	   	//������
		/*
		ù��° ���� �Է� : 7
		�ι�° ���� �Է� : 2
		��� : 9
		-----------------
		ù��° ���� �Է� : a
		java.lang.NumberFormatException: For input string: "a"
		���� ������ �����͸� �Է��ؾ� �մϴ�!
		 */

	   
	   	// (4) ����ó�����
	   	/*
		try
		{
		System.out.print("ù��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c = a + b;

		System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
		System.out.println(e.toString());
		System.out.println(e.getMessage());
		System.out.println("printStackTrace...");
		e.printStackTrace();
		}
		*/
		//������
		/*
		ù��° ���� �Է� : 2
		�ι�° ���� �Է� : 3
		��� : 5
		---------------
		ù��° ���� �Է� : a
		java.lang.NumberFormatException: For input string: "a"
		For input string: "a"
		printStackTrace...
		java.lang.NumberFormatException: For input string: "a"
		at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
		at java.lang.Integer.parseInt(Integer.java:580)
		at java.lang.Integer.parseInt(Integer.java:615)
		at High.day26.main(day26.java:207)

		 */

	   
	   	// (5) ����ó�����
	   	try
	   	{
	   	System.out.print("ù��° ���� �Է� : ");
	   	a = Integer.parseInt(br.readLine());
	   	
	   	System.out.print("�ι�° ���� �Է� : ");
	   	b = Integer.parseInt(br.readLine());

	   	c = a + b;

	   	System.out.println("��� : " + c);

	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println(e.toString());
	   	}
	   	finally
	   	{
	   		//���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
	   		System.out.println("����ó�� �����Դϴ�~");
	   	}
		//������
	   	/*
	   	ù��° ���� �Է� : 5
		�ι�° ���� �Է� : 6
		��� : 11
		����ó�� �����Դϴ�~
        ----------------
                  ù��° ���� �Է� : a
		java.lang.NumberFormatException: For input string: "a"
		����ó�� �����Դϴ�~
	   	 */


   }

}
