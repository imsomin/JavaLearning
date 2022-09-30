//컬렉션 프레임워크(Collection Framework)

// Set -> HashSet, TreeSet
// - 순서 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스

	java.util.TreeSet<E> 클래스는
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.

*/

// VO   ->  Value Object          //--value 값을 격납하기 위해 존재
// DTO  ->  Data Transfer Object
// DAO  ->  Data Access Object    //--데이터를 한 번에 접근해 처리




package High;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class GradeVO
{
	//주요 속성 구성
	private String hak;          //--학번
	private String name;         //--이름
	private int kor, eng, mat;   //--국어점수, 영어점수, 수학점수

	//생성자(사용자 정의 생성자 -> 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	//생성자(사용자 정의 생성자 -> 매개변수 없는 생성자)
	//-- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//   default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//   추가로 정의한 생성자
	GradeVO()
	{
	}

	//getter / setter()
	public String getHak()
	{
		return hak;
	}

	//this는 클래스 안에서 볼 수 있는데 클래스 메소드의 매개변수와
	//식별자(변수이름)이 겹치는 경우가 발생할 때 유용하게 사용된다.
	public void setHak(String hak)
	{
		this.hak = hak;
	}

	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	
	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = eng;
	}

	
	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;
	}

	
	//추가 메소드 정의(총점 산출)
	public int getTot()
	{
		return kor + eng + mat;
	}

}

//Comparator 을 재정의하는 방식
class MyComparator<T> implements Comparator<T> //-> 인터페이스 구현
{
	// 비교 메소드 재정의 -> 데이터를 비교할 수 있도록!
	@Override  //-> 원래 해당 메소드를 가지고 있으나 선언한 메소드를 다시 정의한다.
	public int compare(T o1 , T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		//학번 기준 (오름차순)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//return Integer.parseInt("2201123") - Integer.parseInt("2201124");
		//              ↓                                
		//return 2201123 - 2201124;
		//return -1;

		//학번 기준 (내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		//총점 기준 (오름차순)
		//return s1.getTot() - s2.getTot();

		//총점 기준 (내림차순)
		//return s2.getTot() - s1.getTot();

		//이름 기준 (오름차순)
		//return 정수형;
		return s1.getName().compareTo(s2.getName());

		//이름 기준 (내림차순)
		//return s2.getName().compareTo(s1.getName());

	}
}



public class day30_1 {
	
	public static void main(String[] args)
	{

		//TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet 자료구조 set 에 요소 추가 -> add();
		set.add("슬램덩크");
		set.add("하울의움직이는성");
		set.add("하이큐");
		set.add("토이스토리");
		set.add("알라딘");
		set.add("코코");
		set.add("심슨");
		set.add("스파이더맨");
		set.add("어드벤쳐타임");
		set.add("짱구는못말려");
		set.add("포켓몬스터");
		set.add("원피스");

		//Iterator를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//-->>스파이더맨 슬램덩크 심슨 알라딘 어드벤쳐타임 원피스 짱구는못말려 코코 토이스토리 포켓몬스터 하울의움직이는성 하이큐
		//--가나다 순으로 출력됨		


				
		//TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		//--위 구문을 통해 비교 값을 알 수 있다.
		//  만약 빼기 계산 값이 음수가 나온다면 뒷 값이 더 크다는 사실을 알 수 있다.

		set2.add(new GradeVO("2201123", "가나다", 90,80,70));
		set2.add(new GradeVO("2201124", "마바사", 91,81,71));
		set2.add(new GradeVO("2201125", "아자차", 98,79,77));
		set2.add(new GradeVO("2201126", "타파하", 96,86,76));
		set2.add(new GradeVO("2201127", "강낭당", 99,82,72));


		//Iterator 를 활용한 set 요소 전체 출력
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/
		//실행결과
		/*
		High.GradeVO@7852e922 
		High.GradeVO@4e25154f 
		High.GradeVO@70dea4e 
		High.GradeVO@5c647e05 
		High.GradeVO@33909752 
		*/
		//--각각 하나의 객체임
		//  하나의 객체를 직접 출력(toString 형태)
		
		
		//에러 발생(런타임 에러)하는 경우 '참고'
		/*
		Exception in thread "main" java.lang.ClassCastException: 
		GradeVO cannot be cast to java.lang.Comparable
		*/
		//객체를 채워 넣었더니 에러 발생
		//ClassCastException 라는 예외
		//Comparable 즉 비교를 할 수 없다!



		
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next(); 
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", vo.getHak(), vo.getName(), 
					vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());
		}
		System.out.println();
		
		//실행결과
		/*
		2201123     가나다   90   80   70    240
		2201127     강낭당   99   82   72    253
		2201124     마바사   91   81   71    243
		2201125     아자차   98   79   77    254
		2201126     타파하   96   86   76    258
		*/
		//--가나다 순으로 출력됨

	

	}

}
