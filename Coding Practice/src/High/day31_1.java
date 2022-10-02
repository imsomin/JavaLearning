//자바의 기본 입출력(I/O)

//OutputStream 실습
//OutputStream : 바이트 기반 스트림 객체

package High;

import java.io.OutputStream;
import java.io.IOException;


public class day31_1 {
	
	public static void main(String[] args)  throws IOException
	{

		//System.in : 자바의 표준 입력 스트림
		//System.out : 자바의 표준 출력 스트림
		OutputStream out = System.out;
		//--OutputStream은 바이트기반 스트림의 조상격 에 해당한다
		//  'system.out'은 객체에 해당한다
		//  이는 업캐스팅에 해당하다고도 설명 가능하다

		// 배열 구성
		byte[] ch = new byte[3];
		ch[0] = 65;     //A
		ch[1] = 97;     //a
		ch[2] = 122;    //z

		out.write(ch);  
		//--밖으로 내보낼 데이터(변수)를 스트림에 기록
		//  물줄기에다가 보낼 값을 띄우는 과정
		//--out <= OutputStream

		out.flush();    
		//--기록된 스트림을 내보내는(밀어내는) 기능을 수행 (like 주사기)
		//  지금은 Buffer 를 활용하지 않고 있는 상황이기 때문에 생략이 가능한 코드
		//  Buffered 되어 있는 스트림(stream)일 경우 생략 불가

        out.close();    
        //--출력 스트림(물줄기)에 대한 리소스 반납
		//  (out 스트림을(수도꼭지를) 잠가버린 상황)

		System.out.println("절대적인 신뢰를 갖고 있는 구문");
		//위의 문장이 나오지 않아야 정상임!
		//(왜냐하면 수도꼭지를 잠근 상태이기 때문)
		
		//out.close() 주석처리 시 결과
		//Aaz절대적인 신뢰를 갖고 있는 구문
		

	}

}

//결과
//Aaz