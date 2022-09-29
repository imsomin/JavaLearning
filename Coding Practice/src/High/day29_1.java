//컬렉션 프레임워크(Collection Framework)

//   List  ->  Vector, ArrayList, ...
// - 순서 있음
// - 배열과 유사
// - 중복 허용

//Vector를 쓸 일이 있으면 ArrayList를 쓸 것!
//-------          ----------
//자료구조이해                     자료구조활용
//동기화                                       비동기
//동시성 기능 포함        
//성능이 떨어짐

/*
○ ArrayList 클래스

  - ArrayList 와 Vector 클래스는
    List 를 크기 변경이 가능한 배열로 구현한 것으로
	차이점은 Vector 클래스의 객체는 기본적으로 동기화 되지만,
	ArrayList 는 그렇지 않다는 점이다.

  - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
         스레드들이 컬렉션을 공유하지 않는 프로그램에서는
	일반적으로 ArrayList 를 Vector 보다 더 선호하며,
	ArrayList 는 동기화를 고려하지 않은 Vector 처럼 동작함으로써
	Vector 보다 더 빠르게 실행된다.

  - null 을 포함한 모든 요소를 허용하며
    List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

*/




package High;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class day29_1 {
	
	public static void main(String[] args)
	{

		//ArrayList 자료구조 인스턴스 생성
		//ArrayList<String> list = new ArrayList<String>();   //--이렇게 생성 가능
		//Vector<String> list = new Vector<String>();
		
		//List<String> list = new Vector<String>();
		//List<String> list = new ArrayList<String>();
		//--리스트 자료구조인데, 자료구조를 구현해 낸 것이 vector, ArrayList이다

		List<String> list1 = new ArrayList<String>();

		//list1 자료구조에 요소 추가 -> add()
		list1.add("바나나");
		list1.add("딸기");
		list1.add("메론");

		//ArrayList 인스턴스 생성
		List<String> list2 = new ArrayList<String>(list1);

		//list2 에 요소 추가
		list2.add("포도");

		//ArrayList 인스턴스 생성
		List<String> list3 = new ArrayList<String>();


		//list 3 에 list 의 전체 요소 추가 -> addAll()
		list3.addAll(list2);


		//"딸기" 앞에 "수박" 추가
		// (1) "딸기" 찾기 -> indexOf() -> 위치값 인덱스 반환
		int n = list3.indexOf("딸기");

		//테스트
		//System.out.println(n);
		//-->>1

		// (2) "딸기" 찾은 인덱스 위치에 "수박" 삽입 -> add()
		list3.add(n, "수박");


		// 출력 -> 더미 데이터 확인
		System.out.println("============================================");
		System.out.println(list1);
		//-->>[바나나, 딸기, 메론]
		System.out.println(list2);
		//-->>[바나나, 딸기, 메론, 포도]
		System.out.println(list3);
		//-->>[바나나, 수박, 딸기, 메론, 포도]

		
		System.out.println("===========================================");
		System.out.println();
		
		
		
		//출력 -> listIterator() 메소드를 활용하여 출력
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//-->>바나나 수박 딸기 메론 포도 

		
		
		System.out.println("===========================================");
		

		// 출력 -> 역순으로 접근
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//-->>포도 메론 딸기 수박 바나나 
		

	}

}
