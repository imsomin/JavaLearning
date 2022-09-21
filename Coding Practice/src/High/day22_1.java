//자바의 주요(중요) 클래스

//day22.java와 비교

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
		return "재정의한 toString()";
	}

	public static void main(String[] args)
	{
		day22_1 ob = new day22_1();
		

		System.out.println(ob.toString());
		//-->재정의한 toString()

		System.out.println(ob);
		//-->재정의한 toString()

	}


}
