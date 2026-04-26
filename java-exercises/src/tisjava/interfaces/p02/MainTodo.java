package tisjava.interfaces.p02;

interface SoundableTodo {
    // TODO 1: sound() 선언
    void sound();
}

class CatTodo implements SoundableTodo {
    // TODO 2: sound() 구현
    public void sound() {
        System.out.println("야옹");
    }
}

class DogTodo implements SoundableTodo {
    // TODO 3: sound() 구현
    public void sound() {
        System.out.println("멍멍");
    }
}

public class MainTodo {
    static void printSound(SoundableTodo soundable) {
        // TODO 4: sound 결과 출력
        soundable.sound();
    }

    public static void main(String[] args) {
        // TODO 5: 고양이/강아지 출력
        SoundableTodo cat = new CatTodo();
        SoundableTodo dog = new DogTodo();

        printSound(cat);
        printSound(dog);
    }
}
