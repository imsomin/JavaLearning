//�������̽�(Interface)
//�������̽� Ȱ�� ���� ó�� ���α׷� ����

package High;


import java.util.Scanner;
import java.io.IOException;

// �Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��
class Record
{
	String hak, name;    //�й�, �̸�
	int kor, eng, mat;   //����, ����, ���� ����
	int tot, avg;        //����, ���(���ǻ� ���� ó��)
}

//�������̽� 
interface Sungjuk
{
	public void set();    //�ο� ����
	public void input();  //������ �Է�
	public void print();  //��� ���
}


//���� �ذ� �������� �����ؾ� �� Ŭ���� -> Sungjuk �������̽��� �����ϴ� Ŭ����
//class SungjukImpl
//abstract class SungjukImpl implements Sungjuk
class SungjukImpl implements Sungjuk
{
	int num, i, j;
	int[][] temp;
	char[][] rank;
	Record[] rc;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) :");
			num = sc.nextInt();  //Scanner-> "Ư�� ������ ���� �Է� �ޱ�"
		}
		while (num <1 || num >10 );
		
		
		//Record �迭 ����
		rc = new Record[num];
		temp = new int[num][3];
		rank = new char[num][3];

	}//end set()

	
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (i=0; i<num; i++)
		{
			rc[i] = new Record();
			
		System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));

		rc[i].hak = sc.next();
		rc[i].name = sc.next();


		System.out.printf("���� ���� ���� ���� �Է�(���� ����) : ");
		temp[i][0] = rc[i].kor = sc.nextInt();
		temp[i][1] = rc[i].eng = sc.nextInt();
		temp[i][2] = rc[i].mat = sc.nextInt();

		rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
		rc[i].avg = rc[i].tot/3;

		}

		System.out.println();

		
		for (i=0; i<num; i++)
		{
			for (j=0; j<3; j++)
			{
				switch (temp[i][j] - temp[i][j]%10)
				{
					case 100: case 90: rank[i][j] = '��'; break;
					case 80: rank[i][j] = '��'; break;
					case 70: rank[i][j] = '��'; break;
					case 60: rank[i][j] = '��'; break;
					default: rank[i][j] = '��'; break;
					
				}
			}
		}

	}//end input()

	@Override
	public void print()
	{
		System.out.println();

		for (i=0; i<num; i++)
		{
			System.out.printf("%s %s %3d %3d %3d\t%3d %3d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			//->�й�, �̸�, ��������, ��������, ��������, ����, ��� ���

			System.out.printf("\t\t%3c%3c%3c\n", rank[i][0], rank[i][1], rank[i][2]);
			//->������, ������, ���е��
			
		}
			
			
	}//end print()


}


//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class day20_4 {
	
	public static void main(String[] args) throws IOException
	{
		/*
		SungjukImpl ob;

		ob = new SungjukImpl();
		*/

		SungjukImpl ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}

}

//���
/*
�ο� �� �Է�(1~10) : 3
1��° �л��� �й� �̸� �Է�(���� ����) :  20220001 ������
���� ���� ���� ���� �Է�(���� ����) :  90 100 80 
2��° �л��� �й� �̸� �Է�(���� ����) :  20220002 ���ٻ�
���� ���� ���� ���� �Է�(���� ����) :  70 100 100 
3��° �л��� �й� �̸� �Է�(���� ����) :  20220003 ������
���� ���� ���� ���� �Է�(���� ����) :  78 98 85


20220001 ������  90 100  80	270  90
		  ��  ��  ��
20220002 ���ٻ�  70 100 100	270  90
		  ��  ��  ��
20220003 ������  78  98  85	261  87
		  ��  ��  ��
*/
