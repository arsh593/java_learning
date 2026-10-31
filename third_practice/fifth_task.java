import java.util.Scanner;

public class fifth_task {
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

        int[] parameters = readParameters(scanner);

        if (parameters[0] == 0) {
            return false;
        }

        long area = calculateArea(parameters);
        showResult(area);

        return true;
    }

    public static boolean checkSide(int side) {

        if (side > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] readParameters(Scanner scanner) {

        int[] parameters = new int[2];
        System.out.print("Введите длину (0 - выход из программы): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка: длина должна быть целым числом. Повторите ввод: ");
            scanner.next();
        }

        int length = scanner.nextInt();

        while (!checkSide(length)) {
            if (length == 0) {
                return parameters;
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

        while (!checkSide(width)) {
            if (width == 0) {
                return parameters;
            }

            System.out.print("Ошибка: ширина должна быть больше нуля. Повторите ввод: ");
            if (scanner.hasNextInt()) {
                width = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Нужно ввести целое число");
            }
        }

        parameters[0] = length;
        parameters[1] = width;

        return parameters;
    }

    public static long calculateArea(int[] parametrs) {
        long area = parametrs[0];
        area = area * parametrs[1];

        return area;
    }

    public static void showResult(long area) {
        System.out.println("Площадь прямоугольника: " + area + " см**2");
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
