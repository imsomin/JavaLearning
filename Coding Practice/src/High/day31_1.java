//�ڹ��� �⺻ �����(I/O)

//OutputStream �ǽ�
//OutputStream : ����Ʈ ��� ��Ʈ�� ��ü

package High;

import java.io.OutputStream;
import java.io.IOException;


public class day31_1 {
	
	public static void main(String[] args)  throws IOException
	{

		//System.in : �ڹ��� ǥ�� �Է� ��Ʈ��
		//System.out : �ڹ��� ǥ�� ��� ��Ʈ��
		OutputStream out = System.out;
		//--OutputStream�� ����Ʈ��� ��Ʈ���� ����� �� �ش��Ѵ�
		//  'system.out'�� ��ü�� �ش��Ѵ�
		//  �̴� ��ĳ���ÿ� �ش��ϴٰ� ���� �����ϴ�

		// �迭 ����
		byte[] ch = new byte[3];
		ch[0] = 65;     //A
		ch[1] = 97;     //a
		ch[2] = 122;    //z

		out.write(ch);  
		//--������ ������ ������(����)�� ��Ʈ���� ���
		//  ���ٱ⿡�ٰ� ���� ���� ���� ����
		//--out <= OutputStream

		out.flush();    
		//--��ϵ� ��Ʈ���� ��������(�о��) ����� ���� (like �ֻ��)
		//  ������ Buffer �� Ȱ������ �ʰ� �ִ� ��Ȳ�̱� ������ ������ ������ �ڵ�
		//  Buffered �Ǿ� �ִ� ��Ʈ��(stream)�� ��� ���� �Ұ�

        out.close();    
        //--��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�
		//  (out ��Ʈ����(����������) �ᰡ���� ��Ȳ)

		System.out.println("�������� �ŷڸ� ���� �ִ� ����");
		//���� ������ ������ �ʾƾ� ������!
		//(�ֳ��ϸ� ���������� ��� �����̱� ����)
		
		//out.close() �ּ�ó�� �� ���
		//Aaz�������� �ŷڸ� ���� �ִ� ����
		

	}

}

//���
//Aaz