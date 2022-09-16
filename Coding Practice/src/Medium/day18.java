//상속(Inheritance)

/*
○ 상속 이란
- 새로 설계(생성)하고자 하는 클래스가
    이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
    이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.
- 즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
    고수준의 재사용성을 확보하고 객체간의 관계를 구성함으로써
    객체 지향의 또 다른 특징인 '다형성'의 문법적 토대가 된다.
- 상속은 기존 프로그램의 클래스 내용을 공유함으로써
    중복된 코드들을 재작성할 필요 없이
    반복적이고 세부적인 작업을 처리하지 않기 때문에
    유지보수를 편리하게 할 수 있으며,
    프로그램의 길이도 짧아지게 된다.
- 또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
    오류를 줄일 수 있어 현재 작성 중인 프로그램에만 전념할 수 있다.

※ 주의할 점
- 자바는 다중상속을 지원하지 않기 때문에
    두 개 이상의 클래스로부터 상속받을 수 없다.
- 즉, 자바는 단일상속만 지원한다.

*/

//상위 클래스 == 부모 클래스 == Super 클래스  ->물려주는 클래스
//하위 클래스 == 자식 클래스 == Sub 클래스       ->상속받는 클래스

package Medium;

//부모 클래스
class Super180  
{
	protected double area;

	Super180()
	{
		System.out.println("Super Class");
	}

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}

// ↓

//자식 클래스
public class day18  extends Super180
{
	/*
	//부모로부터 물려받은 area
	protected double area;    

	//생성자는 상속 대상에서 제외된다.
	Super180()
	{
		System.out.println("Super Class");
	}
					
	//부모로부터 물려받은 write()
	void write(String title)      
	{
		System.out.println(title + " - " + area);
	}
	*/

	//자식이 원래 갖고있던 area가 있을 수 있다.
	//이런 경우, 구분이 가능하므로 이름이 같아도 허용된다.
	//double area = 10.1234;          

	
	//자식 클래스의 생성자 ★
	day18()
	{
		System.out.println("Sub Class");
	}

	public void actionCircle()
	{
		int r = 10;
		area = r * r * 3.141592;     
		write("원");  //--부모한테 물려받은 write 메소드 존재                
		
	}

	public void actionRect()
	{
		int w=20, h=5;
		area = w * h;				
		write("사각형");  //--부모한테 물려받은 write 메소드 존재
		
	}
	

	public static void main(String[] args)
	{
		//day18 클래스(자식) 기반 인스턴스 생성
		day18 ob = new day18();

		ob.actionCircle();
		ob.actionRect();
		//실행결과
		/*
		원 - 314.1592
		사각형 - 100.0
		 */

		//원래 자식이 가지고 있던 area를 주석처리하고난 뒤 결과
		/*
		원 - 0.0
		사각형 - 0.0
		*/
	}

}

//결과
/*
Super Class
Sub Class
원 - 314.1592
사각형 - 100.0
*/
