package tisjava.oop.p05;

class CalculatorTodo {
    // TODO 1: static add(int x, int y) 작성
    static int add(int x, int y) {
        return x + y;
    }

    // TODO 2: static sub(int x, int y) 작성
    static int sub(int x, int y) {
        return x - y;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: 객체 생성 없이 클래스명으로 메소드 호출
        System.out.println("8 + 5 = " + CalculatorTodo.add(8, 5));
        System.out.println("8 - 5 = " + CalculatorTodo.sub(8, 5));
    }
}
