//※ day10_4과 세트

//원의 넓이와 둘레 구하기
//원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.

package Base;

import java.io.IOException;

public class day10_3 {
	
	public static void main(String[] args) throws IOException
	{

		//day10_4 클래스 기반 인스턴스 생성
		//day10_4 객체 생성
		day10_4 ob = new day10_4();   
		
		//import를 안 해도 된다.
		//같은 패키지 안에 있기 때문에 생성 안해도 된다.

		ob.input();  //->반지름 입력받는 공간

		double a = ob.calArea();

		double length = ob.calLength();

		ob.print(a, length);



	}

}

//결과
/*
반지름 입력 : 4
>>반지름이 4 인 원의
>>넓이 : 50.27
>>둘레 : 25.13
*/