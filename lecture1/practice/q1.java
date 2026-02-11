
import java.util.*;

//Average of 3 numbers
public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no");
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
