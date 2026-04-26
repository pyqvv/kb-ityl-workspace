package polymorphism.wheeler;

public abstract class Wheeler {
 protected int velocity;
 protected String carName;
 protected int wheelNumber;
 
 abstract public void speedUp(int speed);
 abstract public void speedDown(int speed);

  Wheeler(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  void printWheel() {
    System.out.println(carName + " : 바퀴 " + wheelNumber + "개입니다.");
  }

  void printVelocity() {
    System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
  }

  public void stop(){
	 velocity = 0;
	 System.out.println("정지상태로 속도를 0으로 초기화합니다.");
 }
}

