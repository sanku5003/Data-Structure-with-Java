import java.util.*;

public class decToBin {
    public static int decToBin(int n) {
        int myNum = n;
        int bin = 0;
        int  pow = 0;
        while(n > 0){
            int rem = n%2;
            bin = bin + rem*(int)(Math.pow(10, pow));
            pow++;
            n = n/2;
            
        }
        System.out.println("binary of " + "" + myNum + " " + "is" + " " + bin);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        decToBin(n);
    }
}
