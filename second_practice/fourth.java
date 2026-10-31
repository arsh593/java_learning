import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Нужно ввести число");
            return;
        }

        double A = scanner.nextDouble();
        double result = sumPowers(A);

        System.out.println(result);

    }
    public static double sumPowers(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a6 = a2 * a2 * a2;
        return a2 + a4 + a6;
    }
}
