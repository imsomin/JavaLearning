<0804>

1.사용한 웹 컨테이너 : 톰캣8.5
  클라이언트의 요청에 따른 리소스를 찾고 
  자바 코드를 html 코드로 변환하여 응답 및 전송해주는 임무 수행

2.통합 개발 환경(IDE), 코드를 작성하고 빌드해줄 수 있는 툴 : 이클립스

3.Servelt : 자바 코드에 html 삽입
  용도 : 처리

 vs 

 JSP : html 내에 자바 코드 삽입
 용도 : 출력
 
=> 서블릿은 최초 한 번만 실행시키면 클래스 파일이 이미 존재하는 상황이 되지만
jsp 는 호출할 때마다 클래스를 만들고 객체를 만들고, 이를 반복함

4. 컴파일: 작성한 소스 코드(.java)는 자바 컴파일러의 컴파일 과정을 통해
   자바가상머신(JVM)이 인식할 수 있는 바이트 코드를 생성해내고
   이렇게 만들어진 파일(.class)을 자바런처가 execute(실행)하게 되는 것이다.
   
   빌드: 클래스 파일을 실행히 줄 수 있도록 여러 개의 클래스는 묶어서
   하나의 실행 파일로 만들어 주는 과정이 빌드이다.
   이클립스는 컴파일과 빌드를 한 번에 해주는 것이다.

5. .jar
라이브러리 파일
자바 패키지의 집합으로 압축된 파일
이 파일만은 유일하게 자바에서 스스로 압축을 해제하여 사용하게 된다.

6. src
확장자가 .java 인 파일들은 모조리 여기 위치한다.

7. WebContent
- META-INF : 여기에는 context.xml 만 들어간다
             리소스의 위치를 저장하는 역할을 하게 되며, 주로 DB연동 시 사용된다.
- WEB-INF : 여기에는 web.xml 이 들어간다. 이에는 설정(배치기술서) 내용이 포함된다.
            lib = 외부 라이브러리


8. jsp 내장 객체
request : 내장 객체
response : 내장 객체
session : 내장 객체

9. servlet
request : doGet() 과 doPost()의 매개변수
response : doGet() 과 doPost()의 매개변수
session : request.getSession() 으로 만들어서 사용 필요

10. servlet을 만들고 request 객체를 공유할 수 있도록 작성하는 방법
Servlet
{
   HttpServletRequest request;  //멤버 변수로 request 를 구성해두면 된다

   void doGet(HttpServletRequest request)
   {
      this.request = request;
   }
}


11. 데이터 전송 : HTML / JSP -> Servlet
서블릿 파일은 HttpServletRequest객체를 이용하여, Parameter값을 얻음.
파라미터 이외에는 데이터 전송과 관련한 다른 선택 가능한 수단이 없다.
파라미터는 곧 주소다.

<관련 메소드>
getParameter(name)
: 웹 브라우저에서 전송받은 request 영역에서 name 값이 param인 값이 읽어옴
getParameterValues(name)
: check박스와 같이 하나의 name으로 여러개의 정보가 전달되어 올 때 사용
getParameterNames()
: 파라미터의 이름 집합을 Enumeration 객체로 반환, 전체 파라미터를 쉽게 다룰 수 있음

예시)
public void doPost(HttpServletRequest request, HttpServletResponse response){
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	response.setContentType("text/html; charset=EUC-KR");
}

12. 데이터 전송 : Servlet -> JSP
애트리뷰트(attribute)를 이용한다.
이 과정에서 파라미터는 잘 사용되지 않는다.

처리 과정)
데이터 전송
request.setAttribute("속성명", 데이터); 
session.setAttribute("속성명", 데이터)

처리
(변경할 타입명)request.getAttribute("속성명");
(변경할 타입명)session.getAttribute("속성명");


13. 패턴 Pattern
-FrontController 패턴
: 여러 개의 요청을 하나의 Servlet 이 처리

-Model 1 패턴
: 일반적으로 모든 코드를 JSP에 작성

-Model 2 패턴
: 출력은 JSP가 수행하고, 처리는 Servlet이 수행
유지보수가 쉽지만, 구조가 복잡함
대규모 프로젝트에 이용

-Command 패턴
: 각각의 요청을 별도의 객체가 처리

-DAO 패턴
: 데이터베이스 연동 부분을 별도의 객체로 처리

-DTO 패턴
: 데이터 표현을 별도의 객체로 처리

-MVC 패턴
: 데이터를 만드는 부분(model)과 데이터를 출력하는 부분(view)
및 연결하는 부분(Controller)을 별도의 객체로 처리
이 모든 과정은 독립성을 갖도록 해서 유지보수를 용이하게 하기 위해서 
처리하는 것이다.
보통 Model2 MVC 패턴을 만든다.

-Model 1 vs Model 2 MVC
<Model 1>
요청 ->->-> JSP ->->-> DAO
응답 <-<-<- JSP <-<-<- 처리결과

<Model 2 MVC>
                서블릿            java클래스
요청    ->->-> Controller ->->-> Service ->->-> Dao
응답  <-<- JSP <-<- Controller <-<- Service <-<- 처리결과

14.
Listener : 프로젝트의 시작과 종료(서버 올릴 때 처음 실행되고 종료되는 것)
Filter : 특정 요청에 따른 걸러내기(필터링)
Wrapper : 데이터 변경

15. 한글처리
-주소에 한글이 존재하는 경우
java.net.URLEncoder.encode("주소", "인코딩방식")
과 같이 구성하여 인코딩 방식의 문자열로 반환될 수 있도록 처리해야 한다.

-post 방식 넘기는 경우
post 방식에서의 유니코드 처리는 처리를 요청받은 파일에서
request.setCharacterEncoding("인코딩값")으로 처리

-get 방식으로 한글을 넘기는 경우
<Connector port="8090" protocol="HTTP/1.1"
 connectionTimeout = "20000"
 redirectPort = "8443"
 URIEncoding = "utf-8" />























