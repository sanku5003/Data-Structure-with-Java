
public class linearSearch {

    public static int linearSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {23, 54, 6, 76,};
        int key = 6;

        int index =  linearSearch(a, key);

        if(index == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at" + " " + index);
        }
    }
}
