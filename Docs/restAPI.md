Rest의 정의  
자원을 이름으로 구분하여 해당 자원의 상태(정보)를 주고 받는 모든 것을 의미한다.  
Rest는 기본적으로 웹의 기존 기술과 HTTP 프로토콜을 그대로 활용하기 때문에 웹의 장점을 최대한 활용할 수 있는 아키텍처 스타일이다.  

REST의 구체적인 개념  
HTTP URI를 통해 자원을 명시하고, HTTP Method를 통해 해당 자원에 대한 CRUD Operation을 적용하는 것을 의미한다.  
  
CRUD Operation
Create: 생성 (POST)
Read: 조회(GET)
Update: 수정(PUT)
Delete: 삭제(DELETE)
HEAD: header 정보 조회(HEAD)

REST 구성 요소  
1. 자원(Resource): URI  
모든 자원에 고유한 ID가 존재하고, 이 자원은 Server에 존재한다.  
자원을 구별하는 ID는 ‘/groups/:group_id’와 같은 HTTP URI 다.  
Client는 URI를 이용해서 자원을 지정하고 해당 자원의 상태(정보)에 대한 조작을 Server에 요청한다.  

2. 행위(Verb): HTTP Method  
HTTP 프로토콜의 Method를 사용한다.  
HTTP 프로토콜은 GET, POST, PUT, DELETE 와 같은 메서드를 제공한다.  

3. 표현(Representation of Resource)  
Client가 자원의 상태(정보)에 대한 조작을 요청하면 Server는 이에 적절한 응답(Representation)을 보낸다.  
REST에서 하나의 자원은 JSON, XML, TEXT, RSS 등 여러 형태의 Representation으로 나타내어 질 수 있다.  
JSON 혹은 XML를 통해 데이터를 주고 받는 것이 일반적이다.  
  
REST API의 개념  
  
REST API의 정의  
REST 기반으로 서비스 API를 구현한 것  
  
REST API 설계 규칙  
1. 슬래시 구분자(/ )는 계층 관계를 나타내는데 사용한다.  
  Ex) http://restapi.example.com/houses/apartments  
2. URI 마지막 문자로 슬래시(/ )를 포함하지 않는다.  
  URI에 포함되는 모든 글자는 리소스의 유일한 식별자로 사용되어야 하며 URI가 다르다는 것은 리소스가 다르다는 것이고, 역으로 리소스가 다르면 URI도 달라져야 한다.  
  REST API는 분명한 URI를 만들어 통신을 해야 하기 때문에 혼동을 주지 않도록 URI 경로의 마지막에는 슬래시(/)를 사용하지 않는다.  
  Ex) http://restapi.example.com/houses/apartments/ (X)  
3. 하이픈(- )은 URI 가독성을 높이는데 사용  
  불가피하게 긴 URI경로를 사용하게 된다면 하이픈을 사용해 가독성을 높인다.  
4. 밑줄(_ )은 URI에 사용하지 않는다.  
  밑줄은 보기 어렵거나 밑줄 때문에 문자가 가려지기도 하므로 가독성을 위해 밑줄은 사용하지 않는다.  
5. URI 경로에는 소문자가 적합하다.  
  URI 경로에 대문자 사용은 피하도록 한다.  
6. 파일확장자는 URI에 포함하지 않는다.  
  REST API에서는 메시지 바디 내용의 포맷을 나타내기 위한 파일 확장자를 URI 안에 포함시키지 않는다.  
  Accept header를 사용한다.  
  Ex) http://restapi.example.com/members/soccer/345/photo.jpg (X)  
  Ex) GET / members/soccer/345/photo HTTP/1.1 Host: restapi.example.com Accept: image/jpg (O)  
7. 리소스 간에는 연관 관계가 있는 경우  
  /리소스명/리소스 ID/관계가 있는 다른 리소스명  
  Ex) GET : /users/{userid}/devices (일반적으로 소유 ‘has’의 관계를 표현할 때)  
