package tisjava.array;

/*
문제 14. 2차원 배열 합계와 평균
다음 2차원 배열의 전체 합과 평균을 구하세요.

int[][] scores = {
    {90, 85},
    {88, 92, 79},
    {100, 95, 80, 70}
};

출력 예시:
총합: 779
평균: 86.556
*/

public class Q02_ArraySumAverage {
    public static void main(String[] args) {
        int[][] scores = {
            {90, 85},
            {88, 92, 79},
            {100, 95, 80, 70}
        };

        int count = 0;
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                count++;
            }
        }

        avg = (double) sum / count;

        System.out.printf("총합: %d\n", sum);
        System.out.printf("평균: %.3f\n", avg);
    }
}
