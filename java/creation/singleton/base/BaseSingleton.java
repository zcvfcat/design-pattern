package creation.singleton.base;

public class BaseSingleton {

  private static BaseSingleton instance = null; // 1. 데이터 메모리에서 공유 객체

  private BaseSingleton() { // 2. 외부 생성자 막기
  }

  public static BaseSingleton getInstance() { // 외부에서 객체 가져오기
    if (instance == null) {
      BaseSingleton.instance = new BaseSingleton();
    }
    return instance;
  }
}