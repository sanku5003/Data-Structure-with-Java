
public class BinCoeff{
    public static int factorial(int n){
        int fact = 1;
        if(n == 1 || n == 0){
            return fact;
        } 

        for(int i =1 ; i <=n ; i++){
            fact *=i;
        }

        return fact;
    } 


    public static int BinCoeff(int n , int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int BinCoeff = n_fact/(r_fact * nmr_fact);

        return BinCoeff;
        
    }

    public static void main(String[] args) {
        int BinCoeff = BinCoeff(5, 3);
        
        System.out.println(BinCoeff);
    }
}