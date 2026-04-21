package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("아이폰", "검정");

        System.out.println("핸드폰 모델: " + sp.model);
        System.out.println("핸드폰 색상: " + sp.color);
    }
}
