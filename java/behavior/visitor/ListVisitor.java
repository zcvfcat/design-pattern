public class ListVisitor extends Visitor {

  private String currentdir = "";

  @Override
  public void visit(File file) {
    System.out.println(this.currentdir + "/" + file);
  }

  @Override
  public void visit(Directory directory) {
    System.out.println(this.currentdir + "/" + directory);
    String savedir = currentdir;

    currentdir = currentdir + "/" + directory.getName();

    for (Entry entry : directory) {
      entry.accept(this);
    }
    currentdir = savedir;
  }

}
