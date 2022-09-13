//static 변수(클래스변수)와 static 메소드(클래스메소드)

//(접근제어 지시자 생략된 실습)

//탄생시점과 공유 ★
//--클래스 변수 또는 클래스 메소드는 클래스가 생성되는 시점에 메모리를 할당받는다.
//--생성된 인스턴스를 통해서 접근해야 한다.

// <non -  static>  
//인스턴스 변수, 인스턴스 메소드 
//동적변수, 동적메소드

//     vs

// <static>
//클래스변수, 클래스메소드
//정적변수, 정적메소드

package Medium;

class Intro {
	
	// 클래스 변수 또는 클래스 메소드는
    // 클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며,
	// 클래스 이름 또는 객체(인스턴스)를 통해 접근할 수 있다.
	// 즉, 'new' 연산자를 통해 메모리를 할당받지 않아도
	// 사용이 가능하다는 것이다.

	public static String classVar = "클래스 변수 값";   //--static변수 (클래스변수, class변수, 정적변수)

	public String instanceVar = "인스턴스 변수 값";          //--non-static변수 (인스턴스변수, instance변수, 동적변수)
	
	// 인스턴스 변수 또는 인스턴스 메소드는
	// 동일한 클래스의 메소드에서는 바로 접근하는 것이 가능하지만
	// 클래스 메소드에서는 접근할 수 없다.
	
	public static void classMethod()  //--static메소드 (클래스메소드, class메소드, 정적메소드)
	{
		System.out.println(classVar); //클래스 변수 값
		//System.out.println(instanceVar); //--static 선언이 안되어, 즉 탄생시점이 나중이라서 컴파일 에러 발생
		                                   //-- 클래스 메소드에서는 사용이 불가함
	}
	
	public void instanceMethod()      //--non-static메소드 (인스턴스메소드, instance메소드, 동적메소드)
	{
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
	
		
}//end class Intro

public class day15_2{
	
	public static void main(String[] args) {
		
		System.out.println(Intro.classVar); 
		//-->클래스 변수 값
		
		//System.out.println(Intro.instanceVar);  //--static 선언이 안되어 직접 사용 불가
		
		Intro.classMethod(); 
		//-->클래스 변수 값
		
		//Intro.instanceMethod();   //--static 선언이 안되어 직접 사용 불가
		 
		//-----------------------------------------------------------------------
		
		//Intro 클래스 기반 인스턴스 형성
		Intro I1 = new Intro();
		Intro I2 = new Intro();
		
		System.out.println(I1.classVar); 
		//-->클래스 변수 값
		//(static 선언 변수는 주소값을 가진다)
		System.out.println(I1.instanceVar);
		//-->인스턴스 변수 값
		//(static이 없는 변수는 값을 복사해서 가진다)
		
		I1.classVar = "I1을 통하여 클래스 변수를 변경하였다";
		System.out.println(Intro.classVar); 
		//-->I1을 통하여 클래스 변수를 변경하였다
		System.out.println(I2.classVar); 
		//-->I1을 통하여 클래스 변수를 변경하였다
		
		I1.instanceVar = "I1을 통하여 인스턴스 변수를 변경하였다";
		System.out.println(I1.instanceVar); 
		//-->I1을 통하여 인스턴스 변수를 변경하였다
		System.out.println(I2.instanceVar); 
		//-->인스턴스 변수 값
		//(변경되지 않음 확인!!)
		
		I1.instanceMethod();
		/*
		I1을 통하여 클래스 변수를 변경하였다
		I1을 통하여 인스턴스 변수를 변경하였다
		*/
		
		I2.instanceMethod();
		/*
		I1을 통하여 클래스 변수를 변경하였다
		인스턴스 변수 값
		*/
		
		//-->> Intro 클래스를 통하여 직접 사용할 수 있는 것은 class 변수와 class 메소드이다.
		//-->> I1과 I2는 인스턴스로, 각각 고유의 장소에 저장값을 담는다. 그러므로 서로에게 영향을 끼치지 않는다.
	}
	
	
	
	
}