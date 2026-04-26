package polymorphism.factory;

public class TVFactory extends Factory implements IWorkingTogether {
  TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return ((Factory)partner).makeProducts('C');
  }

  @Override
  int makeProducts(char skill) {
    int skillValue;
    switch (skill) {
      case 'A' -> skillValue = 8;
      case 'B' -> skillValue = 5;
      case 'C' -> skillValue = 3;
      default -> skillValue = 1;
    }
    return skillValue * getWorkingTime();
  }
}
