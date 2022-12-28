# Builder Pattern

복잡한 객체가 있을 경우 한 번에 인스턴스 속성을 만들어내기 어려움

## ROLE

### Builder (건축가)

인스턴스를 생성하기 위한 인터페이스 결정

### ConcreteBuilder (구체적인 건축가)

실제 인스턴스생성을 결정하고 구현

### Director(감독관)

Builder의 메소드를 사용하여 클래스 생성 위임

### Client (의뢰인)

사용할 클래스 Director에게 요청

## 사용 이유

### 어떤 것을 써야하는지 확실하게 알아야하는가?

Director 클래스가 자신이 이용하는 Builder의 하위클래스를 모르는 것이 좋음

- 모르기 때문에 교체가능
- 교체되기 때문에 부품으로서 가치가 높음

이 때문에 '교체가능성'을 고려해야함

### 의존성 주입

사용할 인스턴스를 대신 전달

### 설계시 결정할 수 있는 것과 없는 것 분리

미래에 예상되는 변화에 견딜 수 있도록 설계해야함

### 소스 수정

호출하는 메소드를 수정하는 일은 하위 클래스에 영향을 줌
부품의 독립성을 보존

## 관련 패턴

### template method

builder패턴은 Director(위임된)역이 Builder를 제어
template method 패턴은 상위 클래스가 하위 클래스 제어

### composite

Builder패턴으로 생성할때 Compoiste 패턴으로 생성하는 경우가 존재

### abstract factory

builder 패턴과 abstract factory은 모두 인스턴스를 생성할때 사용

### facade
