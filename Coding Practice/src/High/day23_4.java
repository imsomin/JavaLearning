//자바의 주요(중요) 클래스

//Wrapper 클래스


package High;

public class day23_4 {
	
	public static void main(String[] args)
	{

		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		//3
		System.out.println(i2);
		//256

		print(b2);
		print(i2);
	

		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();   //--언박싱

		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();     //--언박싱
	
		int i4 = b2.byteValue();    //--자동 형변환 위반하지 않음
	
		//byte b4 = i2.intValue();  //--에러 발생(자동 형 변환 위반)
		byte b4 = i2.byteValue();

		
		System.out.println(b3);
		//3
		System.out.println(i3);
		//256

		System.out.println(b4); 
		//0
		System.out.println(i4);
		//3

	}




	/*
	static void print(Byte b)
	{
	}

	static void print(Integer i)
	{
	}

	static void print(Object obj)
	{
	}
	*/
	
	// java.lang.Number 클래스(추상 클래스)
	// 모든 숫자형 Wrapper 클래스들의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	// Auto-Boxing 이 일어나게 된다.
	static void print(Number n)
	{
		//System.out.println("n = " + n);
		/*
		n = 3
		n = 256
		*/
		
		System.out.println("n = " + n);
		System.out.println("iv = " + n.intValue());
		//실행결과
		/*
		n = 3
		iv = 3
		n = 256
		iv = 256
		*/
	}



}
