import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {
  private String name;
  private List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getSize() {
    int size = 0;
    for (Entry entry : directory) {
      size += entry.getSize();
    }
    return size;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public Iterator<Entry> iterator() {
    return directory.iterator();
  }
}
