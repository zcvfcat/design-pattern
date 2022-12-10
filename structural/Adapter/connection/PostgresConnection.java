package structural.Adapter.connection;

import structural.Adapter.Adapter;

public class PostgresConnection implements Adapter<Connection> {

  @Override
  public Connection request() {
    return new Connection() {
      final String url = "postgres://localhost:3336";
      final String host = "localhost";
      final String port = "3336";
      final String user = "zcvfcat";
      final String password = "0000";

      @Override
      public String getUrl() {
        return this.url;
      }
    };
  }

}
