// 직사각형 클래스 설계 실습

/*
직사각형의 넓이와 둘레 계산 -> 클래스 표현

클래스의 정체성 -> 직사각형
클래스의 속성    -> 가로, 세로, (넓이, 둘레, 부피, 무게, 재질, 색깔,..)
클래스의 기능    -> 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력,....

객체를 구성      -> 데이터(속성, 상태) + 기능(동작, 행위)
		               ▽	                       ▽
클래스를 설계   ->   변수             +     메소드
*/



package Base;


import java.util.Scanner;

class Rect      // 직사각형 클래스 설계
{

	//Scanner sc = new Scanner(System.in);  //-->>문법적으로는 가능하나
	                                        //굳이 필요로 하지 않는 부분에서 메모리 차지할 필요 없음


	//데이터(속성, 상태)  
	//가로 세로 변수 선언 
	int w, h;       

	
	//기능(동작, 행위)
	//메소드(1)
	//가로세로 입력 메소드  
	void input()                     
	{
		//현재 input메소드는 넘겨 받은 게 아무것도 없다...
		//왜냐하면 사용자에게 직접 물어봤기 때문이다.
		//현재 여기에는 매개변수가 없는 것이다!
		
		//input 앞에는 반환자료형
		//즉, input 호출시 그 데이터를 놓고 오는 데이터의 유형
		//생성자가 아닌 이상, void를 써줘야 한다.
		//만약, int를 쓰게 된다면 return을 써준다.

		//가장 위의 sc는 공통적이나 밑의 각각의 sc는 서로를 볼 수 없다
		Scanner sc = new Scanner(System.in);   //-->>변수선언 위치 파악(필요할 때에만 입력하자)
		
		System.out.print("가로 입력 : ");
		//w = sc.next();                        //>>next()는 문자열 형태로 받아옴
		w = sc.nextInt();                       //>>스캐너는 바로 숫자 형태로 받아올 수 있음
												//>>뒤에 Int만 추가로 쓰자!(br 필요없음)
		
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	
	}

	
	//메소드(2)
	// 둘레 계산()  -> (가로+세로)*2
	int calLength()                
	{

		int result;

		result = (w+h)*2;

		return result;

		//int(w,h)형의 결과값을 담아낼 변수값이 있느냐?
		//->없다
		//그래서 result 변수 생성...
		//이런 경우 return을 써서 돌려줘야 한다.

		//★★★calLength(int w, int h)가 아닌 이유!
		//지금 경우는 int w와 int h가 보인다.
		//그래서 매개변수 넘겨줄 것 없다...

		//return (w+h) * 2;
		//위의 세줄을 다음과 같이 표현도 가능
		
	}

	
	//메소드(3)
	// 넓이 계산()  -> 가로*세로 
	int calArea()                  
	{
		int result;

		result = w*h;

		return result;
	}
	

	//메소드(4)
	// 결과 출력()
	void print(int a, int l)                   
	{
		// 가로 : 10
		// 세로 : 20
		// 넓이 : xxx
		// 둘레 : xxx

		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);  
		
		return;

		//호출된 곳에 놓고 오는 것이 없으니까 void가 쓰임
		//그냥 출력만 할 뿐이지 문자열을 놓고 오는 것이 아님
	}

}


//=======================================================
//   하나의 자바 파일(.java)에 여러 개의 클래스(class)를 설계할 수 있다.
//   하지만, 'public class'는 하나만 올 수 있다.
//   파일을 저장할 때의 이름은
//   이 'public class'의 이름으로 지정해야 한다.
//   일반적으로 하나의 파일에 하나의 클래스를 설계한다.
//   또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
//   내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.
//=======================================================



public class day10_2 {
	
	public static void main(String[] args) 
	{
		// Rect 클래스 기반의 인스턴스 생성
		//new Rect();          //-->>이 경우, 메모리 퍼올림
		Rect ob = new Rect();  //-->>메모리 퍼올리는 것 뿐만 아니라 쓰기까지 할 것임


		//입력 메소드 호출
		ob.input();    //가로와 세로 입력받는 역할

		//넓이 연산 메소드 호출                         //->>메소드의 순서는 상관없다. 
		int area = ob.calArea();  //보이지만 않을 뿐이지 area에 결과 담겨짐

		//둘레 연산 메소드 호출
		int length = ob.calLength();

		//출력 메소드 호출
		ob.print(area, length);




	}

}

//결과
/*
가로 입력 : 7
세로 입력 : 9
가로 : 7
세로 : 9
넓이 : 63
둘레 : 32
*/