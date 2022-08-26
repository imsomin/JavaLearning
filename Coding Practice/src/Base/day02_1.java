package Base;

import java.io.IOException;

public class day02_1 {
	
	public static void main(String[] args) throws IOException
	{
		//변수 선언
		char ch, result;
		
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		
		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : (ch>='a' && ch<='z') ? (char)(ch-32) : ch;
		
		System.out.print(ch + "->" + result);
		
		
		
		
	}
	
	

}

// h -> H
// D -> d