package tisjava.control;

/*
문제 11. for문
1부터 50까지의 정수 중에서 3의 배수의 합을 구하세요.

출력 결과:
3의 배수 합: 408
*/

public class Q03_SumMultiplesOf3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("3의 배수 합: " + sum);
    }
}
