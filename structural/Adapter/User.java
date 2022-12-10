package structural.Adapter;

import structural.Adapter.connection.Connection;
import structural.Adapter.connection.MysqlConnection;
import structural.Adapter.connection.PostgresConnection;

public class User {
  public static void main(String[] args) {
    MysqlConnection mysqlConnection = new MysqlConnection();
    PostgresConnection postgresConnection = new PostgresConnection();

    Connection connection1 = mysqlConnection.request();
    Connection connection2 = postgresConnection.request();

    System.out.println(connection1.getUrl());
    System.out.println(connection2.getUrl());
  }
}
