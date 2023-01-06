# Proxy

- 객체가 바쁠 경우, 대리인 객체가 일을 처리

## ROLE

### Subject (본인)

Proxy와 RealSubject를 동일시하기 위한 인터페이스를 정의

Subject 덕분에 client는 realSubject의 차이를 의식할 필요가 없음

### Proxy (대리인)

Client의 요청을 최대한 처리

### RealSubject (실제 본인)

대리인 Proxy만으로 감당할 수 없을 때 등장

### Client (의뢰인)

## 사용 이유

### 대리인을 사용해 속도 올리기

- Proxy를 사용함으로써 가벼운 처리, 무거운 처리(인스턴스 생성, 파일 프린트) 분리 가능

### 대리인과 본인을 나눌 필요가 있을까?

> 필요할 때 사용하면 됨

- Proxy역과 RealSubject 역을 분리함으로써 프로그램을 부품화됨
  - 부품화시, 개별적으로 수정할 수 있음 (divide and conquer)
- ex - 지연 평가에 필요

### 대리와 위임

대리인이 처리할 수 없을 경우 RealSubject에게 맡김
`현실세계에서는 본인이 대리인에게 위임하지만 디자인패턴에서는 반대로 되어있음`

### 투과적이란?

의뢰자는 실제로 Proxy를 사용하든 RealSubject를 사용하든 상관하지 않고 기능을 수행합니다.
Proxy클래스는 투과적이라고 말할 수 있음

### Http 프록시 - 예제

웹 브라우저가 일일이 원격지에 있는 웹서버에 접속해서 페이지를 가져오지 않음
http 프록시가 캐싱해 놓은 페이지를 가져옴
caching한 페이지가 유효기간이 지났을 때 실제 서버에서 가져옴

Client 웹 브라우저, Http 프록시가 Proxy 역, 웹 서버가 RealSubject 역을 맡고 있습니다.

### 다양한 프록시

- virtual Proxy(가상 프록시)
  - 실제 인스턴스가 필요한 시점에서 생성 및 초기화
- remote Proxy(원격 프록시)
  - 네트워크 끝단에 있으면서 자기 옆에 있는 것처럼 호출
  - Java RMI(Remote Method Invocation: 원격 메소드 호출)
- access Proxy(보호 프록시)
  - Access Proxy는 RealSubject 역의 기능에 접근 제한을 설정
  - 메소드 호출을 허가하지만, 나머지는 오류가 되도록 처리하는 프록시

## 관련 패턴

### Adapter

Adapter는 다른 객체 사이를 메우는 역활을 하지만 Proxy와 RealSubject의 인터페이스 다르지 않음

### Decorator

Decorator는 새로운 기능을 추가하는 것이지만 Proxy 패턴의 목적은 본인의 작업을 위임하여 본인에 대한 액세스를 줄이는 것
