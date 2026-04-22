package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone(); // 추상 클래스는 new 연산자로 객체를 직접 만들지 못함
        SmartPhone smartPhone = new SmartPhone("홍길동"); // 상속을 통해 자식 클래스만 만들 수 있음

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
