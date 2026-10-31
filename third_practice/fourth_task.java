public class fourth_task {
    public static void main(String[] arg) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < a[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a.length; j++) {
                    System.out.println(a[j][i]);
                }
            } else {
                for (int j = a.length - 1; j >= 0; j = j - 1) {
                    System.out.println(a[j][i]);
                }
            }
        }
    }
}
