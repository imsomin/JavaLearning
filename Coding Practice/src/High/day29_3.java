//�÷��� �����ӿ�ũ(Collection Framework)

//String[] -> List : Arrays.asList()
//List -> String[] : List.toArray()

package High;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day29_3 {
	
	public static void main(String[] args)
	{

		List<String> mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");

		
		//(1)List -> String[]
		String[] sArrays = mList.toArray(new String[mList.size()]);

		for (String s : sArrays )
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//-->> 1 2 3

		
		//(2)String[] -> List
		List<String> mNewList = Arrays.asList(sArrays);
		//'Arrays.asList()' �� ��ȯ �ڷ����� List

		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//-->> 1 2 3
		
		
	}

}
