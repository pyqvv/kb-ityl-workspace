package tisjava.ch11_exception.p08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: try-with-resources로 BufferedReader를 생성
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // TODO 2: 한 줄 읽어서 출력
            String line = br.readLine();
            System.out.println(line);
        }
    }
}
