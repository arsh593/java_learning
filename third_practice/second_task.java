import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N(размер массива): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка, нужно ввести целое число. Повторите ввод: ");
            scanner.next();
        }
        int N = scanner.nextInt();

        while (N <= 0) {
            System.out.println("Ошибка: N должно быть больше 0. Повторите ввод: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Нужно ввести целое число");
            }
        }

        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите элемент: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно ввести целое число. Повторите ввод: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count = count + 1;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}