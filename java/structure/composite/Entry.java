public abstract class Entry {
  public abstract String getName();

  public abstract int getSize();

  protected abstract void printList(String prefix);

  public void printList() {
    printList("");
  }

  @Override
  public String toString() {
    return getName() + " ( " + getSize() + " ) ";
  }
}
