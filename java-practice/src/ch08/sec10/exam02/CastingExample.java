package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare();
        // 구현 객체가 인터페이스 타입으로 자동 변환되면,
        // 인터페이스에 선언된 메소드만 사용 가능하다.

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
