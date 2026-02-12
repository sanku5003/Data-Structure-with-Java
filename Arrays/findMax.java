public class findMax {
    public static int max(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            if(largest < a[i]){
                largest = a[i];
            }
        }
        return largest;
    }

    public static int min (int a[]){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(minimum > a[i]){
                minimum = a[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        int a[] = { 1 , 2 , 6 , 3, 5};

        int largest = max(a);
        int minimum = min(a);

        System.out.println("maximum in array is " + " " + largest);
        System.out.println("minimum in array is " + " " +minimum);


    }
}