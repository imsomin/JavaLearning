//�÷��� �����ӿ�ũ(Collection Framework)

//���� ����� ���� ���α׷� ���� �ǽ�

/*
���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 

	1��° ��� �Է� : �ٳ���
	1��° ��� �Է� ����~
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ����
	2��° ��� �Է� ����~
	��� �Է� ���(Y/N)? : N

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		�ٳ���
		����
	���� ��ü ��� �Ϸ�~

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ����

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ����

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : �ٳ���
		
	[���� ��� ���]
	�ٳ��� �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ���

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ����
	������ ���� �Է� : ����

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		����
	���� ��ü ��� �Ϸ�~


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����

*/


package High;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class Menus
{
	public static final int E_ADD = 1; //��� �߰�
	public static final int E_PRI = 2; //��� ���
	public static final int E_SEA = 3; //��� �˻�
	public static final int E_DEL = 4; //��� ����
	public static final int E_CHA = 5; //��� ����
	public static final int E_END = 6; //����
}


public class day28_5 {
	
	//�ֿ� �Ӽ� ����
	private static final Vector<Object> vt;  //�ڷ� ����(�ڷ� ���� �� Ȱ��)
	private static BufferedReader br;        //�Է� ���
	private static Integer sel;              //���� ��
	private static String con;               //��� ����
	

	//static �ʱ�ȭ ��
	static
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();
		
		//BufferedReader �ν��Ͻ� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //�ڡڡ�java.lang.NullPointerException
		br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}
	
	
	//��޴� ��� �޼ҵ� ����
	public static void menuPrint()
	{
		
		System.out.println("[�޴� ����]");
		System.out.println("1.��� �߰�");
		System.out.println("2.��� ���");
		System.out.println("3.��� �˻�");
		System.out.println("4.��� ����");
		System.out.println("5.��� ����");
		System.out.println("6.��       ��");
		System.out.print(">>�޴� ����(1~6) :");	
		
		//\n : Enter
		//\t : Tap
		
	}//end menuPrint
	
	
	//��޴� ���� �޼ҵ� ����
	public static void menuSelect() throws IOException, NumberFormatException 
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
		
	}//end menuSelect
	
	//�鼱�õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ� ����
	public static void menuRun() throws IOException
	{
		//IF�� Ȱ��
		/*
		if (sel == 1)
		{
			addElement();    //�߰�
		}
		else if (sel == 2)
		{
			dispElement();   //���
		}
		else if (sel == 3)
		{
			findElement();   //�˻�
		}
		else if (sel == 4)
		{
			delElement();    //����
		}
		else if (sel == 5)
		{
			chaElement();    //����
		}
		else if (sel == 6)
		{
			exit();          //����
		}
		*/
	

		//switch�� Ȱ��
		switch (sel)
		{
         	case Menus.E_ADD : addElement(); break;      //-- ��� �߰�
         	case Menus.E_PRI : priElement(); break;      //-- ��� ���
         	case Menus.E_SEA : seaElement(); break;      //-- ��� �˻�
         	case Menus.E_DEL : delElement(); break;      //-- ��� ����
         	case Menus.E_CHA : chaElement(); break;      //-- ��� ����
         	case Menus.E_END : end(); break;             //-- ����
         	//default : System.out.println("\t >> �޴� ���� ����~"); break;
		}

	}//end menuRun
	
	
	//---------------�ڷᱸ�� ���� �޼ҵ� �߰�----------------
	
	
	//��� �߰�(�Է�) �޼ҵ� ����
	public static void addElement() throws IOException
	{
		do 
		{
			System.out.printf("%d��° ��� �Է� :" , vt.size()+1);
			
			String temp = br.readLine();
			vt.add(temp);
			
			System.out.println();
			System.out.printf("%d��° ��� �Է� ����!" , vt.size());
			
			System.out.print("\n��� �Է� ���(Y/N)? : ");
			//con = br.readLine().toUpperCase();
			con = br.readLine();
			
		} while (con.equals("y") || con.equals("Y"));
		//while (con.equals("Y"));
		//while (con != "n" || con != "N" || con != "y" || con != "Y");
		
		
		System.out.println();
	
	}//end addElement
	
	
	//��ü ��� ��� �޼ҵ� ����
	public static void priElement()
	{
		System.out.println();
		System.out.println("[���� ��ü ���]");
		
		for (int i = 0; i < vt.size(); i++) {
			System.out.printf("\n%s", vt.get(i));
		}
		System.out.println("\n���� ��ü ��� �Ϸ�~");
		
	}//end priElement
	
	
	//�ڷᱸ�� �� ��� �˻� �޼ҵ� ����
	public static void seaElement() throws IOException
	{	
		System.out.print("�˻��� ��� �Է� : ");
		String temp = br.readLine();
		
		int i = vt.indexOf(temp);
		System.out.println("[�˻� ��� ���]");
		
		if (i<0)
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		else
			System.out.println("�׸��� �����մϴ�.");
		
	}//end seaElement
	
	
	//�ڷᱸ�� �� ��� ���� �޼ҵ� ����
	public static void delElement() throws IOException
	{
		System.out.println();
		System.out.print("������ ��� �Է� : ");
		String temp = br.readLine();
		
		System.out.println();
		System.out.print("[���� ��� ���]");
		
		if (vt.contains(temp)) 
		{
			int i = vt.indexOf(temp);
			
			vt.remove(i);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			//System.out.printf("\t%s �׸��� �����Ǿ����ϴ�.", temp);
			//System.out.println(temp + "�׸��� �����Ǿ����ϴ�.");
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		
	}//end delElement
	
	
	//�ڷᱸ�� �� ��� ���� �޼ҵ� ����
	public static void chaElement() throws IOException
	{
		System.out.print("������ ��� �Է� : ");
		String temp = br.readLine();
		
		if (vt.contains(temp)) 
		{
			System.out.print("������ ��� �Է� : ");
			String cha = br.readLine();
			int i = vt.indexOf(temp);
			vt.set(i, cha);
			
			System.out.println();
			System.out.println("[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
		}
		else
		{
			System.out.println("[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
		
	}//end chaElement
	
	
	//���α׷� ���� �޼ҵ�  ����
	public static void end()
	{
		System.out.println("���α׷� ����\n");
		System.exit(-1);
	}//end end
	
	
	//main() �޼ҵ� ����
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuPrint();
			menuSelect();
			menuRun();
		}
		while (true);

	}//end main

	
}
