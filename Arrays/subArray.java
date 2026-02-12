
public class subArray {

    public static void subArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + ", ");
                }
                System.out.println("]");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 9, 23, 65, 76, 87, 33};

        subArray(a);
    }
}
