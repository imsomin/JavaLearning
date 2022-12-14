//컬렉션 프레임워크(Collection Framework)

//스택(Stack)

package High;

import java.util.Stack;

public class day27_1 {
	
	//정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	//생성자
	public day27_1()
	{
		//st 라는 Stack 자료구조 생성
		//제너릭을 활용하여 자료구조에 담기는 데이터 표현 -> <String>
		Stack<String> st = new Stack<String>();

		//st 라는 Stack 자료 구조에 데이터 담기
		//st = colors;   //(X)
		for (String color : colors)
		{
			st.push(color);
		}

		st.push("보라");


		//st.push(10);
		//st.push(10.0);
		//에러 발생(컴파일 에러)
		//제네릭 표현식을 통해 선언하고 있는
		//String이 아닌 다른 자료형(int 나 double)을
		//스택 자료구조 st 에 push() 하려고 했기 때문에 발생!



		//출력 메소드 호출
		popStack(st);

	}


	//출력 메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();

	}





	public static void main(String[] args)
	{
	
		day27_1 ob = new day27_1();

	}

}

//결과
//pop : 보라 연두 빨강 파랑 초록 노랑 검정 