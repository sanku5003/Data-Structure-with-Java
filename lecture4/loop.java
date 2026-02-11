public class loop {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
       
        // int sum = 0;

        // while(counter < 100) {
        //     System.out.println("hello world");
        // }
        // System.out.println("enter no");
       

        // while(counter <= n){
        //     sum+=counter;
        //     System.out.println(sum);
        //     counter++;
        
        // for(int i = 0 ; i<=n ; i++){
        //     sum+=i;
        //     System.out.println(sum);
        // }
        //print reverse of a number

        int n = 10899;

        while(n>10){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n=n/10;
            
        }
        System.out.println();
    }

}