package programmer.level1.complete;

public class Avg {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        solution(array);
    }

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int a:arr) {
            sum += a;
        }
        return sum / arr.length;
    }
}
