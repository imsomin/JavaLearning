//인터페이스(Interface)
//인터페이스 활용 성적 처리 프로그램 구현

package High;


import java.util.Scanner;
import java.io.IOException;

// 속성만 존재하는 클래스 -> 자료형 활용
class Record
{
	String hak, name;    //학번, 이름
	int kor, eng, mat;   //국어, 영어, 수학 점수
	int tot, avg;        //총점, 평균(편의상 점수 처리)
}

//인터페이스 
interface Sungjuk
{
	public void set();    //인원 세팅
	public void input();  //데이터 입력
	public void print();  //결과 출력
}


//문제 해결 과정에서 설계해야 할 클래스 -> Sungjuk 인터페이스를 구현하는 클래스
//class SungjukImpl
//abstract class SungjukImpl implements Sungjuk
class SungjukImpl implements Sungjuk
{
	int num, i, j;
	int[][] temp;
	char[][] rank;
	Record[] rc;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) :");
			num = sc.nextInt();  //Scanner-> "특정 데이터 유형 입력 받기"
		}
		while (num <1 || num >10 );
		
		
		//Record 배열 생성
		rc = new Record[num];
		temp = new int[num][3];
		rank = new char[num][3];

	}//end set()

	
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (i=0; i<num; i++)
		{
			rc[i] = new Record();
			
		System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));

		rc[i].hak = sc.next();
		rc[i].name = sc.next();


		System.out.printf("국어 영어 수학 점수 입력(공백 구분) : ");
		temp[i][0] = rc[i].kor = sc.nextInt();
		temp[i][1] = rc[i].eng = sc.nextInt();
		temp[i][2] = rc[i].mat = sc.nextInt();

		rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
		rc[i].avg = rc[i].tot/3;

		}

		System.out.println();

		
		for (i=0; i<num; i++)
		{
			for (j=0; j<3; j++)
			{
				switch (temp[i][j] - temp[i][j]%10)
				{
					case 100: case 90: rank[i][j] = '수'; break;
					case 80: rank[i][j] = '우'; break;
					case 70: rank[i][j] = '미'; break;
					case 60: rank[i][j] = '양'; break;
					default: rank[i][j] = '가'; break;
					
				}
			}
		}

	}//end input()

	@Override
	public void print()
	{
		System.out.println();

		for (i=0; i<num; i++)
		{
			System.out.printf("%s %s %3d %3d %3d\t%3d %3d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			//->학번, 이름, 국어점수, 영어점수, 수학점수, 총합, 평균 출력

			System.out.printf("\t\t%3c%3c%3c\n", rank[i][0], rank[i][1], rank[i][2]);
			//->국어등급, 영어등급, 수학등급
			
		}
			
			
	}//end print()


}


//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class day20_4 {
	
	public static void main(String[] args) throws IOException
	{
		/*
		SungjukImpl ob;

		ob = new SungjukImpl();
		*/

		SungjukImpl ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}

}

//결과
/*
인원 수 입력(1~10) : 3
1번째 학생의 학번 이름 입력(공백 구분) :  20220001 가나다
국어 영어 수학 점수 입력(공백 구분) :  90 100 80 
2번째 학생의 학번 이름 입력(공백 구분) :  20220002 마바사
국어 영어 수학 점수 입력(공백 구분) :  70 100 100 
3번째 학생의 학번 이름 입력(공백 구분) :  20220003 아자차
국어 영어 수학 점수 입력(공백 구분) :  78 98 85


20220001 가나다  90 100  80	270  90
		  수  수  우
20220002 마바사  70 100 100	270  90
		  미  수  수
20220003 아자차  78  98  85	261  87
		  미  수  우
*/
