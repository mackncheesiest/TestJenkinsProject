import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyTest {

  private MyAPI myAPI;

  @Test
  public void testTheThingCanBeDone() {
    myAPI = new MyImpl();
    myAPI.doTheThing();
    assertThat("the thing should be done", myAPI.isTheThingDone(), is(true));
  }

  @Test
  public void testTheThingCanBeUndone() {
    myAPI = new MyImpl();
    myAPI.doTheThing();
    myAPI.undoTheThing();
    assertThat("the thing should be undone", myAPI.isTheThingDone(), is(false));
  }

}
