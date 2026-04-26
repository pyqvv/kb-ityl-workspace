package polymorphism.animal;

public class Dog extends Animal {
  Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance += this.speed * (hours * 0.5);
  }
}
