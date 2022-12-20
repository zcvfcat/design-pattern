package behavior.iterator;

import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around the"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy"));

    Iterator<Book> it = bookShelf.iterator(); // 명시적으로 iterator 사용

    while (it.hasNext()) {
      Book book = it.next();
      System.out.println(book.getName());
    }
    System.out.println();

    for (Book book : bookShelf) { // 확장 for문 사용, for 문 뒤에는 iterator 패턴이 사용됨
      System.out.println(book.getName());
    }
    System.out.println();

  }
}
