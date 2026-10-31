import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка, нужно ввести число");
            return;
        }

        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N должно быть строго больше нуля");
            return;
        }

        int n = 0;
        long result = 0;

        while (N > 0) {
            n = N % 10;
            result = result * 10 + n;
            N = N / 10;
        }

        System.out.println(result);
    }
}
