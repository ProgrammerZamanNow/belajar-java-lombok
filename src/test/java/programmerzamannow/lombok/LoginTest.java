package programmerzamannow.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

  @Test
  void testCreate() {

    var login1 = Login.createEmpty();

    Assertions.assertNull(login1.getUsername());
    Assertions.assertNull(login1.getPassword());

    var login2 = Login.create("eko", "rahasia");

    Assertions.assertEquals("eko", login2.getUsername());
    Assertions.assertEquals("rahasia", login2.getPassword());

  }

  @Test
  void testToString() {

    var login = Login.create("eko", "rahasia");
    System.out.println(login);

  }
}
