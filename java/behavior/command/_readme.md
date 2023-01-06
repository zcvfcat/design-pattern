# Command

명령(Event)를 분배, 저장, 관리 할 수 있는 인스턴스를 활용하여 제어

## ROLE

### Command (명령)

명령 인터페이스 정의

### ConcreteCommand (구체적인 명령)

### Receiver (수신자)

명령받은 수신자

### Client (의뢰자)

### Invoker (호출자)

## 사용 이유

### 명령이 가져야 하는 정보

Receiver역을 '알고' 있어야함

### 이력의 저장

이력을 인스턴스 파일로 저장해두면 보존됨

## 관련 패턴

### Composite 패턴

매크로 명령을 실행하기 위하 Composite 패턴이 사용될 경우가 있음

### Memento 패턴

Command 역의 이력을 저장할 때 사용될 경우가 있음

### Prototype 패턴

발생한 이벤트를 복제하고자 할 때 사용될 경우가 있음F
