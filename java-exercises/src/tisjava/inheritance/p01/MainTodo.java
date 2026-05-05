package tisjava.inheritance.p01;

class ParentTodo {
    // TODO 1: name 필드 선언
    String name;
}

class ChildTodo extends ParentTodo {
    // TODO 2: age 필드 선언
    int age;
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체를 생성하고 부모/자식 필드 출력
        ChildTodo child = new ChildTodo();
        child.name = "홍길동";
        child.age = 20;
        System.out.println(child.name + ": " + child.age);
    }
}
