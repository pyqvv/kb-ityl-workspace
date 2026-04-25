package tisjava.variables;

/*
문제 4. 타입 변환
정수 87을 double 타입으로 변환하여 출력하고,
실수 19.99를 int 타입으로 강제 변환하여 출력하세요.

출력 예시:
scoreDouble: 87.0
priceInt: 19
*/

public class Q02_TypeCasting {
    public static void main(String[] args) {
        int score = 87;
        double price = 19.99;

        System.out.printf("scoreDouble: %.1f\n", (double)score);
        System.out.printf("priceDouble: %d\n", (int)price);
    }
}
