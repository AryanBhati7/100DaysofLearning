public class SearchInSortedMatrix {
    public static boolean StaircaseMethod1(int Matrix[][], int key){
        int row = 0, col = Matrix[0].length-1;
        while(row < Matrix.length && col >= 0){
            if(Matrix[row][col] == key){
                System.out.println("KEY FOUND AT (" + row + "," + col + ")");
                return true;
            }
            else if (key < Matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("KEY NOT FOUND IN THE MATRIX");
        return false;
    }
    public static boolean StaircaseMethod2(int Matrix[][], int key){
        int row = Matrix.length-1, col = 0;
        while(col < Matrix.length && row >= 0){
            if(Matrix[row][col] == key){
                System.out.println("KEY FOUND AT (" + row + "," + col + ")");
                return true;
            }
            else if (key < Matrix[row][col]){
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("KEY NOT FOUND IN THE MATRIX");
        return false;
    }
    public static void main(String args[]){
        int Matrix[][] = {{10,20,30,40}, {15,25,35,45},{27,29,37,48},{32,33,39,50}};
        StaircaseMethod2(Matrix, 33);

    }
}