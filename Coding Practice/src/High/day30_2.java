//컬렉션 프레임워크(Collection Framework)

//Map → Hashtable, HashMap
// - java.util.Map 인터페이스는
//   키(key)를 값(value)에 매핑(mapping)하며,
//   각 키는 한 개의 값만을 매핑해야 한다.
//   즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.

/*
○ Hashtable<K, V> 클래스

 - 해시테이블 구조를 객체 모델링한 클래스로
   검색이 용이하기 깨문에 사용 빈도가 높은 편에 속한다.

 - 해시테이블이란 키(key) 와 그에 상응하는 데이터(value)로
   구분된 데이터 구조이다.

 - 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며
   이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

 - 또한, Hashtable 클래스는 key 또는 value 의 값으로 
 null 을 허용하지 않는다.
 
*/



package High;

import java.util.Hashtable;

public class day30_2 {
	
	private static final String[] names
	= {"가나다", "마바사", "아자차", "타파하", "강낭당"};

	private static final String[] tels
	= {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"};

	public static void main(String[] args)
	{
		//Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();

		//ht 라는 Hashtable 자료구조에 배열(names, tels)에 담겨있는 데이터를 요소로 담아내기
		// -> put(k, v);
		for (int i=0; i<names.length; i++)  //반복문은 총 5번 실행된다(10번 아님 주의)
		{
			ht.put(names[i], tels[i]);
		}
		
		//-----------------------------------------------------------

		//ht 라는 Hashtable 의 값을 'key' 를 이용하여 검색
		// -> get(k)
		String findName1 = "타파하";   //key값
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " 의 전화번호 : " + str);
		}
		System.out.println();
		//-->>타파하 의 전화번호 : 010-4444-4444

		
		//ht 라는 Hashtable 자료구조에  'key' 가 존재하는지의 여부 확인
		// -> containsKey(k)
		String findName2 = "망방상";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//-->>망방상 데이터가 존재하지 않습니다.
	
		String findName3 = "강낭당";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//-->>강낭당 데이터가 존재합니다.
	
	
		//-----------------------------------------------------------
		
		
		//ht 라는 Hashtable 자료구조에 'value' 가 존재하는지의 여부 확인
		// -> contains(v)
		String findTel1  = "010-1111-1111";   //value값
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//-->>010-1111-1111 데이터가 존재합니다.

		
		//ht 라는 Hashtable 자료구조에서 '아자차' 데이터 삭제
		// -> remove(k)
		ht.remove("아자차");
		//-- 'remove()' 메소드는 인자값으로 key 를 넘겨받지만
		//   이 때, key 만 삭제되는 것이 아니다.
		//   해당 key 와 연결되어(매핑되어)있는 value 도 함께 remove() 된다.

		// 삭제(remove()) 이후 'key' 가 존재하는지 확인
		if (ht.containsKey("아자차"))
		{
			System.out.println("존재합니다.");
		}
		else
		{
			System.out.println("존재하지 않습니다.");
		}
		System.out.println();
		//-->>존재하지 않습니다.
	

		//삭제(remove()) 이후 'value' 가 존재하는 지 확인
		if (ht.contains("010-3333-3333"))  //삭제된 '아자차'의 번호인 '010-3333-3333'
		{
			System.out.println("데이터가 존재합니다.");
		}
		else
		{
			System.out.println("데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//-->>데이터가 존재하지 않습니다.

		//===================================================
		// ※ null 관련 처리
		//ht.put(null,null);           //--key, value 모두 null  
		//-->> 에러 발생(런타임 에러)
		//     NullPointexception 
		//ht.put("가나다", null);        //--value 가 null       
		//-->> 에러 발생(런타임 에러) 
		//     NullPointexception
		//ht.put(null, "010-1234-2345"); //--key 가 null
		//-->> 에러 발생(런타임 에러) 
		//     NullPointexception
		//===================================================

		//중복된 key 입력
		ht.put("가나다", "010-1234-1234");

		System.out.println(ht.get("가나다"));
		//-->>010-1234-1234
		//--기존의 번호에서 010-1234-1234 로 변경되었음을 확인
		//  덮어쓰기 개념
	
		System.out.println();

		//중복된 value 입력
		ht.put("각낙닥", "010-5555-5555");

		System.out.println(ht.get("강낭당"));
		//-->>010-5555-5555
		System.out.println(ht.get("각낙닥"));
		//-->>010-5555-5555
		//--value 는 몇번이고 중복되고 상관은 없으나
		//  key는 계속해서 덮어쓰이게 된다.



	}

}
