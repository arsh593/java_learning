import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Нужно ввести число");
            return;
        }

        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N должно быть стого больше 0");
            return;
        }

        double sum = 0;
        int sign = 1;

        for (int i = 1; i <= N; i = i + 1) {
            sum = sum + (1 + i / 10.0) * sign;
            sign = sign * (-1);
        }

        System.out.println("Сумма равна: " + sum);
    }
}
