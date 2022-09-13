//정보 은닉과 접근 제어 지시자(=접근지정자, 접근제한자)

package Medium;


import java.util.Scanner;

class CircleTest2
{

	// 멤버 변수, 인스턴스 변수, 전역 변수인 'num'
	// int num;
	
	//    ↓
	
	// 정보 은닉(Information Hiding)
	// 'private' 이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미

	// int 형 전역 변수 -> 자동 0으로 초기화 지원
	// 그런데 그것도 못하게 만들어버리는 '프라이빗'
	private int num;
	
	//============================
	// getter / setter 구성  
	// -->> 값을 채우고 메꿀수 있는 메소드
	/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
	*/
	//============================
	
	//입력 메소드
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	
	}

	//넓이 계산 메소드
	double calArea()
	{
		return num * num * 3.141592;
	}

	//출력 메소드
	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이 : " + area);
		
	}

	
}


public class day15 {
	
	public static void main(String[] args)
	{
		CircleTest2 ob = new CircleTest2();

		//===================================================
		//ob.num = 10;    -->> 프라이빗하므로 아예 접근 불가!!
		//    ↓
		//ob.setNum(10);  -->> 그러므로 이와 같이 변경해준다!

		//System.out.println("원의 반지름 : " + ob.num);
		//    ↓
		//System.out.println("원의 반지름 : " + ob.getNum());
		//===================================================
		
		ob.input();

		double result = ob.calArea();
		ob.write(result);

	}

}

//결과
/*
반지름 입력 : 6
반지름 : 6
넓이 : 113.097312
*/
