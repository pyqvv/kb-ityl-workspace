package polymorphism.coffeeshop;

public class Coffee extends Beverage {
  private static int amount = 0;

  public static int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    Coffee.amount = amount;
  }

  Coffee(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  public void calcPrice() {
    switch (getName()) {
      case "Americano" -> setPrice(1500);
      case "CafeLatte" -> setPrice(2500);
      case "Cappuccino" -> setPrice(3000);
      default -> setPrice(0);
    }
  }
}
