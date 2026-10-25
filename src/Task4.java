import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа вычисляет площадь прямоугольника.");
        System.out.println("Формула: S = длина * ширина.");
        System.out.println("Стороны вводятся в целых сантиметрах.");

        System.out.print("Введите длину: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: длина должна быть целым числом от 1 до 2147483647.");
            return;
        }
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Ошибка: длина должна быть больше нуля.");
            return;
        }

        System.out.print("Введите ширину: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: ширина должна быть целым числом от 1 до 2147483647.");
            return;
        }
        int width = scanner.nextInt();
        if (width <= 0) {
            System.out.println("Ошибка: ширина должна быть больше нуля.");
            return;
        }

        long area = length;
        area = area * width;

        System.out.println("Площадь прямоугольника: " + area + " см².");
    }
}
