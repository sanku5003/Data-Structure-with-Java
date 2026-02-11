
import java.util.Scanner;

//program to find whether no is prime or not
public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==2){
            System.out.println("No is prime");
        } else {
            for(int i = 2 ; i <=Math.sqrt(n) ; i++){
                if(n % i == 0) {
                    isPrime = false;
                    break;
                } 
            }

            if(isPrime == true){
                System.out.println("No is a prime no ");
            } else {
                System.out.println("No is not a prime no");
            }
        }
    }
}