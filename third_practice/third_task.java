
public class third_task {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8};
        double[] result = createB(numbers);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static double[] createB(int[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            double sum = 0;

            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
            }
            b[i] = sum / (a.length - i);
        }
        return b;
    }
}
