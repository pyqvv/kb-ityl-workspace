package exception;

import java.util.Scanner;

public class ExceptionRefactored {
    private static final String INPUT_MESSAGE = "숫자로 변환할 문자열을 입력바랍니다.";
    private static final String EMPTY_INPUT_ERROR_MESSAGE = "예외가 발생되었습니다. 문자열을 입력하지 않고 Enter 키를 누르셨습니다.";
    private static final String INVALID_NUMBER_ERROR_MESSAGE = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(INPUT_MESSAGE);
        String str = scan.nextLine();

        try {
            int result = convert(str);
            System.out.println("변환된 숫자는 " + result + "입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(EMPTY_INPUT_ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println(INVALID_NUMBER_ERROR_MESSAGE);
        } finally {
            scan.close();
        }
    }

    private static int convert(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(str);
    }
}
