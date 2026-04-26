package tisjava.interfaces.p07;

interface CalculableTodo {
    // TODO 1: static add(int x, int y) 작성
    static void add(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x+y));
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 인터페이스명으로 add 호출
        CalculableTodo.add(1, 2);
    }
}
