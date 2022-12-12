package creation.singleton;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.junit.Test;

import creation.singleton.base.BaseSingleton;
import creation.singleton.early.EarlySingleton;
import creation.singleton.lazy.LazySingleton;
import creation.singleton.lock.LockSingleton;
import creation.singleton.sync.SyncSingleton;

public class SingletonTest {

  @Test
  public void baseSingleton() {
    assertEquals(BaseSingleton.getInstance(), BaseSingleton.getInstance());
  }

  @Test
  public void eagarSingleton() {
    assertEquals(EarlySingleton.getInstance(), EarlySingleton.getInstance());
  }

  @Test
  public void lazySingleton() {
    assertEquals(LazySingleton.getInstance(), LazySingleton.getInstance());
  }

  @Test
  public void syncSingleton() {
    assertEquals(SyncSingleton.getInstance(), SyncSingleton.getInstance());
  }

  @Test
  public void lockSingleton() {
    assertEquals(LockSingleton.getInstance(), LockSingleton.getInstance());
  }

  @Test
  public void reflection() throws Exception {
    Class c = Class.forName("creation.singleton.base.BaseSingleton");
    Method m = c.getDeclaredMethod("getInstance", null);
    Object singleton = m.invoke(null, null);

    BaseSingleton baseSingleton = BaseSingleton.getInstance();

    assertEquals(singleton, baseSingleton);
  }
}
