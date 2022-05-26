form 요소를 사용해 사용자로부터 입력받기  
입력받은 데이터를 서버로 전송할 때도 form 사용  

<form name="입력 폼 이름" action="웹 프로그램 페이지" method="전달방식">  
  <input type="폼 모양과 기능" name="입력 폼 변수" value="전달값">  
 </form>  
   
 action: 사용자가 입력한 데이터를 받아 처리하기 위한 웹프로그램 페이지 지정  
 method: 웹서버와 클라이언트간의 통신방법 지정(GET/POST)  
 type: 폼 모양과 기능 결정  
 name: 폼의 이름 결정  
 
 => 사용자가 form 요소를 통해 입력한 데이터는 action 속성에 명시된 위치로 method 속성 방식으로 전달  
   
 method 속성  
 1. GET 방식  
  - 주소 뒤에 '? key=value &항목=값' 형태로 구성  
  - url뒤에 파라미터를 붙여서 데이터를 전달하는 방식  
  - 서버로 보낼 수 있는 최대 글자수는 2048자  
  - URL을 보면 어떤 데이터를 전송하는지 알 수 있기 때문에 보안에 취약  
  - e.g.  
<!DOCTYPE html>  
<html>  
  <head>  
    <title>GET방식</title>  
  </head>  
  <body>  
    <h2>GET방식으로 데이터 전송</h2>  
    <form action="01.getdata.jsp" method="get">  
      <p>이름: <input type="text" name="name"></p>  
      <p></p>  
    </form>  
  </body>  
  </html>  
    
2. POST 방식  
 - http request 헤더에 파라미터를 붙여 데이터를 전송하는 방식  
 - 서버로 보낼 수 있는 글자 수 제한 없음  
 - GET방식과 비교해 보안상 우위에 있음  
 - e.g.  
<!DOCTYPE html>  
<html>  
  <head>  
    <title>POST방식</title>  
  </head>  
  <body>  
    <h2>POST방식으로 데이터 전송</h2>  
    <form action="02.postdata.jsp" method="post">  
      <p>이름: <input type="text" name="name"></p>  
      <p></p>  
    </form>  
  </body>  
  </html>  
 
