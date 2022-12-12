package creation.singleton.early;

public class EarlySingleton {

  private static EarlySingleton instance = new EarlySingleton(); // 데이터 메모리에서 공유 객체 // 사용 안할 시 불필요한 메모리 생성

  private EarlySingleton() { // 외부 생성자 막기
  }

  public static EarlySingleton getInstance() { // 메소드 동기화시 클래스 락 걸림 <- 사용 X
    return instance;
  }
}