public class MyImpl implements MyAPI {

  private boolean theThing;

  public MyImpl() {
    theThing = false;
  }

  public void doTheThing() {
    theThing = true;
  }

  public void undoTheThing() {
    theThing = false;
  }

  public boolean isTheThingDone() {
    return theThing;
  }
}
