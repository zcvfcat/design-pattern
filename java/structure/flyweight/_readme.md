# flyweight Pattern

- `인스턴스를 최대한 공유하고 쓸때없이 new를 사용하지 않음`

## ROLE

### Flyweight (플라이급)

문제를 해결할 수 있는 클래스

### FlyweightFactory (플라이급 공장)

Flyweight 만드는 공장

### Client

FlyweightFactory를 사용하여 Flyweight를 만들어 내고 이용

## 사용 이유

### 여러 장소에 영향을 미침

> Flyweight를 설계할 때, 무엇을 공유해야 할지 결정해야함

- 공유하고 있는 것을 변경 시, 여러 곳에 영향을 줌
- 즉, 여러 곳에서 공유해야 할 정보만 Flyweight 역이 갖는 것이 좋음

### intrinsic(공유하는 정보)과 extrinsic(공유하지 않는 정보)

#### intrinsic

- 본래 갖춰진, 본질적인이라는 뜻
- 해당 인스턴스가 어떤 상황에서도 변하지 않는 정보 (상태에 의존하지 않음)

#### extrinsic

- 외부에서 온, 비본질적인이라는 뜻
- 인스턴스의 상태에따라 변경되는 정보

### 관리되는 인스턴스는 가비지 컬렉션되지 않는다

### 메모리 이외의 리소스

인스턴스를 공유시, 리소스 양을 줄일 수 있음

- 시간도 자원의 일종, new로 생성시 일정한 시간을 줄일 수 있음
- 파일 핸들 자원의 경우, OS에 따라 사용 제한이 있음, 인스턴스를 공유해 두지 않으면 이 제한에 걸려 프로그램이 동작하지 않을 위험이 있음

### static Factory Method

## 관련 패턴

### Proxy

Flyweight 패턴에서 인스턴스 생성하는 데 시간이 오래 걸릴 경우, Proxy을 사용하여 처리 속도를 높임

### Composite

Composite 패턴의 Leaf역을 공유할 수 있음

### Singleton

Flyweight패턴에 Singleton패턴이 사용될 경우가 있음

- 하나만 만들기 때문에 인스턴스가 사용되는 모든 곳에서 공유
- intrinsic한 정보만 가지고 있음
