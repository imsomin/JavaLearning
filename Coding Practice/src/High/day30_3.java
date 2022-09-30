//컬렉션 프레임워크(Collection Framework)

//Map → Hashtable, HashMap
// - java.util.Map 인터페이스는
//   키(key)를 값(value)에 매핑(mapping)하며,
//   각 키는 한 개의 값만을 매핑해야 한다.
//   즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.

/*
○ HashMap<K, V> 클래스

- Hashtable 클래스와 마찬가지로 Map 인터페이스에서 상속받은
  HashMap 클래스의 기능은 Hashtable 과 동일하지만
  Synchronization 이 없기 때문에 동시성 문제가 없다면
  (즉, 멀티 스레드 프로그램이 아닌 경우라면)
  HashMap 을 사용하는 것이 성능을 향상시킬 수 있다.

- 또한, HashMap 은 Hashtable 클래스와는 달리 null 을 허용한다.

*/



package High;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class day30_3 {
	
	public static void main(String[] args) throws IOException
	{
		//HashMap 자료구조 인스턴스 생성
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();

		// map 이라는 HashMap 자료구조에 요소 추가
		// -> put();
		map.put("드라마", "이태원클라스");
		map.put("영화", "스파이더맨");
		map.put("만화", "슬램덩크");

		// 더미 확인
		System.out.println(map);
		//-->>{드라마=이태원클라스, 영화=스파이더맨, 만화=슬램덩크}

		// null 입력 시도
		map.put(null, null);
		map.put("소설", null);
		map.put(null, "데미안");
		//-- 위의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//   마지막 null 을 key 로 매핑된 '데미안'이
		//   최초 null 을 key 로 매핑하는 null 을 덮어쓰는 상황이 발생하게 된다.
		//   즉, HashMap 은 null 을 하나의 고유한 key 로 간주한다.(인식한다.)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");
		String[] temp;

		for (String str; ((str=br.readLine()) != null); )
		{
			temp = str.split(",");
			if (temp.length < 2)
			{
				System.out.print("카테고리, 타이틀 입력(컴마 구분) : " );
				continue;
			}
		

		map.put(temp[0].trim(), temp[1].trim());
		System.out.println(map);
	
		}
		//실행결과
		/*
		카테고리, 타이틀 입력(컴마 구분) : 드라마, 이태원클라스
		{null=데미안, 소설=null, 드라마=이태원클라스, 영화=스파이더맨, 만화=슬램덩크}

		카테고리, 타이틀 입력(컴마 구분) : 드라마, 작은아씨들
		{null=데미안, 소설=null, 드라마=작은아씨들, 영화=스파이더맨, 만화=슬램덩크}

		카테고리, 타이틀 입력(컴마 구분) : 소설, 데미안
		{null=데미안, 소설=데미안, 드라마=작은아씨들, 영화=스파이더맨, 만화=슬램덩크}
		
		카테고리, 타이틀 입력(컴마 구분) : null, 널값
		{null=데미안, 소설=데미안, null=널값, 드라마=작은아씨들, 영화=스파이더맨, 만화=슬램덩크}

		카테고리, 타이틀 입력(컴마 구분) : 그림, 르누아르
		{null=데미안, 소설=데미안, 그림=르누아르, null=널값, 드라마=작은아씨들, 영화=스파이더맨, 만화=슬램덩크}

		카테고리, 타이틀 입력(컴마 구분) : 소설, 파이이야기
		{null=데미안, 소설=파이이야기, 그림=르누아르, null=널값, 드라마=작은아씨들, 영화=스파이더맨, 만화=슬램덩크}

		카테고리, 타이틀 입력(컴마 구분) : null, 널널값
		{null=데미안, 소설=파이이야기, 그림=르누아르, null=널널값, 드라마=작은아씨들, 영화=스파이더맨, 만화=슬램덩크}

		 */
		
		//--끝내려면 ctrl+z

	}

}
