//�ڹ��� �ֿ�(�߿�) Ŭ����

//day22.java�� ��

//import java.lang.*;

package High;

public class day22_1 //extends Object
{
	
	/*

	...

	public String toString()
		{
			...;
	}

	...

	*/


	@Override
	public String toString()
	{ 
		return "�������� toString()";
	}

	public static void main(String[] args)
	{
		day22_1 ob = new day22_1();
		

		System.out.println(ob.toString());
		//-->�������� toString()

		System.out.println(ob);
		//-->�������� toString()

	}


}
