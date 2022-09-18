//상속 관계에 있는 클래스들 간의 캐스팅
//업 캐스팅, 다운 캐스팅

/*
class 하위 extends 상위
{
}
*/


package Medium;

//super class, 부모 클래스, 상위 클래스
class SuperTest191
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드");
	}

	public int hap()
	{
		return a + b;
	}
}


//sub class, 자식 클래스, 하위 클래스
class SubTest191 extends SuperTest191
{
	public int b=100, c=200;

	@Override
	public int hap()
	{
		return a + b + c;
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드");
	}
}

//main() 메소드를 포함하는 외부의 다른 클래스
public class day19_1 {
	
	public static void main(String[] args)
	{
		// sub class 기반 인스턴스 생성
		SubTest191 ob1 = new SubTest191();
		//이로 인해 부모클래스도 자식클래스도 메모리에 퍼올려진다!

		System.out.println("ob1.b : " + ob1.b);
		//-->>ob1.b : 100
		//부모가 가지고 있는 b는 20이지만
		//자식 클래스를 기반으로 인스턴스를 생성했으므로
		//자식이 가지고 있는 b인 100이 출력된다.


		//○업 캐스팅
		//SuperTest191 ob2;
		//-->> 가능함

		SuperTest191 ob2 = ob1;
		//--(SuperTest191)ob1  :  슈퍼부름, 형변환
		//SuperTest191 ob2  =  (SuperTest191)ob1;
		//--위의 두 개는 동일한 코드
		//  즉, '인간 행인 = 민지;' 와   '인간 행인  = (인간)민지;'는 동일한 코드!


		System.out.println("ob2.b : " + ob2.b);
		//-->>ob2.b : 20
		//변수는 객체별로 따로 할당되므로
		//변수 b는 ob2의 변수이다.

		System.out.println("합    : " + ob2.hap());
		//-->>합    : 310
		//hap() 메소드는 오버라이딩(Overriding)되어 있고
		//ob2는 ob1을 업캐스팅한 상태의 객체이므로
		//SuperTest191의 hap() 메소드를 호출하는 것이 아니라
		//SubTest191에서 재정의한 hap() 메소드를 호출하게 된다.
		//즉, 메소드는 업캐스팅이 되더라도
		//재정의(덮어쓰기)한 이상, 원래의 기능으로 되돌릴 수 없다.

		ob2.write();
		//-->>슈퍼 클래스 write() 메소드
		//부모 클래스의 write의 메소드가 출력된다.

		//ob2.print();
		//컴파일 에러 발생

		//○ 다운 캐스팅
		((SubTest191)ob2).print();
		//-->>서브 클래스 print() 메소드
		//자식타입으로 형변환을 해준다.

		
		SuperTest191 ob3 = new SuperTest191();
		//부모클래스의 인스턴스 생성은
		//자식클래스의 메모리까지 퍼올리지 않는다. ★
		
		SubTest191 ob4;

		//System.out.println(ob3.c);
		//컴파일 에러 발생
		//상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.

		//ob4 = ob3;
		//컴파일 에러 발생
		//상위 객체는 하위 객체에 담을 수(참조할 수) 없다.

		ob4 = (SubTest191)ob3;
		//런타임 에러 발생
		/*
		Exception in thread "main" java.lang.ClassCastException: 
		Medium.SuperTest191 cannot be cast to Medium.SubTest191
	    at Medium.day19_1.main(day19_1.java:115)
		*/
		//--작성된 구문의 문법적인 구조만 봤을 때
		//  다운 캐스팅이 이루어지는 상황이다.
		//  하지만, 정상적인 캐스팅이 이루어지지 않는다.  ★
		//  현재 SubTest191 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		//  다운 캐스팅은 불가능한 것이다.

	}
	
}

/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 
★ 하위 객체 생성;  후...	
- 상위 = 하위;		    //-- 업 캐스팅. 정상.
- 하위 = (하위)상위;    //-- 다운 캐스팅. 정상.  (-> 형변환)


○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우
★ 상위 객체 생성; 후...
- 하위 = 상위;          //-- 컴파일 에러 발생.
- 하위 = (하위)상위;     //-- 다운 캐스팅. 런타임 에러 발생.

※ 업 캐스팅은 항상 가능. 다운 캐스팅은 경우에 따라 가능.
*/
