##DI  
DI(Dependency Injection)은 스프링이 다른 프레임워크와 차별화되어 제공하는 의존관계 주입기능, 객체를 직접 생성하는 것이 아니라 외부에서 생성한 후 주입시키는 방식.  
DI를 통해 모듈간의 결합도가 낮아지고 유연성이 높아진다.  
  
한가지 방법은 new 생성자를 통해 생성하거나 다른 방법은 외부에서 생성된 객체를 setter()를 통해 사용하는 방법.  
  
두번째 방식(setter())를 사용하는 방식이 의존성 주입방식의 예시  
외부(IoC컨테이너)에서 생성된 객체들을 주입시켜 setter() 혹은 생성자를 통해 사용하는 방식  
  
Spring에선 객체를 Bean이라고 부르며, 프로젝트가 실행될 때 사용자가 Bean으로 관리하는 객체들의 생성과 소멸에 관련된 작업을 자동으로 수행, 객체들이 생성되는 곳을 Bean 컨테이너라고 부른다.  
  
##IoC  
IoC(Inversion of Control)란 '제어의 역전'이라는 의미를 가지며, 메소드나 객체의 호출작업을 개발자가 결정하는 것이 아니라, 외부에서 결정.  
  
객체의 의존성을 역전시켜 객체간의 결합도를 줄이고 유연한 코드를 작성할 수 있게 한다.  
가독성, 코드 중복, 유지 중복을 편하게 할 수 있다.  
  
기존의 방식은  
1. 객체 생성 2. 의존성 객체 생성 (클래스 내부에서 생성) 3. 의존성 객체 메소드 호출  
  
하지만 스프링에서는  
1. 객체 생성 2. 의존성 객체 주입 (스스로가 만드는 것이 아니라 스프링에게 위임하여 스프링이 만들어놓은 객체를 주입) 3. 의존성 객체 메소드 호출  
의 방식으로 이뤄진다.  
  
즉 스프링이 모든 의존성 객체를 스프링이 실행될 때 마다 다 만들어주고 필요한 곳에 주입시킴으로써 Bean들은 싱글턴 패턴을 가진다.  
제어의 흐름을 사용자가 컨트롤 하는 것이 아니라, 스프링에게 맡겨 작업을 처리한다.
