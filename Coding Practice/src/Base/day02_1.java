package Base;

import java.io.IOException;

public class day02_1 {
	
	public static void main(String[] args) throws IOException
	{
		//���� ����
		char ch, result;
		
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();
		
		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : (ch>='a' && ch<='z') ? (char)(ch-32) : ch;
		
		System.out.print(ch + "->" + result);
		
		
		
		
	}
	
	

}

// h -> H
// D -> d