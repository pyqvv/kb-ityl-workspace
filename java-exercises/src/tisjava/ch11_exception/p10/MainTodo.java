package tisjava.ch11_exception.p10;

public class MainTodo {
    public static void main(String[] args) {
        String[] data = {"10", "20", "a"};
        // TODO 1: 숫자로 바꿀 수 있는 값만 합산
        // 결과 30 출력
        int total = 0;
        for (String d : data) {
            try {
                total += Integer.parseInt(d);
            } catch (Exception e) {
            }
        }
        System.out.println("결과: " + total);
    }
}
