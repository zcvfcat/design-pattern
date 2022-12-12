package creation.singleton.sync;

public class SyncSingleton {

  private static SyncSingleton instance = null; // 데이터 메모리에서 공유 객체

  private SyncSingleton() { // 외부 생성자 막기
  }

  public static synchronized SyncSingleton getInstance() { // 메소드 동기화시 클래스 락 걸림 <- 사용 X
    if (instance == null) {
      SyncSingleton.instance = new SyncSingleton();
    }
    return instance;
  }
}