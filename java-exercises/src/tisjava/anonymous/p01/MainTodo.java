package tisjava.anonymous.p01;

interface ActionTodo {
    // TODO 1: work 선언
    void work();
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 익명 구현 객체 생성 후 work 호출
        ActionTodo at = new ActionTodo() {
            @Override
            public void work() {
                System.out.println("익명 객체로 work() 실행 중입니다.");
            }
        };

        at.work();
    }
}
