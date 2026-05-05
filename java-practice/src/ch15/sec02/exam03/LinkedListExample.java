package ch15.sec02.exam03;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
  public static void main(String[] args) {
    List<Board> boards = new LinkedList<>();

    boards.add(new Board("제목1", "본문1", "작성자1"));
    boards.add(new Board("제목2", "본문2", "작성자2"));
    boards.add(new Board("제목3", "본문3", "작성자3"));
    boards.add(new Board("제목4", "본문4", "작성자4"));
    boards.add(new Board("제목5", "본문5", "작성자5"));

    System.out.println("게시글 수: " + boards.size());
    System.out.println();

    Board board = boards.get(2);
    System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getContent());
    System.out.println();

    for(int i = 0; i < boards.size(); i++) {
      Board b = boards.get(i);
      System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getContent());
    }
    System.out.println();

    boards.remove(2);
    boards.remove(2);

    for (Board b : boards) {
      System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getContent());
    }
  }
}
