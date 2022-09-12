//배열의 복사

//day14_4.java 파일과 비교할 것!

// ※ 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
// (1)주소값 복사 
//->원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
//(배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)
// (2)데이터 복사 
//->실제 요소로 들어있는 값에 대한 복사로 
//원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법


// day14_5.java
// 데이터 복사

//-- int 형 배열에 대한 데이터 복사를 처리하는 메소드를 정의하는 형태의 실습

package Medium;

public class day14_5 {
	
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};   //--배열 원본

		//주소값 복사
		int[] copys1 = nums;				 
											 
		//사용자 정의 메소드 호출
		int[] copys2 = copyArray(nums);     
										    
		//여기서 nums는 배열이다.
		//nums  -> 객체
		//nums. -> 객체 설계도를 만들수 있는 준비 완료
		//객체 형식은 배열 복사가 불가능하다. 그래서 형 변환을 해야한다.
		
		//  자바 제공의 clone() 메소드
		int[] copys3 = (int[])nums.clone();    //-- 배열 데이터 복사 수행
											  
		//원본 배열 요소의 수정 
		nums[1] = 2;

		
		// 결과 확인
		for (int i=0; i<nums.length; i++)
		{
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
		//-->>  10   2  30  40  50
		
	
		for (int i=0; i<copys1.length; i++)
		{
			System.out.printf("%4d", copys1[i]);
		}
		System.out.println();
		//-->>  10   2  30  40  50
		

	
		for (int i=0; i<copys2.length; i++)
		{
			System.out.printf("%4d", copys2[i]);
		}
		System.out.println();
		//-->>  10  20  30  40  50
		//여기서, 배열의 1번째 요소가 바뀌지 않음을 확인할 수 있다.
		//즉 원본을 수정해도 데이터에는 영향이 없다.
	
		for (int i=0; i<copys3.length; i++)
		{
			System.out.printf("%4d", copys3[i]);
		}
		System.out.println();
		//-->>  10  20  30  40  50

		

	}

	// 매개변수로 int 배열 타입을 넘겨받아 이를 복사한 후
	// 복사한 배열을 반환하는 기능을 가진 메소드 정의
	public static int[] copyArray(int[] os)
	{
		//매개변수로 넘겨받은 배열(os)
		//즉, 원본 배열 만큼의 배열 공간(=메모리 공간)을 확보한
		//복사할 배열공간 생성
		int[] temp = new int[os.length];

		//각각의 원본 배열(os)에 담겨있는 요소들을 복사 배열(temp)에 담아내기
		//temp = os; -- X
		for (int i=0; i<os.length; i++)
		{
			temp[i] = os[i];
			//옮겨담는다(temp에 os값이 담김)
		}

		//복사한 배열(temp) 반환
		return temp;


	}
   


}
