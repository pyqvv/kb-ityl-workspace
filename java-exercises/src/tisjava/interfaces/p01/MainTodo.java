package tisjava.interfaces.p01;

interface RemoteControlTodo {
    // TODO 1: powerOn() 선언
    void powerOn();
}

class TVTodo implements RemoteControlTodo {
    // TODO 2: powerOn() 구현
    public void powerOn() {
        System.out.println("TV를 켭니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: 인터페이스 타입으로 TVTodo 객체 사용
        RemoteControlTodo rc = new TVTodo();
        rc.powerOn();
    }
}
