package tisjava.inheritance.p07;

class ActivityTodo {
    void onCreate() {
        System.out.println("기본적인 실행 내용");
    }
}

class MainActivityTodo extends ActivityTodo {
    // TODO 1: onCreate() 오버라이딩
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: MainActivityTodo 실행
        MainActivityTodo main = new MainActivityTodo();
        main.onCreate();
    }
}
