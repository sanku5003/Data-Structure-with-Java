public class prefixSum{
    public static int prefixSum(int a[]){
        int currSum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        for(int i = 1 ; i< a.length ; i++){
            prefix[i] = prefix[i-1] + a[i];
        }

        for(int i = 0 ; i<a.length ; i++){
            int start = i;
            for(int j = i ; j<a.length ; j++){
                int end = j;
                currSum = start==0 ? prefix[start] : prefix[end] -prefix[start - 1];
            }

             if (currSum > max_sum) {
                    max_sum = currSum;
                }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int a[] = {1 , -2 , 6 , -1 , 3};
        int max_sum = prefixSum(a);

        System.out.println("max sum is " + max_sum);
    }
}