package polymorphism.coffeeshop;

public class Tea extends Beverage {
  private static int amount = 0;

  public static int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    Tea.amount = amount;
  }

  public Tea(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  void calcPrice() {
    switch (getName()) {
      case "lemonTea" -> setPrice(1500);
      case "ginsengTea" -> setPrice(2000);
      case "redginsengTea" -> setPrice(2500);
      default -> setPrice(0);
    }
  }
}