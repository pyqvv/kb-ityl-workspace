package polymorphism.wheeler;

public class Bike extends Wheeler {
  Bike(String carName, int velocity, int wheelNumber) {
    super(carName, velocity, wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    velocity += speed;
    if (velocity > 40) {
      velocity = 40;
    }
    printVelocity();
  }

  @Override
  public void speedDown(int speed) {
    velocity -= speed;
    if (velocity < 10) {
      velocity = 10;
      System.out.println(carName + "의 최저속도위반으로 속도를 10으로 올립니다.");
    }
  }
}
