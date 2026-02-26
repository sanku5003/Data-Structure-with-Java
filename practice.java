
import java.util.Scanner;


public class practice {
    public static float simpleInterest(float p , float r , float t){
        float simpleInterest = (p * r * t)/100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principle value : ");
        float p = sc.nextFloat();
        System.out.println("enter rate");
        float r = sc.nextFloat();
        System.out.println("Enter Time");
        float t = sc.nextFloat();

        float simpleInterest = simpleInterest(p, r, t);

        System.out.println(simpleInterest);

    }


}