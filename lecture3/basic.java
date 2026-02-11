
import java.util.*;

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int a = sc.nextInt();

        if(a % 4 == 0 && a%100 != 0 && a % 400 != 0){
            System.out.println("yes it is a leap year");
        } else {
            System.out.println("not a leap year");
        }

        // int b = sc.nextInt();
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+' -> System.out.println(a + b);
        //     case '-' -> System.out.println(a - b);
        //     case '*' -> System.out.println(a * b);
        //     case '/' -> System.out.println(a / b);
        //     case '%' -> System.out.println(a % b);

        

    }
}
