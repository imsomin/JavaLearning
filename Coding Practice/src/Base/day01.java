package Base;

import java.util.Scanner;

public class day01 {
	
	public static void main(String[] args) 
	{
		//인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//주요 변수 선언
		String name;
		int kor, eng, mat, tot;
		
		//연산 및 처리
		System.out.println("이름, 국어, 영어, 수학 입력(',' 구분) : ");
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*, \\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;
		
		//결과 출력
		System.out.println("\n>> 이름 :" + name);
		System.out.println(">> 총점 : " + tot);
		
		
		
	}
	
	

}






/*
 Exception in thread "main" java.util.NoSuchElementException
 → Scanner 객체 사용 종료로 인한 오류 발생! 존재하지 않는 것을 가져오려고 할 때 발생하는 에러이다.
 
 */








