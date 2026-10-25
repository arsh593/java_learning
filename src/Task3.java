import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число.");
            return;
        }
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число.");
            return;
        }
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("Большее число: " + a);
        } else if (b > a) {
            System.out.println("Большее число: " + b);
        } else {
            System.out.println("Числа равны: " + a);
        }
    }
}
