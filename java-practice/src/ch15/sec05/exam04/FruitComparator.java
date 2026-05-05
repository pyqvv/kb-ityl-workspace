package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
  @Override
  public int compare(Fruit f1, Fruit f2) {
    return f1.getPrice() - f2.getPrice();
  }
}
