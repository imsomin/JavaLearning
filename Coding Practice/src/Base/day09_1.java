// continue �ǽ�
// (�޺κ��� �����ϰ� + ) ����ط�

package Base;

public class day09_1 {
	
	public static void main(String[] args)
	{

		int n=0, s=0;

		while (n<50)
		{
			n++;

			//Ȯ��
			//System.out.println("n: " + n);

			if (n%2==0)  //n�� ¦�����,
				continue;  //--�޺κ� �����ϰ� ����ض�!
			
			s += n;  //�޺κ�
			System.out.println(n + " : " + s);  //�޺κ�


		
		}



	}

}

//���
/*
1 : 1
3 : 4
5 : 9
7 : 16
9 : 25
11 : 36
13 : 49
15 : 64
17 : 81
19 : 100
21 : 121
23 : 144
25 : 169
27 : 196
29 : 225
31 : 256
33 : 289
35 : 324
37 : 361
39 : 400
41 : 441
43 : 484
45 : 529
47 : 576
49 : 625
*/
