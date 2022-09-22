//자바의 주요(중요) 클래스

//Wrapper 클래스

package High;

public class day23_1 {
	
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;  //오토 박싱(AutoBoxing) : 기본형 -> 객체형

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;    //오토 언박싱(AutoUnboxing) : 객체형 -> 기본형

		float f = 300.3f;
		Float wrapF = new Float(f); 

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		//실행결과
		/*
		true
		300
		300.3
		 */
		//--toString() 메서드는 객체의 문자열 표현을 반환한다.

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		//실행결과
		/*
		true
		300
		300.3
		 */


		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--> ni :  12
		
		ni = Integer.parseInt("0101", 2);   //-- 매개변수가 2개임  -> 메소드 오버로딩
		System.out.printf("ni : %3d\n", ni);
		//--> ni :   5

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--> ni :  10
		//-- 1x2 = 2, 1x8 = 8 => 합은 10

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--> ni :  10

		sn = Integer.toBinaryString(20);   //-- 'to' 변환을 의미하는 메소드
		System.out.printf("sn : %s\n", sn);
		//--> sn : 10100
		//-- 2진수의 문자열로 

		sn = Integer.toOctalString(31);    //-- 8진수
		System.out.printf("sn : %s\n", sn);
		//--> sn : 37

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--> sn : 1f

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--> 345



	}

}
