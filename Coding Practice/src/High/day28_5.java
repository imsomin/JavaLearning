//컬렉션 프레임워크(Collection Framework)

//다음 기능을 가진 프로그램 구현 실습

/*
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 

	1번째 요소 입력 : 바나나
	1번째 요소 입력 성공~
	요소 입력 계속(Y/N)? : y

	2번째 요소 입력 : 딸기
	2번째 요소 입력 성공~
	요소 입력 계속(Y/N)? : N

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		바나나
		딸기
	벡터 전체 출력 완료~

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 멜론

	[검색 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 딸기

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 포도

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 바나나
		
	[삭제 결과 출력]
	바나나 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 사과

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 딸기
	수정할 내용 입력 : 수박

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		수박
	벡터 전체 출력 완료~


	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 번경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료

*/


package High;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class Menus
{
	public static final int E_ADD = 1; //요소 추가
	public static final int E_PRI = 2; //요소 출력
	public static final int E_SEA = 3; //요소 검색
	public static final int E_DEL = 4; //요소 삭제
	public static final int E_CHA = 5; //요소 변경
	public static final int E_END = 6; //종료
}


public class day28_5 {
	
	//주요 속성 구성
	private static final Vector<Object> vt;  //자료 구조(자료 적재 시 활용)
	private static BufferedReader br;        //입력 기능
	private static Integer sel;              //선택 값
	private static String con;               //계속 여부
	

	//static 초기화 블럭
	static
	{
		//Vector 자료구조 생성
		vt = new Vector<Object>();
		
		//BufferedReader 인스턴스 생성
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //★★★java.lang.NullPointerException
		br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}
	
	
	//①메뉴 출력 메소드 생성
	public static void menuPrint()
	{
		
		System.out.println("[메뉴 선택]");
		System.out.println("1.요소 추가");
		System.out.println("2.요소 출력");
		System.out.println("3.요소 검색");
		System.out.println("4.요소 삭제");
		System.out.println("5.요소 변경");
		System.out.println("6.종       료");
		System.out.print(">>메뉴 선택(1~6) :");	
		
		//\n : Enter
		//\t : Tap
		
	}//end menuPrint
	
	
	//②메뉴 선택 메소드 생성
	public static void menuSelect() throws IOException, NumberFormatException 
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
		
	}//end menuSelect
	
	//③선택된 메뉴 실행에 따른 기능 호출 메소드 생성
	public static void menuRun() throws IOException
	{
		//IF문 활용
		/*
		if (sel == 1)
		{
			addElement();    //추가
		}
		else if (sel == 2)
		{
			dispElement();   //출력
		}
		else if (sel == 3)
		{
			findElement();   //검색
		}
		else if (sel == 4)
		{
			delElement();    //삭제
		}
		else if (sel == 5)
		{
			chaElement();    //수정
		}
		else if (sel == 6)
		{
			exit();          //종료
		}
		*/
	

		//switch문 활용
		switch (sel)
		{
         	case Menus.E_ADD : addElement(); break;      //-- 요소 추가
         	case Menus.E_PRI : priElement(); break;      //-- 요소 출력
         	case Menus.E_SEA : seaElement(); break;      //-- 요소 검색
         	case Menus.E_DEL : delElement(); break;      //-- 요소 삭제
         	case Menus.E_CHA : chaElement(); break;      //-- 요소 변경
         	case Menus.E_END : end(); break;             //-- 종료
         	//default : System.out.println("\t >> 메뉴 선택 오류~"); break;
		}

	}//end menuRun
	
	
	//---------------자료구조 관련 메소드 추가----------------
	
	
	//요소 추가(입력) 메소드 생성
	public static void addElement() throws IOException
	{
		do 
		{
			System.out.printf("%d번째 요소 입력 :" , vt.size()+1);
			
			String temp = br.readLine();
			vt.add(temp);
			
			System.out.println();
			System.out.printf("%d번째 요소 입력 성공!" , vt.size());
			
			System.out.print("\n요소 입력 계속(Y/N)? : ");
			//con = br.readLine().toUpperCase();
			con = br.readLine();
			
		} while (con.equals("y") || con.equals("Y"));
		//while (con.equals("Y"));
		//while (con != "n" || con != "N" || con != "y" || con != "Y");
		
		
		System.out.println();
	
	}//end addElement
	
	
	//전체 요소 출력 메소드 생성
	public static void priElement()
	{
		System.out.println();
		System.out.println("[벡터 전체 출력]");
		
		for (int i = 0; i < vt.size(); i++) {
			System.out.printf("\n%s", vt.get(i));
		}
		System.out.println("\n벡터 전체 출력 완료~");
		
	}//end priElement
	
	
	//자료구조 내 요소 검색 메소드 생성
	public static void seaElement() throws IOException
	{	
		System.out.print("검색할 요소 입력 : ");
		String temp = br.readLine();
		
		int i = vt.indexOf(temp);
		System.out.println("[검색 결과 출력]");
		
		if (i<0)
			System.out.println("항목이 존재하지 않습니다.");
		else
			System.out.println("항목이 존재합니다.");
		
	}//end seaElement
	
	
	//자료구조 내 요소 삭제 메소드 생성
	public static void delElement() throws IOException
	{
		System.out.println();
		System.out.print("삭제할 요소 입력 : ");
		String temp = br.readLine();
		
		System.out.println();
		System.out.print("[삭제 결과 출력]");
		
		if (vt.contains(temp)) 
		{
			int i = vt.indexOf(temp);
			
			vt.remove(i);
			System.out.println("삭제가 완료되었습니다.");
			//System.out.printf("\t%s 항목이 삭제되었습니다.", temp);
			//System.out.println(temp + "항목이 삭제되었습니다.");
		}
		else
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
		
	}//end delElement
	
	
	//자료구조 내 요소 변경 메소드 생성
	public static void chaElement() throws IOException
	{
		System.out.print("변경할 요소 입력 : ");
		String temp = br.readLine();
		
		if (vt.contains(temp)) 
		{
			System.out.print("수정할 요소 입력 : ");
			String cha = br.readLine();
			int i = vt.indexOf(temp);
			vt.set(i, cha);
			
			System.out.println();
			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
			
		}
		else
		{
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
		
	}//end chaElement
	
	
	//프로그램 종료 메소드  생성
	public static void end()
	{
		System.out.println("프로그램 종료\n");
		System.exit(-1);
	}//end end
	
	
	//main() 메소드 생성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuPrint();
			menuSelect();
			menuRun();
		}
		while (true);

	}//end main

	
}
