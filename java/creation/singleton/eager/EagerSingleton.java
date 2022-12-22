package creation.singleton.eager;

public class EagerSingleton {

  private static EagerSingleton instance = new EagerSingleton(); // 데이터 메모리에서 공유 객체 // 사용 안할 시 불필요한 메모리 생성

  private EagerSingleton() { // 외부 생성자 막기
  }

  public static EagerSingleton getInstance() { // 메소드 동기화시 클래스 락 걸림 <- 사용 X
    return instance;
  }
}