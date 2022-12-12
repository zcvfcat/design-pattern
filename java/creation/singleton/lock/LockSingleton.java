package creation.singleton.lock;

public class LockSingleton {
  private static volatile LockSingleton instance = null; // 1. 메인메모리에 저장

  private LockSingleton() { // 2. 외부 생성자 막기
  }

  public static LockSingleton getInstance() { // 외부에서 객체 가져오기
    if (LockSingleton.instance == null) {
      synchronized (LockSingleton.class) {
        LockSingleton.instance = new LockSingleton();
      }
    }
    return instance;
  }
}
