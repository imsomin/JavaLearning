//자바의 주요 클래스

//Random 클래스

/*
<java.util.Random 클래스>는

여러 형태의 난수를 발생시켜 제공하는 클래스이다.
Math 클래스의 정적 메소드인 random()메소드도
난수를 제공하는 메소드이지만,
0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
필요한 여러 형태의 난수를 만들어내기 위해서는
추가적인 연산을 수행해야 한다.
그래서 자바는 여러 형태의 난수를 발생시켜주는
전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

//실습문제
//로또 번호 생성기(난수 발생 프로그램)

//프로그램이 실행되면 기본적으로 로또를 
//5게임 수행하는 프로그램을 구현한다.

//실행 예)
//3 5 12 24 31 41
//1 2 8  36 41 42
//4 9 11 13 22 30
//5 10 13 15 27 40
//22 31 32 33 40 41


package High;

import java.util.Random;
import java.util.Arrays;


class Lotto
{
	//배열 변수 선언 및 메모리 할당
	private int[] num;

	//생성자
	Lotto()
	{
		num = new int[6];
	}

	//getter
	public int[] getNum()
	{
		return num;
	}



	//6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;

		jump:
		
		while (cnt<6)             // 0  1  2  3  4  5
		{
			n = rd.nextInt(45)+1; // 1 ~ 45 (<-0~44)  // 10을 집어넣을 때

			for (int i=0; i<cnt; i++)
			{
				if (num[i]==n)
				{
					continue jump;
				}
			}

			num[cnt++] = n;       // num[0] num[1] num[2] num[3] num[4] num[5]
			
		}


		//정렬 메소드 호출
		//주석 처리하면 정렬이 안된 상태로 출력
		sorting();
	}


	//정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}


}

public class day25_4 {
	
	public static void main(String[] args)
	{
		//Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();


		//기본 5 게임
		for (int i=1; i<=5; i++)
		{
			
			//로또 게임 수행
			lotto.start();


			//결과 출력
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}

}

//결과
/*
   3  16  18  26  28  43
   5   6  15  27  33  37
  13  19  35  38  39  45
   6  12  26  29  41  43
  17  18  22  33  44  45
*/
