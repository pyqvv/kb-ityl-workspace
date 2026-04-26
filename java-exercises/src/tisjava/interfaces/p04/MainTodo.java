package tisjava.interfaces.p04;

interface ATodo {
    // TODO 1: method1 선언
    void method1();
}

class BTodo implements ATodo {
    // TODO 2: method1 구현
    @Override
    public void method1() {
        System.out.println("BTodo의 method1 실행");
    }
}

class CTodo implements ATodo {
    // TODO 3: method1 구현
    @Override
    public void method1() {
        System.out.println("CTodo의 method1 실행");
    }

    // TODO 4: method2 작성
    public void method2() {
        System.out.println("CTodo의 method2 실행");
    }
}

public class MainTodo {
    static void action(ATodo a) {
        // TODO 5: method1 호출, CTodo면 method2 호출
        a.method1();
        if (a instanceof CTodo c) {
            c.method2();
        }
    }

    public static void main(String[] args) {
        // TODO 6: action 호출
        action(new BTodo());
        action(new CTodo());
    }
}
