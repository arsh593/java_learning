import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = 1; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }

    }
}
