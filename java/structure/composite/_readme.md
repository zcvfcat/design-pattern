# Composite

- 컴포넌트를 재귀적으로 만드는 구조
  - 디렉토리 - 파일

## ROLE

### Leaf (잎) - File

안에 들어갈 내용물

### Composite (복합체) - Directory

Leaf나 Composite를 넣을 수 있는 공간

### Component - Entry

Leaf역과 Composite역을 동일시 하기 위한 역활

### Client

## 사용 이유

### 복수와 단수 동일

여러 개를 모아서 하나의 것으로 취급

### add역은 어디에 두어야할 것인가?

자식을 조작하는 Composite역에서 정의

### 재귀적인 구조는 모든 곳에서 나옴

## 관련 패턴

### Command 패턴

매크로 명령을 만들때 Composite 패턴 사용

### Visitor 패턴

Composite들을 돌아다니며 처리

### Decorator 패턴
