package ch06.exam;

import java.util.Scanner;

public class Input {
  static Scanner sc = new Scanner(System.in);

  public static String read(String title) {
    System.out.print(title);
    return sc.nextLine();
  }

  public static String read(String title, String defaultValue) {
    System.out.printf("%s(%s): ", title, defaultValue);
    String answer = sc.nextLine();
    return answer.isEmpty() ? defaultValue : answer;
  }

  public static int readInt(String title) {
    System.out.print(title);
    return Integer.parseInt(sc.nextLine());
  }

  public static boolean confirm(String title, boolean defaultValue) {
    System.out.printf("%s (%s): ", title, defaultValue ? "Y/n": "y/N");
    String answer = sc.nextLine();
    if (answer.isEmpty()) return defaultValue;
    return answer.equals("y");
  }

  public static boolean confirm(String title) {
    return confirm(title, true);
  }
}
