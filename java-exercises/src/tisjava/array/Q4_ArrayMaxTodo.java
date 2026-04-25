package tisjava.array;

public class Q4_ArrayMaxTodo {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };
        int max = array[0];

        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }

        System.out.println("최대값: " + max);
    }
}
