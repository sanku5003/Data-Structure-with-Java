
public class diagonalSum {

    public static int bruteForce(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j || i + j == a.length - 1) {
                    sum += a[i][j];
                }
            }
        }

        return sum;
    }

    public static int optimizedWay(int a[][]) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];

            if (i != a.length - i - 1) {
                sum += a[i][a.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] a = new int[250][250];

        int num = 1;

        for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 250; j++) {
                a[i][j] = num++;
            }
        }
        System.out.println("brute force =" + bruteForce(a));
        System.out.println("optimized way = " + optimizedWay(a));

    }
}
