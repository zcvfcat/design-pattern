# visitor

- 데이터 구조와 처리를 분리

## ROLE

### Visitor

방문했을때 사용할 API 선언

### ConcreteVisitor - ConcreteElement

### Element - Element

방문자를 받아들이는 API 선언

### ConcreteElement - File, Directory

### ObjectStructure - Directory

각각의 Element를 처리 할 수 있는 구조

## 사용 이유

### 왜 이렇게 복잡하게 설정하는 것인가?

- `처리를 데이터 구조와 분리`
- 컴포넌트의 독립성을 높여줌

### OPEN-CLOSE 법칙

> 확장에는 열려있고 수정에는 닫혀있다.

- 기존 클래스를 수정하지 않고 확장할 수 있게 하는 것을 visitor 패턴이 제공
- 다양한 visitor 패턴으로 클래스 사용

### ConcreteVisitor 역활 추가는 쉬움

- ConcreteElement를 수정할 필요가 없음

### ConcreteElement 역활 추가는 어려움

- ConcreteVisitor를 수정해야함

## 관련 패턴

### Iterator 패턴

Visitor 패턴은 데이터 구조가 가진 요소에 특정한 처리를 하는데 있음

### Composite 패턴

### Interpreter 패턴

구문 트리를 만든 후 구문 트리의 각 노드를 순회하면서 처리하는 경우 visitor 패턴 사용 가능
