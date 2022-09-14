//메소드의 중복정의(Method Overloading)

//메소드 오버로딩의 개요
/*
-오버라이딩과 헷갈림 주의!
-자바의 한 클래스 내에 이미 사용하려는 이름과 
같은 이름을 가진 메소드가 있더라도
메소드 괄호 속에 오는 인수(인자, 매개변수, 파라미터)의 갯수가 다르거나, 
자료형(Data Type)이 다른 경우
메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록 
문법적으로 허용하게 되는데
이를 메소드 오버로딩이라고 한다.
-주의할 점은 리턴 값만 다른 것은 오버로딩 할 수 없음이다.
*/

package Medium;

public class day16 {
	
	public static void main(String[] args)
	{
		OverloadingMethods om = new OverloadingMethods();
		
		om.print(); 

		System.out.println(om.print(8)); 
		
		om.print("Hello");
		
		System.out.println(om.print(4,5));

	}

}

class OverloadingMethods{
	
	public void print() {
		System.out.println("오버로딩1");  //--오버로딩1
	}
	
	String print(Integer a) {
		System.out.println("오버로딩2");  //--오버로딩2
		return a.toString();           //--8
	}
	
	void print(String a) {
		System.out.println("오버로딩3");  //--오버로딩3
		System.out.println(a);         //--Hello
	}
	
	String print(Integer a, Integer b) {
		System.out.println("오버로딩4");       //--오버로딩4
		return a.toString() + b.toString(); //--45
	}
		
	
}
