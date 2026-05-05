package tisjava.ch07_inheritance.p03;

class AnimalTodo {
    // TODO 1: run() 작성
    void run(){
        System.out.println("동물이 달립니다.");
    }
}

class DogTodo extends AnimalTodo {
    // TODO 2: run() 오버라이딩
    @Override
    void run(){
        System.out.println("개가 달립니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: DogTodo 객체 생성 후 run 호출
        DogTodo dog = new DogTodo();
        dog.run();
    }
}
