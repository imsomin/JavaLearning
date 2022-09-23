//StringTokenizer Ŭ����

/*
 -�̴� ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
  �Ľ��ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
  ���⿡ '�Ľ� parsing'�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
  ������ �۾��� �ǹ��ϰ� �Ǹ�, �̶� ������ ������ �Ǵ� ���ڿ���
  ��ū(token)�̶�� �Ѵ�.

 -StringTokenizer Ŭ������ ����ϱ� ���ؼ���
 java.util ��Ű���� StringTokenizer �� import �ؾ� �Ѵ�.

 -StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
  ���� �����ǰ� ������ ���ڿ��� �Ľ��ϱ� ���ؼ���
 String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű����(regular ����ǥ��)
  ����� ���� �����ϰ� �ִ�.
 */

/*
   StringTokenizer(String str)
   StringTokenizer(String str, String delim)
   StringTokenizer(String str, String delim, boolean returnDelims)
   -> �־��� ���ڿ� str �� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
             ����(����)���ڴ� delim �� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
	    ���� returnDelims �� true �̸�
	    ���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/
 

package High;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class day24_4 {
	
	public static void main(String[] args) throws IOException
	{

		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ");
		strTemp = br.readLine();
		//--"���,����,�ٳ���,�丶��"


		//StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp�� ��� ���ڿ���("���,����,�ٳ���,�丶��")
		//  ','�� �����ڷ� ����

		//st �� 'countTokens()' �޼ҵ� ȣ��
		//'int countTokens()'
		// : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.
		strArr = new String[st.countTokens()];
		//                  ----------------
		//                          4

		//strArr = new String[4];
		//--4��¥�� ���� �����.


		n=0;
		while (st.hasMoreTokens())
		{
			strArr[n++] = st.nextToken();
		}
		//����� ���̴ϱ�(�������� �����ϱ�, true) ������ �� �ִ�.
		//strArr[0] = "���";
		//strArr[1] = "����";
		//strArr[2] = "�ٳ���";
		//strArr[3] = "�丶��";

		//--'hasMoreTokens()'
		//  : ����� �� �ִ� ��ū�� �����ִ� ��� true �� ��ȯ
		//    �� �̻� ����� ��ū�� ���� ��� flase �� ��ȯ
		//    Ȯ�� ����� ��ȯ�� ��
		//    ���� ������ �о������ �ʰ�,
		//    ���� ������ �о���̴� ��带 �̵���Ű�� �ʴ´�.

		//--'nextToken()'
		//  : ���� ��ū�� ���´�.
		//    ���� ��ū�� ������ ��带 �̵���Ű�� �ȴ�.
		//    �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//	     �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.


		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//������
		/*
		�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ���,����,�ٳ���,�丶��
		�Ľ̵� ��ū(���ڿ�) : ��� ���� �ٳ��� �丶�� 
		 */


	}

}
