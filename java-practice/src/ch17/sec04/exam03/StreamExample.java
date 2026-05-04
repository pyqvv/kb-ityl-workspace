package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
  public static int sum;

  public static void main(String[] args) {
    sum = IntStream.rangeClosed(1, 100).sum();

    System.out.println("총합: " + sum);
  }
}
