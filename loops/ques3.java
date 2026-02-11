//factorial of a number 

import java.util.Scanner;


public class ques3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long fact = 1;

        if (n == 0 || n == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }

        }

        System.out.println(fact);
    }
}
