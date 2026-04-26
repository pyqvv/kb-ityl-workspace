package polymorphism.animal;

public class Chicken extends Animal implements Cheatable {
  Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance += this.speed * hours;
  }

  @Override
  public void fly() {
    this.speed *= 2;
  }
}
