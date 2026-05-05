package tisjava.ch11_exception.p02;

public class MainTodo {
    public static void main(String[] args) {
        String s = "abc";
        // TODO 1: Integer.parseInt(s) 예외 처리
        try {
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력값입니다.");
        } catch (Exception e) {
            System.out.println("예외 발생");
        }
    }
}
