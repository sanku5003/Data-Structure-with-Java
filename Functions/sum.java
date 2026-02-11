
import java.util.Scanner;

//sum of two no using function

public class sum {
    public static int sum(int a , int b) {
            return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No:");
        int a = sc.nextInt();
        System.out.print("Enter Second No:");
        int b = sc.nextInt();

        int sum = sum(a , b);
        System.out.println("sum of" + a + "and" + b + "is" + sum);
    }
}