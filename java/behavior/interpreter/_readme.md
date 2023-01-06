# interpreter

- 미니 언어를 이해하고 해석하여 프로그램을 실행

## ROLE

### AbstractExpression 추상 표현 - Node

### TerminalExpression 종단 표현 - primitiveCommandNode

### NonterminalExpression 비종단 표현 - ProgramNode, CommandNode, Repeat-CommandNode, CommandListNode

### Context 문맥, 전후 관계 - Context

인터프리터가 구문 해석하기 위한 정보를 제공

## 사용 이유

### 미니 언어

- 정규 표현
- 구문 검색
  - 구글 검색시 사용되는 옵션들
- 일괄 처리 언어

### 건너뛸 것인가 읽을 것인가?

인터프리터를 사용할 때, 어디까지 읽었는지, 어디까지 토큰을 읽어야하는지 알고 있어야함

## 관련 패턴

### Composite 패턴

NonterminalExpression 역은 재귀적인 구조를 갖는 경우가 많기 때문에 Composite 패턴을 사용하여 표현 되는 경우가 많음

### Flyweight 패턴

TerminalExpression 역은 Flyweight 패턴을 사용해 공유되는 경우가 많음
