
public class searchInSortedArray {

    //by using the last col and first low element
    public static boolean searchInSortedArray(int a[][], int key) {
        int row = 0;
        int col = a.length - 1;

        while (row < a.length && col > 0) {
            if (key == a[row][col]) {
                System.out.println("(" + row + "," + col + ")");
                return true;
            } else if (a[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //by using last row and 1st col element

    public static boolean searchInSortedArrayAnother(int a[][], int key) {
    int row = a.length - 1;
    int col = 0;

    while (row >= 0 && col < a[0].length) {
        if (key == a[row][col]) {
            System.out.println("(" + row + "," + col + ")");
            return true;
        } else if (key > a[row][col]) {
            col++;
        } else {
            row--;
        }
    }

    System.out.println("Key not found");
    return false;
}

    public static void main(String[] args) {
        int a[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };



        int key = 29;

        searchInSortedArray(a, key);
        searchInSortedArrayAnother(a, key);
    }
}
