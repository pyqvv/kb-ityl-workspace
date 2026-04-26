package polymorphism.wheeler;

public class Prob {
  public static void main(String[] args) {
    Truck truck = new Truck("트럭", 0, 4);
    Bike bike = new Bike("자전거", 0, 2);

    truck.printWheel();
    bike.printWheel();

    truck.speedUp(20);
    bike.speedUp(25);

    truck.speedDown(15);
    bike.speedDown(20);

    truck.stop();
    bike.stop();

    truck.speedUp(10);
  }
}
