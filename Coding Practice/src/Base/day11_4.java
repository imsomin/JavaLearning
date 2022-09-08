//생성자와 초기화 블럭(Initialized Block)

package Base;

public class day11_4 {
	
	//클래스 내부에 선언과 동시에 연산 처리는 가능하다. 
	/*
	int n = 100;
	int m = 200;
	*/
	
	//그러나 따로 따로는 처리 불가능
	/*
	int n;
	int m;
	
	n=100;
	m=200;
	*/
	

	int n;
	int m;
	{   //-->> 초기화 블럭({~})
		n = 20;
		m = 40;
		System.out.println("초기화 블럭 실행");
	}

	//생성자(Constructor)
	day11_4()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행");
	}

	//초기화 vs 생성자
	//생성자는 매우 중요한 역할
	//생성자는 모두 덮어씌움 
	//초기화 블럭이 코드를 먼저 수행했더라도
	//생성자가 해당 멤버들의 최종적인 초기화 값 결정


	day11_4(int n, int m)
	{
		this.n= n;
		this.m= m;
		System.out.println("매개변수 있는 생성자 실행");
	}

	void write()
	{
		System.out.println("n:" + n + ", m:" + m);
	}

	public static void main(String[] args)
	{
		
		day11_4 ob1 = new day11_4();
		ob1.write();
		//실행 결과
		//n:100, m:200

		System.out.println("======================");
		
		day11_4 ob2 = new day11_4(1234, 5678);
		ob2.write();
		//실행결과
		//n:1234, m:5678
		//위의 this를 주석처리 할 경우
		//n:20, m:40 가 출력된다.
		
		//아래 결과 출력문을 보면 ob1과 ob2 두 객체가 생성될 때
		//둘다 생성자보다 초기화 블럭이 먼저 실행됨을 확인할 수 있다.
		
		//초기화 블럭이 실행 되었더라도 생성자에서 값을 바꾸게 되면
		//값은 생성자의 것을 따르게 된다.
		
	}

}

//결과
/*
초기화 블럭 실행
생성자 실행
n:100, m:200
======================
초기화 블럭 실행
매개변수 있는 생성자 실행
n:1234, m:5678
*/
