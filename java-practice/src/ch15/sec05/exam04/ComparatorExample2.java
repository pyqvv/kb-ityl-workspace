package ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {
  public static void main(String[] args) {
    TreeSet<Fruit> fruits = new TreeSet<>(new Comparator<Fruit>() {
          @Override
          public int compare(Fruit f1, Fruit f2) {
            return f1.getPrice() - f2.getPrice();
          }
    });

    fruits.add(new Fruit("포도", 3000));
    fruits.add(new Fruit("수박", 10000));
    fruits.add(new Fruit("딸기", 6000));

    for (Fruit fruit : fruits) {
      System.out.println(fruit.getName() + ": " + fruit.getPrice());
    }
  }
}
