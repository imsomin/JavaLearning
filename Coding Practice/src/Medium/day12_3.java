//배열의 기본적 활용

//사용자로부터 인원수를 입력받고
//입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
//이를 이름 배열과 전화번호 배열로 구성하여
//결과를 출력할 수 있는 프로그램을 구현한다.

package Medium;

import java.util.Scanner;

public class day12_3 {
	
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//사용자가 입력하는 학생수를 담아낼 변수
		int n = 0;

		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1-10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		
		System.out.printf("사용자가 입력한 인원 수 : %d%n" , n);
		System.out.println();
		
		//인원 수 만큼의 이름 저장 배열 구성
		String[] names = new String[n];

		//인원 수 만큼의 전화번호 저장 배열 구성
		//String[] tels = new String[n];
		String[] tels = new String[names.length];

		//인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기
		//for (int i=0; i<names.legnth; i++)
		//for (int i=0; i<tels.legnth; i++)
		for (int i=0; i<n; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		//최종 결과(이름, 전화번호) 출력
		System.out.println("-----------------------");
		System.out.printf("전체 학생 수 : %d명%n", n);
		System.out.println("-----------------------");
		System.out.println("이름      전화번호   ");

		for (int i=0; i<n; i++)
		{
			System.out.printf("%4s %14s%n", names[i], tels[i]);
		}
		System.out.println("-----------------------");
		
	}

}


//결과
/*
입력 처리할 학생 수 입력(명, 1-10) : 2
사용자가 입력한 인원 수 : 2

이름 전화번호 입력[1](공백 구분) : 가나다 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 마바사 010-2222-2222
-----------------------
전체 학생 수 : 2명
-----------------------
이름      전화번호   
 가나다  010-1111-1111
 마바사  010-2222-2222
-----------------------
*/
