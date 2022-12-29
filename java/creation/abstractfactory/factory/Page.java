package creation.abstractfactory.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
  protected String title;
  protected String author;
  protected List<Item> content = new ArrayList<>();

  public Page(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void add(Item item) {
    content.add(item);
  }

  public abstract String makeHTML();

  public void output(String filename) {
    try {
      Files.writeString(Path.of(filename),
          makeHTML(),
          StandardOpenOption.CREATE,
          StandardOpenOption.TRUNCATE_EXISTING,
          StandardOpenOption.WRITE);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
