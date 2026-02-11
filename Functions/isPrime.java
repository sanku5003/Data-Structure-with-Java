import java.util.*;

public class isPrime {

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 2) {
            return isPrime;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

    public static void primeInRange(int n){
        for(int i = 2 ; i <= n ; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        // boolean isPrime = isPrime(n);
        // if(isPrime == false) {
        //     System.out.println("No is not prime");
        // } else {
        //     System.out.println("no is prime");
        // }

        primeInRange(n);

    }

}
