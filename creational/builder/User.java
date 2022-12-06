package creational.builder;

public class User {
  public static void main(String[] args) {
    House house = new House.Builder().setTitle("우주정거장").setRoom(4).setSize(100).build();
    System.out.println("title : " + house.title);
    System.out.println("room : " + house.room);
    System.out.println("size : " + house.size);
  }
}
