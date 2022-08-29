package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day04 {
	
	public static void main(String[] args) throws IOException
	{
		//인스턴스 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		String name;
		int kor, eng, mat, tot;
		int avg;
		
		//입력값 연산 처리
		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(br.readLine());
				
		
		// 90점 ~ 100점 : A       
		// 80 ~ 89점     : B
		// 70점 ~  79점 : C       
		// 60 ~ 69점     : D
		// 60점 미만         : F
		
		//국어 + 영어 + 수학
		tot = kor + eng + mat;
		
		//평균
		avg = tot / 3;
		//avg = tot / 3.0;
		//int avg = (kor+eng+mat)/3;
		
		//switch 구문 활용하여 등급 계산 처리하기
		//점수 변수 선언
		char grade;
		//A,B,C,D,F 가 문자이므로 CHAR!
		
		grade = (char)System.in.read();
		//화면에서 '문자'를 직접 입력받을 것이다
		
		switch (avg/10) {
		case 10: case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;

		default: grade='F'; break;
		}
		
		
		//결과 출력
		System.out.println();
		System.out.printf("나의 이름은 %s 랍니다~ \n", name);
		System.out.printf("이번 시험 결과... 총점은 %d, 평균은 %d입니다... \n" , tot, avg);
		System.out.printf("그래서 결과는 %c 입니다!!! \n", grade);
		
		
	}

}



/*
이름 입력 : 가나다
국어점수 입력 : 90
영어점수 입력 : 76
수학점수 입력 : 56


나의 이름은 가나다 랍니다~ 
이번 시험 결과... 총점은 222, 평균은 74입니다... 
그래서 결과는 C 입니다!!! 
*/







