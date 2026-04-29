package tisjava.oop.p09;

import java.util.Scanner;

class ScoreManagerTodo {
    int[] scores;

    // TODO 1: setStudentCount(int count)
    void setStudentCount(int count) {
        scores = new int[count];
    }

    // TODO 2: inputScores(Scanner sc)
    void inputScores(Scanner sc) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]> ", i);
            scores[i] = Integer.parseInt(sc.nextLine());
        }
    }

    // TODO 3: printScores()
    void printScores() {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]: %d\n", i, scores[i]);
        }
    }

    // TODO 4: analyze()
    void analyze() {
        int bestScore = 0;
        int scoreSum = 0;
        double avgScore;

        for (int score : scores) {
            if (bestScore < score) {
                bestScore = score;
            }
            scoreSum += score;
        }
        avgScore = (double) scoreSum / scores.length;

        System.out.printf("최고 점수: %d\n", bestScore);
        System.out.printf("평균 점수: %.1f\n", avgScore);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: ScoreManagerTodo와 Scanner를 이용한 메뉴형 프로그램 작성
        Scanner scanner = new Scanner(System.in);
        ScoreManagerTodo scoreManager = new ScoreManagerTodo();

        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------");

            System.out.print("선택> ");
            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1 -> {
                    System.out.print("학생수> ");
                    int studentCount = Integer.parseInt(scanner.nextLine());
                    scoreManager.setStudentCount(studentCount);
                }
                case 2 -> scoreManager.inputScores(scanner);
                case 3 -> scoreManager.printScores();
                case 4 -> scoreManager.analyze();
                case 5 -> run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
