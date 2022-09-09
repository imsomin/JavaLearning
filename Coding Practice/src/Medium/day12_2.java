//배열의 기본적 활용

//'char' 자료형의 배열을 만들어
//그 배열의 각 방에 알파벳 대문자를 채우고
//채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
//단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리한다.

package Medium;

public class day12_2 {
	
	public static void main(String[] args) 
	{
		//배열 채우기
		char[] arr = new char[26]; //알파벳 대문자는 총 26개
		
		//대문자 'A'는 65라는 코드값을 가진다.
		for (int i=0, ch=65; i<arr.length; i++, ch++)
		{
			arr[i] = (char)ch;
		}
		

		//배열 요소 전체 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}

//결과
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
