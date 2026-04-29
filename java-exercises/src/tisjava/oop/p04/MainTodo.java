package tisjava.oop.p04;

class PrinterTodo {
    // TODO 1: println(int value)
    int println(int value) {
        return value;
    }
    // TODO 2: println(boolean value)
    boolean println(boolean value) {
        return value;
    }
    // TODO 3: println(double value)
    double println(double value) {
        return value;
    }
    // TODO 4: println(String value)
    String println(String value) {
        return value;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: PrinterTodo 객체 생성 후 네 메소드 호출
        PrinterTodo pt = new PrinterTodo();

        System.out.println(pt.println(10));
        System.out.println(pt.println(true));
        System.out.println(pt.println(5.5));
        System.out.println(pt.println("문자열"));
    }
}
