# 싱글톤 고찰

## 사용 목적 (usage)

1. 데이터(_공유_) 메모리단에 하나의 인스턴스만 제공
   - ex. 시스템 환경변수(_readonly_), logger, cache

## 기본 구현 방식 (how-to) - [base](base/BaseSingleton.java)

1. 생성자를 막는다 (_private construct_)
2. 클래스함수로 생성자 가져옴(_static method_)

### 개선점 (how-to-improve)

1. 멀티쓰레드의 환경에서 동시접근시 어떻게 해결할 것인가? (_클래스 접근 동기화_) - [sync](sync/SyncSingleton.java)
2. 클래스 동기화된 방식보다 더 좋은 방식이 있는가? (_메소드 안에서 lock_) - [lock](lock/LockSingleton.java)
3. 앱 로드 전, 객체를 생성할 수 있는가? - [early](early/EarlySingleton.java)
4. 싱글톤 사용전 지연 초기화할 수 있는가? - [lazy](lazy/LazySingleton.java)

`추가로` enum으로도 생성가능 - 리플렉션에 안전, 초기화시점이 프로그램 올라갈 때

```java
public enum Singleton {
    INSTANCE
}
```

## 문제점 (problem)

1. eval 사용시 (java에는 eval은 없음)
2. reflection 사용시 (추가 싱글톤 생성됨)
