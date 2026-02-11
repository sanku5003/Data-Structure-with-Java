
import java.util.Scanner;


public class binToDec{
    public static int binToDec(int n){
        int myNum = n;
        int pow = 0;
        int dec = 0;

        while(n > 0){
            int lastDigit = n%10;
            dec = dec + lastDigit*(int)(Math.pow(2 , pow));
            pow++;
            n = n/10;
        }

        System.out.println("the decimal of " + "" + myNum + "is" + dec);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        binToDec(n);
    }
}

