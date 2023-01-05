# Singleton Pattern

- 상태 변화를 기술 할 때 효과적

## ROLE

### Subject

현재 상태를 가져오는 API

### ConcreteSubject

### Observer

구독자의 상태를 변경해야겠다는 API

## ConcreteObserver

## 사용 이유

### 교환 가능성

- 추상 클래스나 인터페이스를 사용하여 구상 클래스로부터 추상 메소드 분리
- 인스턴스를 전달할때 클래스형으로 하지 않고 인터페이스형으로 함

### Observer 순서

- update 메소드를 먼저 호출

### Observer의 행위가 Subject에 영향을 줄때

### 갱신을 위한 힌트 정보 다루기

### 관찰하기 보다 전달받기를 기다림

관찰하는 것이 아니라 정확하게 `알려 주는 것`을 수동적으로 기다림

## 관련 패턴

### Mediator
