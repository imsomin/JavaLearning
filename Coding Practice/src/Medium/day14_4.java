//배열의 복사

//day14_5.java 파일과 비교할 것!

// ※ 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
// (1)주소값 복사 
//->원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
//(배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)
// (2)데이터 복사 
//->실제 요소로 들어있는 값에 대한 복사로 
//원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법

// day14_4.java
// 주소값 복사

package Medium;

public class day14_4 {
	
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};   //-- 배열 원본
		int[] copys;                         //-- 복사본으로 만들 배열

		int temp;                            //-- 데이터 저장 임시 변수

		copys = nums;                        //-- 복사 실행
											 //-- 발생 지점 확인 ★

		temp = nums[0];                      //-- temp = 10;	

		//원본 배열 수정
		nums[0] = 1000;                      
		//1000 20 30 40 50 으로 수정이 됨								 

		// copys 배열의 전체 요소 출력
		for (int i=0; i<copys.length; i++)
		{
			System.out.printf("%4d", copys[i]);
		}
		System.out.println();
		//실행 결과
		//--> 1000  20  30  40  50


		System.out.println("temp : " + temp);
		//실행 결과
		//--> temp : 10
		
		//temp는 주소를 담는 것이 아니라 값을 담으므로 변화가 없다.
		//별도의 독립된 공간에 담는 것!
	
	}

}
