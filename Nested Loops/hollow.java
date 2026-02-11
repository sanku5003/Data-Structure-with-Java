public class hollow {
    public static void main(String[] args) {
        for(int i = 1 ; i <=4 ; i++){
            if(i == 1 || i == 4 ){
                for( int j = 0 ; j <=5 ; j++){
                    System.out.print("*");
                } System.out.println();
            } else {
                System.out.print("*\t\t\t*");
            }
        }
        System.out.println();
    }
}