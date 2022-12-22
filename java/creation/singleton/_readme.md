# Template Method

- 지정된 클래스의 인스턴스가 `반드시 1개`만 존재한다는 것을 보증
- 인스턴스가 하나만 존재한다는 것을 프로그램 상에 표현하고 싶을 때

## ROLE

### Singleton

유일한 인스턴스를 얻기 위한 static 메소드를 가지고 있음
이 메소드는 항상 같은 인스턴스를 반환 해야함

## 사용 이유

### 제한사용

여러 인스턴스가 존재한다면 서로 영향을 미쳐 버그를 만들 수도 있음

### 생성되는 타이밍 (java)

getInstance 메소드가 호출할때 static 필드가 초기화 되면서 유일한 인스턴스가 생성됨

### enum을 이용한 Singleton

enum의 요소는 상수로써 인스턴스의 유일성을 보증받을 수 있음

```java
enum enumSingleton {
  INSTANCE;

  public void hello() {
    System.out.println("hello is called.");
  }
}

enumSingleton.INSTANCE.hello();
```

위와 같은 구문으로 enum으로 유일한 인스턴스를 액세스 할 수 있음

## 관련 패턴

아래에 패턴에서 싱글톤 패턴이 사용될 가능성이 높음

### Abstract Factory

### Builder

### Facade

### Flyweight

### Prototype

### State
