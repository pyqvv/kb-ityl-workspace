package polymorphism.factory;

public class FactoryExample {

	public static void main(String[] args) {
		CarFactory CarABC = new CarFactory("CarABC", 7, 21);
		CarFactory CarXYZ = new CarFactory("CarXYZ", 8, 19);
		TVFactory TVABC = new TVFactory("TVABC", 8, 17);
		TVFactory TVXYZ = new TVFactory("TVXYZ", 9, 18);

		FactoryExample ex = new FactoryExample();
		ex.getResult(CarABC, 'A', CarXYZ);
		ex.getResult(CarXYZ, 'B', CarABC);
		ex.getResult(TVABC, 'A', TVXYZ);
		ex.getResult(TVXYZ, 'B', TVABC);
	}

	public void getResult(Factory mainFactory, char mainFactorySkill, IWorkingTogether partner) {
    System.out.println("* " + mainFactory.getFactoryName() + " 공장의 하루 생산량과 파트너 공장 협력 시 추가 생산량은 다음과 같다.");
    System.out.println("1. 하루 생산량 = " + mainFactory.makeProducts(mainFactorySkill));
    System.out.printf("2. 파트너 공장 [%s] 협력 시 추가 생산량 = %d\n", ((Factory)partner).getFactoryName(), ((IWorkingTogether)mainFactory).workTogether(partner));
    System.out.println("--------------------------------------------------------------");
	}
}
