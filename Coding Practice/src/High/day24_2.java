//StringBuffer 클래스

/*
-StringBuffer 클래스는 
  문자열을 처리하는 클래스로 String 클래스와의 차이점은 
 String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
 StringBuffer 클래스는 문자열을 사용할 때
  내부 문자열을 실행 단계에서 변경할 수 있다.

-즉, StringBuffer 객체는 가변적인 길이를 가지므로
  객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
  실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

-또한 JDK 1.5 이후부터는
  문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
 StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
  가장 큰 차이점은 multi-thread unsafe 라는 점이다.
  즉, Synchronization 이 없기 때문에(동기화를 지원하지 않기때문에)
  문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우에는
 StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.
*/


package High;

public class day24_2 {
	
	public static void main(String[] args)
	{
		
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		//--> false
		//--> false
		//--문자열의 값을 비교하는 equals
		//  오버라이딩을 안했다

		System.out.println(sb1);
		//--> korea

		System.out.println(sb1.toString());
		//--> korea
		//--문자열을 반환
		

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--> true
		//--같은 문자열이더라도 처리가 잘 안될 수도 있으니 잘 구분하는 것이 필요


		StringBuffer sb3 = new StringBuffer();
		//--StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		//  기본적으로 생성되는 버퍼의 크기는 '16'

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--> 버퍼 크기 : 16

		System.out.println(sb3);
		//--> 아무것도 안 나옴

		
		String name = "홍길동";
		name += "이순신";
		name += "강감찬";
		System.out.println(name);
		//--> 홍길동이순신강감찬

		sb3.append("seoul");      //sb3 += "seoul";
		sb3.append("korea");      //sb3 += "korea";
		sb3.append("우리나라");      //sb3 += "우리나라";
		sb3.append("대한민국");      //sb3 += "대한민국";

		System.out.println(sb3);
		//--> seoulkorea우리나라대한민국

		System.out.println(sb3.toString());
		//--> seoulkorea우리나라대한민국

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--> 버퍼 크기 : 34

	
		System.out.println("--------------------------------------------------");
		

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//StringBuffer에는 upper케이스와 lower케이스 없음

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--> SEOULKOREA우리나라대한민국

		System.out.println(sb3.toString().toUpperCase());
		//--> SEOULKOREA우리나라대한민국

		
		
        System.out.println("--------------------------------------------------");

		// 문제 상황 [1]
		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//    '사랑하는' 이라는 문자열 추가
		// -> 사랑하는seoulkorea우리나라대한민국
		sb3.insert(0, "사랑하는");
		System.out.println("seoul 앞에 '사랑하는' 추가 : " + sb3.toString());
		//--> seoul 앞에 '사랑하는' 추가 : 사랑하는seoulkorea우리나라대한민국

		
		//=========================================
		// 테스트(1) 
		// 대상 문자열(sb3) 중 korea 문자열 뒤에
		// "멋진" 이라는 문자열 추가
		// 단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 않고!!

		// 테스트(1) - 0단계
		//System.out.println(sb3.toString());
		//--> 사랑하는seoulkorea우리나라대한민국
		
		// 테스트(1) - 1단계  (인덱스를 확인한 경우)
		//sb3.insert(14, "멋진");
		//System.out.println("korea 뒤에 '멋진' 추가 : " + sb3.toString());
		//--> korea 뒤에 '멋진' 추가 : 사랑하는seoulkorea멋진우리나라대한민국
		
		// 테스트(1) - 2단계  (인덱스를 확인하지 않은 경우)
		//sb3.indexOf("korea");
		//System.out.println(sb3.indexOf("korea"));
		//--> 9

		// 테스트(1) - 3단계
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "멋진"));
		//--> 사랑하는seoul멋진korea우리나라대한민국
		//☆insert를 포함하고 있으므로 테스트(1) - 4를 시행하기 전에 주석 처리한다.

		
		// 테스트(1) - 4단계
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "멋진"));
		//--> 사랑하는seoulkorea멋진우리나라대한민국
		//☆insert를 포함하고 있으므로 테스트(1) - 5를 시행하기 전에 주석 처리한다.

		
		// 테스트(1) - 5
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "멋진"));
		//--> 사랑하는seoulkorea멋진우리나라대한민국
		//=========================================


		System.out.println("--------------------------------------------------");

		
		// 문제 상황 [2]
		// ○ 대상 문자열(sb3)에서
		//    '우리나라' 문자열 삭제
		
		//=========================================
		// 테스트(2) - 0단계
		//System.out.println(sb3);
		//--> 사랑하는seoulkorea우리나라대한민국
		
		// 테스트(2) - 1단계
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--> 사랑하는seoulkorea대한민국

		// 테스트(2) - 2단계
		sb3.delete(sb3.indexOf("우리나라"),sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		//--> 사랑하는seoulkorea대한민국
		//=========================================
		

		System.out.println("--------------------------------------------------");
		
	
		// 문제 상황 [3]
		// ○ 대상 문자열 sb3에서
		//    korea 이후의 문자열을 삭제한다(korea 포함)
		//'사랑하는seoulkorea우리나라대한민국' 에서 'korea우리나라대한민국' 삭제
		
		//=========================================
		// 테스트(3) - 0단계
		//sb3.delete(9, 22);
		//System.out.println(sb3);
		//--> 사랑하는seoul
		
		// 테스트(3) - 1단계
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--> 사랑하는seoul
		//=========================================

		
		System.out.println("--------------------------------------------------");
		
		
		//버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--> 버퍼 크기 : 34


		//문자열(sb3)의 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--> 문자열의 길이 : 9


		//버퍼 크기 조절
		//--현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		sb3.trimToSize();


		//버퍼 크기 조절 이후 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--> 버퍼 크기 : 9
		
	}

}
