package tisjava.ch07_inheritance.p08;

class BaseTodo {
    // TODO 1: final showInfo() 작성
    final void showInfo(){
        System.out.println("final showInfo() 실행");
    }
}

class SubTodo extends BaseTodo {
    // TODO 2: extra() 작성
    void extra(){
        System.out.println("extra() 실행");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: showInfo와 extra 호출
        SubTodo sub = new SubTodo();
        sub.showInfo();
        sub.extra();
    }
}
