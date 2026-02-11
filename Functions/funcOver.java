//no need to give different name to functions
public class funcOver {
//function to add two integer

    public static int sum(int a, int b) {
        return a + b ;
    }
//function to add three integer

    public static int sum(int a, int b , int c) {
        return a + b + c;
    }

//function to add two float values

 public static float sum(float a, float b ) {
        return a + b ;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = sum(a, b);
        System.out.println("sum of two integer a = 5 and b = 10 is" + sum);

        int c = 15;

        int sumOfThree = sum(a , b , c);
         System.out.println("sum of three integer a = 5 ,b = 10 and c = 15 is" + sumOfThree);

        float d= 5.02f;
        float e = 5.90f;
        
        float flaotSum = sum(d,e);
        System.out.println("sum of two float values is " + flaotSum);

    
    }



}
