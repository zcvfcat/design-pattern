# iterator

`집합체`에서, 요소를 순서대로 가리키며 전체를 검색하고 반복하는것

## ROLE

### Iterator (반복자) - java.util.Iterator

요소를 순서대로 검색하는 인터페이스(API) 역

1. 다음 요소가 존재하는지 hasNext 메소드
2. 다음 요소를 가져오는 next메소드

### ConcreteIterator (구체적인 반복자) - BookShelfIterator

Iterator 인터페이스(API)를 구현한 역

1. 검색에 필요한 정보를 가지고 있어야함
2. 검색 중인 index를 기억해야함

### Aggregate (집합체) - Iterable\<E>

Iterator를 만들어 내는 인터페이스 역

1. 내가 가진 요소를 차례대로 검색해 주는 객체를 만들어내는 메소드

### ConcreteAggregate (구체적인 집합체) - BookShelf

Aggregate가 결정한 인터페이스를 구현하는 역

1. 구체적인 Iterator 역활을 하는 인스턴스를 만들어야함

---

## 사용 이유

### Iterator를 사용 함으로써 구현과 분리를 반복할 수 있기 때문

```java
while (it.hasNext()) {
  Book book = it.next();
  System.out.println(book.getName());
}
```

사용된 것은 hasNext, next Iterator의 메소드일뿐 `while 루프는 BookShelf 구현에 의존 X`

if BookShelf에서 배열로 관리하는 것을 ArrayList로 바꾸었을때 hasNext, next 메소드만 바르게 구현하면:
while 루프는 변경하지 않아도 동작

### _디자인 패턴을 적용함으로써 클래스 재 사용성을 촉진함_

> 클래스를 부품 처럼 사용 가능
> 클래스라는 다른 부품을 수정할 일이 적어짐

## 추상 클래스와 인터페이스를 사용하는 이유

구체적인 클래스만 사용하면 클래스 사이의 결합이 강해짐 - 강 결함

- 클래스를 부품으로 사용시 재사용하기 어려워짐

> `결합을 약하기 하고 재사용하기 쉽게 하기 위해서 추상 클래스나 인터페이스를 도입`  
> **구체적인 클래스로만 프로그래밍을 하는 것이 아니라 _추상 클래스나 인터페이스를 사용하여 프로그래밍을 하는 사고 방식_**

## Aggregate(집합체)와 Iterator의 관계

Aggregate(집합체)가 어떻게 구현되었는지 알 수 있었기 때문에 Iterator가 다음 요소를 호출이 가능하다

> `Iterable<E>, Iterator<E>라는 두개의 인터페이스 짝을 이루듯이 Aggregate와 구체적인 Iterator<E>객체도 짝을 이뤄야함`

## Iterator 분석

### next 메소드

현재 요소를 반환하고 다음위치로 이동

### hasNext 메소드

next 메소드를 호출해도 괜찮은지 알아보는 메소드

### 복수의 Iterator

현재 어디까지 조사했는지 기억하는 구조를 Aggregate 역활 외부에 두기 때문에 여러 개의 Iterator를 가질수 있음

---

## 관련 패턴

### Visitor 패턴

요스가 모여 잇는 내부를 돌아다니며 같은 처리를 반복해서 적용

### Composite 패턴

부품을 재귀적으로 호출
_Iterator 패턴을 적용 못함_

### Factory Method 패턴

Iterator 인스턴스를 만들때 사용 가능
