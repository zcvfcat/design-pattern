package creation.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HTMLBuilder extends Builder {
  private String filename = "untitle.html";
  private StringBuilder sb = new StringBuilder();

  @Override
  public void makeTitle(String title) {
    filename = title + ".html";
    sb.append("<!DOCTYPE html>>\n");
    sb.append("<!DOCTYPE html>>\n");
    sb.append("<!DOCTYPE html>>\n");
    sb.append("<!DOCTYPE html>>\n");
    sb.append("<!DOCTYPE html>>\n");
    sb.append("<!DOCTYPE html>>\n");
  }

  @Override
  public void makeString(String str) {
    sb.append("<p>");
    sb.append(str);
    sb.append("</p>");

  }

  @Override
  public void makeItems(String[] items) {
    sb.append("<ul>\n");
    for (String s : items) {
      sb.append("<li>");
      sb.append(s);
      sb.append("</li>");
    }
  }

  @Override
  public void close() {
    sb.append("</body>");
    sb.append("</html>");
    try {
      Writer writer = new FileWriter(this.filename);
      writer.write(sb.toString());
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getHtmlResult() {
    return filename;
  }
}
