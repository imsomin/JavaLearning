//�ڹ��� �⺻ �����(I/O)

//Reader �ǽ�
//Reader : ���� ��� ��Ʈ�� ��ü

package High;

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;


public class day31_2 {
	
	public static void main(String[] args)  throws IOException
	{
		int data;
		char ch;

		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		while (  (data = rd.read())  !=  -1  )  //���ڱ��
		{
			ch = (char)data;

			//System.out.print(ch);  //--���ڱ�� print
			//������
			/*
			���ڿ� �Է�(����:Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�����ٶ�
			*/

			
			System.out.write(ch); //--����Ʈ��� write
			//������
			/*
			���ڿ� �Է�(����:Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
                             ��|
			*/

		}


	}

}
