
public class linearSearchIn2D {

    public static  boolean linearSearch(int a[][], int key) {

        for (int[] a1 : a) {
            for (int j = 0; j < a[0].length; j++) {
                if (key == a1[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int key = 12;

        if (linearSearch(a, key) == true) {
            System.out.println("present");
        } else {
            System.out.println("not found");
        }
    }
}
