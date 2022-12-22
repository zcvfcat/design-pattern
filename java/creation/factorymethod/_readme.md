# Factory Method

상위 클래스에서 생성 방법을 결정하지만 구체적인 클래스 이름을 적지않음

## ROLE

### Product (제품)

이 패턴으로 생성되는 인스턴스가 가져야할 인터페이스(API)를 결정

### Creator (작성자)

생성 메소드를 통해 구체적인 클래스를 작성해야하는 속박에서 벗어나게함

### ConcreteProduct (구체적인 제품)

구체적인 생성될 클래스를 결정

### ConcreteCreator (구체적인 작성자)

구체적인 클래스를 만들 수 있는 클래스를 결정

## 사용 이유

### 프레임워크와 구체적인 내용

프레임워크로 생성하는 클래스들을 수정할때에 프레임워크를 수정할 필요가 없음
`프레임워크는 구체적인 클래스들에게 의존하지 않음`

### 인스턴스 생성 - 메소드 구현방법

- 추상 메소드로 기술

```java
abstract class Factory{
  public abstract Product createProduct(String name);
}
```

- 디폴트 메소드로 기술

```java
class Factory{
  public Product createProduct(String name){
    return Product(name);
  }
}
```

### 패턴 이용과 개발자 간의 의사소통

> 개발 문서 안에 실제로 사용되는 디자인 패턴의 명칭과 의도를 기술

디자인 패턴을 사용해 어떤 클래스를 설계할 경우 보수하는 사람에게 의도한 디자인 패턴이 무엇인지 전달할 필요가 있음

### static FactoryMethod

JAVA API 레퍼런스

```java
SecureRandom random = SecureRandom.getInstance("NativePRNG");
List<String> list1 = List.of("Alice", "Bob", "Chris");
List<String> list2 = Arrays.asList("Alice","Bob","Chris");
String string = String.valueOf('A');
Instant instant = Instant.now();
```

## 관련 패턴

### Template Method 패턴

템플릿 메소드 패턴은 팩토리 메서드 클래스 생성에서 사용됨

### Composite 패턴

생성된 클래스에 Composite 패턴을 적용 가능

### Iterator 패턴

Iterator 인스턴스를 만들 때 팩토리 메서드 패턴 사용 가능
