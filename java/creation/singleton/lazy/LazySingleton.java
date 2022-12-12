package creation.singleton.lazy;

public class LazySingleton {

  private LazySingleton() { // 외부 생성자 막기
  }

  private static class SingletonHolder {
    private static final LazySingleton instance = new LazySingleton();
  }

  public static LazySingleton getInstance() {
    return SingletonHolder.instance; // 함수가 호출되기 전까지 instance 생성 X
  }
}