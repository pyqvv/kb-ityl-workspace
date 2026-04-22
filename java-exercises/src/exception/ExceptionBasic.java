package exception;

import java.util.Scanner;

public class ExceptionBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String str = scan.nextLine();

        try {
            int result = convert(str);
            System.out.println("변환된 숫자는 " + result + "입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter 키를 누르셨습니다.");
        }
    }

    private static int convert(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(str);
    }
}
