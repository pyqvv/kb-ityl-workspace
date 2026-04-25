package tisjava.array;

/*
문제 13. 배열 최대값
다음 배열에서 가장 큰 값을 찾아 출력하세요.
int[] scores = {88, 76, 92, 100, 65, 89};

출력 결과:
최대값: 100
*/

public class Q01_ArrayMax {
    public static void main(String[] args) {
        int[] scores = {88, 76, 92, 100, 65, 89};

        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("최대값: " + max);
    }
}
