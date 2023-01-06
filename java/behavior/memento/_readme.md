# Memento Pattern

- 캡슐화의 파괴하지 않고 저장과 복원하는 패턴

## ROLE

### Originator 작성자 - Gamer

자신의 상태를 redo, undo 하고 싶을때, Memento를 받아 상태를 변경

### Memento 기념품

Originator의 내부 정보(상태값)을 담음

- wide interface
  - originator는 오브젝트의 상태를 되돌릴 수 있는 정보를 모두 얻을 수 있음
- narrow interface
  - 외부에 상태값의 조작할 수 없도록 정보를 넘겨줌 (caretaker에게 넘김)

### caretaker 관리인

메멘토들을 블랙박스 처럼 보관할 수 있는 역활

## 사용 이유

### 두 개의 인터페이스 (API)와 액세스 제어

접근 제한자를 사용하여 클래스에서 접근 제한을 이용

### Memento를 몇 개 가질까?

다양한 시점에서의 상태를 저장할 수 있음

### Memento의 유효기간

파일로 영속적으로 관리하는 경우에 프로그램 버전이 올라갈 시, 데이터 구조가 안 맞을 수 있음

### caretaker, originator 역활 나누는 이유

caretaker는 어느 시점에 스냅샷을 찍을지 결정, 실행 취소, Memnto를 저장하는 일을 함
originator는 Menmento를 만드는 일, Memento를 사용하여 자신의 상태를 되돌리는 일을 함

## 관련 패턴

### Command

메멘토를 사용하여 실행 취소 및 다시 실행

### prototype

현재 인스턴스와 동일한 상태의 인스턴스를 만들때 사용할 수 있음

### state
