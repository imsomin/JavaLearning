package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day02_2 {
	
	public static void main(String[] args) throws IOException
	{
		//인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int year;  //-- 입력한 연도
		String result; //-- 판별 결과
		
		//연산 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine()); //문자열은 바로 담을 수 없으므로 integer 처리 필요

		//윤년 or 평년 구하기
		result = year%4==0 && year%100!=0 || year%400==0 ? "윤년" : "평년";
		
		//결과
		System.out.printf("%d년 -> %s%n", year, result);
		
		
		
		
		
		
	}

}


/*
임의의 연도 입력 : 2022
2022년 -> 평년
 */



