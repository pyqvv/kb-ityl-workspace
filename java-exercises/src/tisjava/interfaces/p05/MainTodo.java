package tisjava.interfaces.p05;

interface PlayableTodo {
    // TODO 1: play 선언
    void play();
}

class MusicTodo implements PlayableTodo {
    // TODO 2: play 구현
    public void play(){
        System.out.println("Music is playing");
    }
}

class MovieTodo implements PlayableTodo {
    // TODO 3: play 구현
    public void play(){
        System.out.println("Movie is playing");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 인터페이스 배열로 저장 후 반복
        PlayableTodo[] playableTodos = new PlayableTodo[2];

        playableTodos[0] = new MusicTodo();
        playableTodos[1] = new MovieTodo();

        for(PlayableTodo p : playableTodos) {
            p.play();
        }
    }
}
