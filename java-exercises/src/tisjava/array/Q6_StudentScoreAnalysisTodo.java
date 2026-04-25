package tisjava.array;

import java.util.Scanner;

public class Q6_StudentScoreAnalysisTodo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudent = 0;
        int[] scores = null;
        boolean run = true;

        while(run) {
            System.out.println("--------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------");

            System.out.print("선택>");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1 -> {
                    System.out.print("학생수>");
                    numberOfStudent = Integer.parseInt(sc.nextLine());
                    scores = new int[numberOfStudent];
                }
                case 2 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print((i+1) + "번째 점수 입력: ");
                        scores[i] = Integer.parseInt(sc.nextLine());
                    }
                }
                case 3 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println((i+1) + "번째 점수: " + scores[i]);
                    }
                }
                case 4 -> {
                    int sum = 0;
                    int max = scores[0];
                    double avg = 0.0;

                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    avg = sum / scores.length;

                    System.out.printf("최대값: %d\n", max);
                    System.out.printf("평균: %.1f\n", avg);
                }
                case 5 -> run = false;
            }
        }

        System.out.println("프로그램 종료");
        sc.close();    }
}