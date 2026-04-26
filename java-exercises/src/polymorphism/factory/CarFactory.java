package polymorphism.factory;

public class CarFactory extends Factory implements IWorkingTogether {
  CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return ((Factory)partner).makeProducts('B');
  }

  @Override
  int makeProducts(char skill) {
    int skillValue;
    switch (skill) {
      case 'A' -> skillValue = 3;
      case 'B' -> skillValue = 2;
      case 'C' -> skillValue = 1;
      default -> skillValue = 0;
    }
    return skillValue * getWorkingTime();
  }
}
