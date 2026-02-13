
public class kadanes {

    public static int kadanes(int a[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            curr_sum += a[i];
            max_sum = Math.max(curr_sum, max_sum);

            if (curr_sum < 0) {
                curr_sum = 0;
            }

        }

        return max_sum;
    }

    public static void main(String[] args) {
        int a[] = {-1, -2, -6, -1, -3};
        int max_sum = kadanes(a);

        System.out.println("max sum is " + max_sum);
    }
}
