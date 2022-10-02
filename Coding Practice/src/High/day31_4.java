//�ڹ��� �⺻ �����(I/O)

//Reader Writer �ǽ�


package High;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;


public class day31_4 {
	
	public void process(InputStream is)  //����Ʈ ��� ����� , System.in �� �Ѱ��ذ� �޴� ����!
	{
		int data;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{
			//�Ű����� is ��� ����Ʈ ��� ��ü(InputStream)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//(->InputStreamReader �� ����)
			//ReaderŸ���� rd���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);
			//--���ڱ���� �Է� ��Ʈ������ �ٲ�

			//����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(System.out)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//(->OutputStreamWriter �� ����)
			//WriterŸ���� wt���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);
			//--���ڱ���� ��� ��Ʈ������ �ٲ�

			while ( (data = rd.read()) != -1 )
			{
				wt.write(data);  //�������� ��Ʈ�� ���ٱ⿡ ���
				wt.flush();      //����� ��Ʈ���� �о�� ������
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

	}


	public static void main(String[] args)
	{
		day31_4 ob = new day31_4();
		ob.process(System.in);
	}


}

//���
/*
���ڿ� �Է�(����:Ctrl+z)
�ȳ�
�ȳ�
1234
1234
hello
hello
*/
