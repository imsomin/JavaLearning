//컬렉션 프레임워크(Collection Framework)

//벡터 자료구조 객체 선언 및 생성 시
//사용자 정의 클래스 활용
//-> 자료형


package High;


import java.util.Vector;



//사용자 정의 클래스 설계 -> 자료형처럼 활용
class MyData
{
	//주요 속성 구성 -> 주요 변수 선언(멤버 변수)
	private String name;    //--이름
	private int age;        //--나이

	//getXxx() -> getter
	//steXxx() -> setter
	//getter 는 main 함수에서 인스턴스 필드에 접근해서 사용하는 함수
	//setter 는 main 함수에서 인스턴스 필드에 접근해서 사용하는 함수

	//getter / setter 구성
	//접근제어지시 public
	//메소드 getName()
	public String getName()
	{
		return name;
	}

	//외부에서 (매개변수)값을 받아온다
	public void setName(String name) 
	{ 
		this.name = name;
		
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}


	//생성자(매개변수 2개인 생성자) -> 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//※ 사용자 정의 생성자가 구성될 경우
	//   default 생성자가 자동으로 삽입되지 않기 때문에
	//   default 생성자 형태의 생성자를 사용자 정의 생성자로
	//	 추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//	 (단, 반드시 설계해야 할 필요는 없음)

	// 생성자(매개변수 없는 생성자) -> 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}

public class day28_4 {
	
	public static void main(String[] args)
	{
		//벡터 자료구조 생성
		//Vector v = new Vector();
		//제너릭 표현식
		Vector<MyData> v = new Vector<MyData>();
		//--벡터 자료구조를 생성하는데
		//  이 안에는 MyData만 담을것임을 나타냄

		//벡터 자료구조 v 에
		//가나다 13세 / 마바사 7세 / 아자차 78세
		//담아내기


		//방법(1)
		//MyData 타입으로 인스턴스를 생성하고,
		//이렇게 생성된 객체에 이름 넣고,
		//이렇게 생성된 객체에 나이 넣기,
		//그리고 그것을 벡터에 넣기
		/*
		MyData st1 = new MyData();
		st1.setName("가나다");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("마바사");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("아자차");
		st3.setAge(78);
		v.add(st3);
		*/

		
		
		//방법(2)
		//사용자 정의 생성자를 활용하는 방법
		/*
		MyData st1 = new MyData("가나다", 13);
		v.add(st1);
		MyData st2 = new MyData("마바사", 7);
		v.add(st2);
		MyData st3 = new MyData("아자차", 78);
		v.add(st3);
		*/
		

		//방법(3)
		//직접 바로 vector에 add 시키는 방법
		v.add(new MyData("가나다",13));
		v.add(new MyData("마바사",7));
		v.add(new MyData("아자차",78));
		
		
		//------------------------------------------------------------------------

		
		//벡터 자료구조 v 에 담긴 내용(요소) 전체 출력하기
		//실행 예)
		//이름:가나다, 나이:13
		//이름:마바사, 나이:7
		//이름:아자차, 나이:78

		//벡터 전체 요소 출력	
		System.out.print("전체 요소 출력: ");
		for (MyData str : v )
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//실행결과
		//-->> 전체 요소 출력: High.MyData@7852e922 High.MyData@4e25154f High.MyData@70dea4e 

		
		//방법(1)
		/*
		for (MyData m : v)  //MyData '타입'의 '오브젝트' m 이다
		{
			System.out.printf("이름:%s, 나이:%d\n", m.getName(), m.getAge());
		}
		System.out.println();
		*/
		//예전 Record 클래스를 배열에 인스턴스 넣어서 했던 것처럼
		//벡터 하나의 요소마다 각각의 MyData 인스턴스가 들어가 있다고 여기면 될 것~!
		//실행결과
		/*
		이름:가나다, 나이:13
		이름:마바사, 나이:7
		이름:아자차, 나이:78
		 */

		
		//방법(2)
		/*
		for (int i=0; i<v.size(); i++)  //얻어낸 size()메소드 결과만큼 반복하겠다
		{
			System.out.printf("이름:%s, 나이:%d세\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
			//v              => Vector 타입
			//v.elementAt(i) => MyData 타입
		}
		System.out.println();
		*/
 		//실행결과
		/*
		이름:가나다, 나이:13
		이름:마바사, 나이:7
		이름:아자차, 나이:78
		 */

		//방법(3)
		for (Object temp : v)    //이런 저런 형태를 담아냈을 때에는 MyData처럼 특정한 객체 타입이 아니라 오브젝트로 꺼내야 할 때가 있다.
		{
			System.out.printf("이름:%s, 나이:%d세\n", ((MyData)temp).getName(), ((MyData)temp).getAge()); //MyData 타입으로 다운 캐스팅을 하는 것
		}
		System.out.println();
 		//실행결과
		/*
		이름:가나다, 나이:13
		이름:마바사, 나이:7
		이름:아자차, 나이:78
		 */
		
	}

}
