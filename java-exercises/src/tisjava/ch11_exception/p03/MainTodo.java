package tisjava.ch11_exception.p03;

public class MainTodo {
    public static void main(String[] args) {
        String s = null;
        // TODO 1: NullPointerException 또는 NumberFormatException을 한 번에 처리
        try {
            int size = s.length();
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("잘못된 입력값입니다.");
        }
    }
}
