package ch06.sec15;

public class Database {
  private static Database database = new Database();

  private Database(){}

  public static Database getInstance(){
    return database;
  }

  private String connection = "MySQL";

  public String connect() {
    System.out.println(connection + "에 연결합니다.");
    return connection;
  }

  public void close() {
    System.out.println(connection + "을 닫습니다.");
  }
}
