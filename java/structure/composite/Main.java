public class Main {
  public static void main(String[] args) {
    System.out.println("root");
    Directory rootdir = new Directory("root");
    Directory bindir = new Directory("bin");
    Directory tmpdir = new Directory("tmp");
    Directory usrdir = new Directory("usr");

    rootdir.add(bindir);
    rootdir.add(tmpdir);
    rootdir.add(usrdir);
    bindir.add(new File("vi", 100000));
    bindir.add(new File("latex", 20000));
    rootdir.printList();
    System.out.println();
  }
}
