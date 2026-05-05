package tisjava.ch11_exception.p05;

class CalcTodo {
    // TODO 1: divide(int a, int b)를 작성하세요.
    // throws ArithmeticException
    void divide(int a, int b) throws ArithmeticException {
        System.out.println(a + " / " + b + " = " + a / b);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: divide 호출
        CalcTodo calcTodo = new CalcTodo();

        try {
            calcTodo.divide(20, 5);
            calcTodo.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
