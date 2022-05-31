# Spring Container
스프링 컨테이너는 자바 객체의 생명 주기를 관리하며, 생성된 자바 객체들에게 추가적인 기능을 제공하는 역할을 한다. 여기서 자바 객체는 빈(Bean)
- 생명주기 : 객체의 초기화부터 종료까지


## Bean Factory 컨테이너 
(Bean Configuration 파일에 직접 빈을 등록하는 방법)
```java
@Configuration
public class AppConfig {

    @Bean
    public Abc abc() {
        return new AbcImpl(def());
    }

    @Bean
    public Def def() {
        return new Def();
    }
}
```


# Spring Bean
빈은 스프링 프레임워크에서 Ioc가 관리하는 객체들이다 위 코드에선 @Bean이 붙은 것들. 
빈은 의존성 주입을 자동으로 해준다. 
> return new AbcImpl(def()); 와 같이 코드를 작성하면 abc -> def로의 의존성이 자동으로 생긴다.

## Componet Scan
- @ComponentScan 어노테이션과 @Component 어노테이션을 사용해서 빈을 등록하도록 하는 방법이다.
- @ComponetScan은 어디서부터 Componet들을 스캔할 것인지를 알려주는 역할, @Componet는 붙어있는 클래스들의 인스턴스를 자동으로 생성해 빈으로 만들어준다.
(@Controller, @Service, @Entity 등도 클래스 파일을 열어보면 내부적으로 @Component 어노테이션을 사용한다.)

아래와 같이 @Component를 붙이면 자동으로 빈이 생성된다
```java
@Component
public class bean {
  //...
}
```


### Bean 조회
```java
public class Main {

    public static void main(String[] args) {
        final BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
        final Abc abc = beanFactory.getBean("abc", Abc.class);
    }
}
```
이처럼 beanfactory를 가져오고 getBean을 사용해 bean을 불러올 수 있다.
