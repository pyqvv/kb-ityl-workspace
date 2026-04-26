package polymorphism.animal;

public abstract class Animal {
  int speed;
  double distance;

  Animal(int speed) {
    this.speed = speed;
    this.distance = 0.0;
  }

  abstract void run(int hours);

  double getDistance() {
    return distance;
  }
}
