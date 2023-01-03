# decorator

- 객체에 점점 장식을 더해가는 디자인 패턴

## ROLE

### Component - Display

기능을 추가 당할 때 사용하는 추상화된 부품

### ConcreteComponent

### Decorator

장식할 대상을 알고 있는 장식자

### ConcreteDecorator

## 사용 이유

### 투과적인 인터페이스

장식(데코레이터)를 사용해도 내용 API는 사라지지 않음

### 내용물을 바꾸지 않고 기능 추가

위임 패턴을 사용하므로 기능 변경하지 안해도 사용 가능

### 동적으로 기능 추가

### 다양한 기능 추가

## 관련 패턴

### Adapter 패턴

다른 API 연결을 위해 사용

### Strategy 패턴

### Composite 패턴

동일한 API를 중첩해서 사용
