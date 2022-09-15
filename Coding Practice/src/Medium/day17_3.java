//정렬(Sort) 알고리즘

//사용자로부터 여러 학생의 성적 데이터를 입력받아
//점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//결과를 출력하는 프로그램을 구현한다.
//단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

package Medium;

import java.util.Scanner;

public class day17_3 {
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);


		int inwon;  //--인원 수


		//버블 정렬 활용===========================================
		//'flag' 변수는 
		//코드의 일괄 처리를 할 때 특정 조건을 만족했을 경우 
		//특정 명령을 수행하도록 하기 위해서 사용
		//즉 flag 변수는 특정 조건을 만족하였는지 여부를 나타낸다!
		//조건이 하나일 경우는 boolean타입, 조건이 여러 개일 경우는 int타입 사용
		//====================================================
		
		
		int pass = 0;
		boolean flag;
		

		//인원 수 입력
		System.out.print("인원 수 입력 : ");
		inwon = sc.nextInt();
		

		//인원 수만큼 배열을 생성
		String[] name = new String[inwon];  //--이름

		int[] score = new int[inwon];  //--점수

		int[] grade = new int[inwon];  //--등수



		//배열 공간에 이름과 점수 담기
		for (int i=0; i<score.length; i++)
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : " , i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}


		
		//향샹된 Bubble Sort(버블 정렬)
		do
		{
			flag = false;  // 이번 회전에서는 자리 바꿈이 일어나지 않을 것이라 전제
			pass++;        // 자리 회전이 일어나지 않으면 false하고 마무리


			//점수 비교
			for (int i=0; i<score.length-pass; i++)
			{
				if (score[i] < score[i+1])
				{
					score[i] = score[i]^score[i+1];
					score[i+1] = score[i+1]^score[i];
					score[i] = score[i]^score[i+1];

					String str;						
					str = name[i];
					name[i] = name[i+1];
					name[i+1] = str;

					flag = true;
				}
			}
		}

		while (flag);
		//--flag 변수가 false 라는 것은
		//  회전이 구분적으로 발생하는 동안 점수 변동이 일어나지 않은 경우로
		//  더 이상의 반복문 수행은 무의미한 것으로 판단 가능!



		//결과 출력
		System.out.println();
		System.out.println("=======================");
		

		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d등 %s %d\n", i+1, name[i], score[i]);	
		}


		System.out.println("=======================");




	}

}


//결과
/*
인원 수 입력 : 4
이름 점수 입력(1, 공백 구분) : 가나다 90
이름 점수 입력(2, 공백 구분) : 마바사 80
이름 점수 입력(3, 공백 구분) : 아자차 95
이름 점수 입력(4, 공백 구분) : 타파하 76

=======================
1등 아자차 95
2등 가나다 90
3등 마바사 80
4등 타파하 76
=======================
*/
