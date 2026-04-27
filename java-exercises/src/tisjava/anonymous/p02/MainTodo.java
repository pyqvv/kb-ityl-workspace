package tisjava.anonymous.p02;

interface VehicleTodo {
    // TODO 1: run 선언
    void run();
}

class AnonymousTodo {
    // TODO 2: field에 익명 구현 객체 대입
    private VehicleTodo vt1 = new VehicleTodo() {
        @Override
        public void run() {
            System.out.println("필드에서 익명 구현 객체 실행");
        }
    };

    void method1() {
        vt1.run();
    }

    void method2() {
        // TODO 3: localVar에 익명 구현 객체 대입 후 run 호출
        VehicleTodo vt2 = new VehicleTodo() {
            @Override
            public void run() {
                System.out.println("로컬 변수에서 익명 구현 객체 실행");
            }
        };
        vt2.run();
    }

    void method3(VehicleTodo v) {
        v.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 필드, method1, method2(익명객체) 실행
        AnonymousTodo at = new AnonymousTodo();
        at.method1();
        at.method2();
        at.method3(new VehicleTodo() {
            @Override
            public void run() {
                System.out.println("매개변수로 전달된 익명 구현 객체 실행");
            }
        });
    }
}
