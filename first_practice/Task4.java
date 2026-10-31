import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("3 - Выполнить расчёт");
            System.out.println("2 - Информация о рзработчике");
            System.out.println("1 - Информация о программе");
            System.out.println("0 - Выход");
            System.out.print("Выберите пункт: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Нужно ввести целый номер пункта. Повторите ввод: ");
                scanner.next();
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                showInfo();
            } else if (choice == 2) {
                showDeveloper();
            } else if (choice == 3) {
                boolean continueProgram = runCalculation(scanner);
                if (!continueProgram) {
                    break;
                }
            } else {
                System.out.println("Нет такого пункта");
            }
        }
    }
    public static boolean runCalculation(Scanner scanner) {
        System.out.print("Введите длину (0 - выход из программы): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка: длина должна быть целым числом. Повторите ввод: ");
            scanner.next();
        }

        int length = scanner.nextInt();

        while (length <= 0) {
            if (length == 0) {
                return false;
            }

            System.out.print("Ошибка: длина должна быть больше нуля. Повторите ввод: ");
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Нужно ввести целое число");
            }
        }

        System.out.print("Введите ширину (0 - выход из программы): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка: ширина должна быть целым числом. Повторите ввод: ");
            scanner.next();
        }

        int width = scanner.nextInt();

        while (width <= 0) {
            if (width == 0) {
                return false;
            }

            System.out.print("Ошибка: ширина должна быть больше нуля. Повторите ввод: ");
            if (scanner.hasNextInt()) {
                width = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Нужно ввести целое число");
            }
        }

        long area = length;
        area = area * width;

        System.out.println("Площадь прямоугольника: " + area + " см**2.");
        return true;
    }

    public static void showInfo() {
        System.out.println("Программа вычисляет площадь прямоугольника.");
        System.out.println("Формула: S = длина * ширина.");
        System.out.println("Стороны вводятся в целых сантиметрах.");
    }
    public static void showDeveloper() {
        System.out.println("Разработчик: Артём Шалыминов");
    }
}
