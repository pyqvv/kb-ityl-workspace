package polymorphism.wheeler;

public class Truck extends Wheeler {
  Truck(String carName, int velocity, int wheelNumber) {
    super(carName, velocity, wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    velocity += speed * 5;
    if (velocity > 100) {
      velocity = 100;
    }
    printVelocity();
  }

  @Override
  public void speedDown(int speed) {
    velocity -= speed * 5;
    if (velocity < 50) {
      velocity = 50;
      System.out.println(carName + "의 최저속도위반으로 속도를 50으로 올립니다.");
    }
  }
}
