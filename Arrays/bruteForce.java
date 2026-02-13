
public class bruteForce {

    public static int bruteForce(int a[]) {
        int currSum ;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += a[k];
                }
                if (currSum > max_sum) {
                    max_sum = currSum;
                }
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int a[] = {1, -2, 6, -1, 3};
        int max_sum = bruteForce(a);

        System.out.println("max sum is " + max_sum);
    }
}
