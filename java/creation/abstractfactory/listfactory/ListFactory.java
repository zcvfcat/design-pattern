package creation.abstractfactory.listfactory;

import creation.abstractfactory.factory.Factory;
import creation.abstractfactory.factory.Link;
import creation.abstractfactory.factory.Page;
import creation.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }

}
