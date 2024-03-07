public class Spiral_Matrix {
    public static void PrintSpiral(int Matrix[][]){
        int startRow = 0;
        int endRow = Matrix.length-1;

        int startCol = 0;
        int endCol = Matrix[0].length-1;

        while(startRow<=endRow && startCol <= endCol){
            //TopBoundary->RightBoundary->BottomBoundary->LeftBoundary
            //print top boundary
            for(int j = startCol; j <= endCol; j++){ //In this boundary only column is changing 
                System.out.print(Matrix[startRow][j]+ " ");
            }
            startRow++;
            //print right boundary
            for(int i = startRow+1; i <= endRow; i++){ //First row is element is already printed
                System.out.print(Matrix[i][endCol]+" ");
            }
            endCol--;
            //print bottom boundary
            if(startRow<=endRow){ //Only if there is till multiple columns
            for(int j = endCol-1; j >= startCol; j--){
                System.out.print(Matrix[endRow][j] + " ");
            }
            endRow--;
            }
            //print Left Boundary
            if(startCol <= endCol){ //Only if there is till multiple columns
            for(int i = endRow-1; i >= startRow+1; i--){
                System.out.print(Matrix[i][startCol] + " ");
            }
            startCol++;
            }
        }
    }
    public static void main(String args[]){
        int Matrix[][] = { {1,2,3,4,5,6,7,8,9,10}, 
                            {11,12,13,14,16,17,18,19,20}, 
                            {21,22,23,24,25,26,27,28,29,30}, 
                            {31,32,33,34,1,5,8,9,6,4}};
        PrintSpiral(Matrix);
    }
}
