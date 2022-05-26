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
 
 
