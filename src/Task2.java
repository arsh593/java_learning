import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычисление функции y = 4x^3 + 23x - 55.");
        System.out.print("Введите x: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число.");
            return;
        }
        double x = scanner.nextDouble();

        double y = 4 * x * x * x + 23 * x - 55;
        System.out.println("y = " + y);
    }
}
