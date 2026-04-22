package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        Computer co = new Computer();

        int radius = 10;

        System.out.println("원 면적: " + ca.areaCircle(radius));
        System.out.println("원 면적: " + co.areaCircle(radius));
    }
}
