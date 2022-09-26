//���� (Exception) ó��

package High;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class day26_1
{
	private String[] data = new String[3];

	public void proc() // throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;
		
		/*
		System.out.print("�̸� �Է�[����:Ctrl+z] : ");

		while ( (str = br.readLine() ) != null )
		{
			data[n++] = str;
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");
		}

		System.out.println("�Էµ� ����");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
		 */

		try
		{ 
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");

			while ( (str = br.readLine() ) != null )
			{
				data[n++] = str;
				System.out.print("�̸� �Է�[����:Ctrl+z] : ");
			}
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���� �߻�!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace");
			e.printStackTrace();
		}
		

		System.out.println("�Էµ� ����");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}
	
	
	public static void main(String[] args) // throws IOException
	{
		day26_1 ob = new day26_1();
		ob.proc();
	}
}

//���
/*
�̸� �Է�[����:Ctrl+z] : ������
�̸� �Է�[����:Ctrl+z] : ���ٻ�
�̸� �Է�[����:Ctrl+z] : ������
�̸� �Է�[����:Ctrl+z] : �Էµ� ����
������
���ٻ�
������
*/
