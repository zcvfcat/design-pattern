package structure.Adapter;

import structure.Adapter.connection.Connection;
import structure.Adapter.connection.MysqlConnection;
import structure.Adapter.connection.PostgresConnection;

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
