//컬렉션 프레임워크(Collection Framework)

//Vector v = new Vector();
//-- 비어있는 Vector 자료구조 v 생성

//Vector v = new Vector(8);
//-- 8개의 초기 elements 를 가진 Vector 자료구조 v 생성
//   8개가 모두 채워지게되면(모자라게 되면) 자동으로 확장된다.

//Vector v = new Vector(3, 5);
//-- 3개의 초기 elements 를 가진 Vector 자료구조 v 생성
//   8개가 모두 채워지게되면(모자라게 되면) 자동으로 5개 증가(확장)된다.

//벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등을
//담아내는 것이 가능하다(현재시점으로 가능해졌다)
//-> 데이터 안정성 확보 ★



package High;

import java.util.Vector;
import java.util.Iterator;

//MyVector 클래스 설계 -> Vector 클래스 상속
class MyVector extends Vector<Object>
{
	//생성자
	MyVector()
	{
		//생성자 안에 클래스 이름을 쓰지 못한다.
		//Vector();
		//Vector(슈퍼 클래스) 생성자 호출
		super(1, 1);
		//-- 첫 번째 인자 : 주어진 용량
		//   두 번째 인자 : 증가량
		
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)  //--Record 클래스
	{
		addElement(rec);
	}

	void write()
	{	
		/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		//실행결과
		/*
		5
		3.14
		안녕하세요
		[C@7852e922
		*/

		//================================
		//+TIP
		//제너릭, 오브젝트로 처리할때
		//주로 문제가 발생하는 것이 '배열'이다
		//나중의 임의의 속성값 꺼내 쓰는 것도 이에 해당함
		//================================
		
		

		/*
		Object o;
		int length = size();

		System.out.println("벡터 요소 객수 : " + length);

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);
			System.out.println(o);
		}
		*/
		//실행결과
		/*
		벡터 요소 객수 : 4
		5
		3.14
		안녕하세요
		[C@7852e922
		*/

		
		Object o;
		int length = size();

		System.out.println("벡터 요소 객수 : " + length);

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);

			// 'instanceof' 연산자      
			//처리해야 하는 대상의 객체 타입 확인!

			if (o instanceof char[])
			{
				//System.out.println("문자배열 : " + o);
				//System.out.println("문자배열 : " + o.toString);
				System.out.println("문자배열 : " + String.copyValueOf((char[])o));

			}

			if (o instanceof String)    //string을 기반으로 한 o
			{
				System.out.println("문자열 : " + o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("정수형 : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else
			{
				System.out.println("타입 확인 불가");
			}
			
			//담을 수 있는 데이터가 많다는 것은
			//그만큼 안정성이 떨어질 수 있다는 것을 의미한다.

			//실행결과
			/*
			벡터 요소 객수 : 4
			정수형 : 5
			실수형 : 3.14
			문자열 : 안녕하세요
			문자배열 : study
			타입 확인 불가
			*/


		}
		
	}

}


public class day28_1 {
	
	public static void main(String[] args)
	{

		//MyVector 클래스 기반 인스턴스 생성
		MyVector v = new MyVector();

		//주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		//다양한 형태의 데이터를 벡터에다가 추가한다
		v.addInt(digit);            //--벡터 자료구조에 정수 저장
		v.addFloat(real);			//--벡터 자료구조에 실수 저장
		v.addString(s);				//--벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//--벡터 자료구조에 문자 배열 저장

		v.write();


	}

}
