
public class spiralMatrix {

    public static void printSpiralMatrix(int a[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = a.length - 1;
        int endCol = a[0].length - 1;

        while (startCol <= endCol && startRow <= endRow) {
            //top 
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(a[startRow][i] + " ");
            }

            //right 
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(a[i][endCol] + " ");
            }

            //bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(a[endRow][i] + " ");
            } 

            //right 
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(a[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {

        int a[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12} , {13 , 14 , 15 ,16}};
        printSpiralMatrix(a);
    }
}
