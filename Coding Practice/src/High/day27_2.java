//컬렉션 프레임워크(Collection Framework)

//큐(Queue)

/*
큐(Queue)는 선입선출의 FIFO(First Input First Output) 구조로
먼저 입력된 자료를 먼저 출력하며
큐 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

큐 인터페이스 인스턴스를 생성하기 위해서는
new 연산자를 이용하여 큐 인터페이스를 구현한 (implements)
클래스의 생성자를 호출한다.

ex) Queue ob = new LinkedList();

○ 주요 메소드

- E element()
  큐의 head 요소를 반환하며 삭제하지 않는다.

- boolean offer(E o)
  지정된 요소를 큐에 삽입한다.

- E peek()
  큐의 head 요소를 반환하고 삭제하지 않으며
  큐 자료구조가 empty 인 경우 null 을 반환한다.

- E poll()
  큐의 head 요소를 반환하고 삭제하며
  큐 자료구조가 empty 인 경우 null 을 반환한다.

- E remove()
  큐의 head 요소를 반환하고 삭제한다.


class 컬렉션클래스<E?>
{
	<E?>하나의 요소 꺼내기()
	{
	}
}
*/


package High;

import java.util.Queue;
import java.util.LinkedList;


public class day27_2 {
	
	public static void main(String[] args)
	{
		//Queue 자료구조 생성
		//Queue muQue = new Queue();  -->> 불가
		Queue<Object> myQue = new LinkedList<Object>();

		//적재할 데이터 준비
		String str1 = "가나다";
		String str2 = "마바사";
		String str3 = "아자차";
		String str4 = "타파하";

		//myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		//테스트(확인)
		System.out.println(myQue);
		//[가나다, 마바사, 아자차, 타파하]
		//--데이터 입력확인이나 순서확인을 위한 더미 데이터
		
		System.out.println(test);
		//true

		//Queue 자료구조에서 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		//실행결과
		/*
		값1 : 가나다
		값2 : 가나다
		*/

		System.out.println();

		String val;


		//(1)
		
		//peek()
		//--큐의 head 요소 반환, 제거 안함. 데이터 확인만 함
		//  큐가 empty 일 경우 null 을 반환.
		
		while (myQue.peek() != null)
		{
			//poll()
			//--큐의 head 요소 반환, 제거함. 데이터 삭제 처리
			//  큐가 empty 일 경우 null 을 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		
		//실행결과
		/*
		요소 : 가나다
		요소 : 마바사
		요소 : 아자차
		요소 : 타파하
		*/
		
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		//실행결과
		/*
		요소 : 마바사
		요소 : 타파하
		*/


		/*
		while (myQue.peek() != null)
		{
			val = (String)myQue.peek();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		//실행결과
		//-->> 요소 : 가나다  ...가 끊임없이 출력됨


		//(2)
		
		while (true)
		{
			val = (String)myQue.poll();

			if(val==null)
				break;
			else
				System.out.println("요소 : " + val);
		}
		
		//실행결과
		/*
		요소 : 가나다
		요소 : 마바사
		요소 : 아자차
		요소 : 타파하
		*/

		//(3)
		
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//실행결과
		/*
		요소 : 가나다
		요소 : 마바사
		요소 : 아자차
		요소 : 타파하
		*/		



	}

}


