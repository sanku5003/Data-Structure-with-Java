
public class binarySearch {

    public static int binarySearch(int a[], int key) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10};

        int key = 4;

        int index = binarySearch(a, key);

        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("element found at" + " " + index);
        }
    }
}

