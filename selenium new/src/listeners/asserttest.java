package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttest {
  @Test
  public void f() {
	  Assert.assertNotSame(20, 22);
  }
}
