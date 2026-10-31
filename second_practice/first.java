import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка, нужно ввести число");
            return;
        }

        int N = scanner.nextInt();
        double sum = 0;

        for (int n = 2; n <= N; n = n + 1) {
            sum += 1.0 / (n * n - 1);
        }
        System.out.println("Сумма ряда равна " + sum);
    }
}