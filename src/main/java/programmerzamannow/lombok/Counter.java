package programmerzamannow.lombok;

import lombok.Synchronized;

public class Counter {

  private final Object counterLock = new Object();

  private Long counter = 0L;

  @Synchronized(value = "counterLock")
  public void increment() {
    counter = counter + 1;
  }

  @Synchronized(value = "counterLock")
  public Long getCounter() {
    return counter;
  }

}
