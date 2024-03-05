public class TransposeofMatrix {
    public static void TranposeMatrix(int Matrix[][], int TranposeMatrix[][]){
        for(int i = 0; i<Matrix.length; i++){
            for(int j = 0; j<Matrix[0].length; j++){
                TranposeMatrix[j][i] = Matrix[i][j];
        }
    }
}
    public static void PrintMatrix(int Matrix[][]){
        for(int i = 0; i<Matrix.length; i++){
            for(int j = 0; j<Matrix[0].length; j++){
                System.out.print(Matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int Matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("OUR MATRIX IS : ");
        PrintMatrix(Matrix);
        System.out.println();
        int TranposeMatrix[][] = new int[Matrix[0].length][Matrix.length];
        System.out.println("OUR TRANSPOSED MATRIX : ");
        TranposeMatrix(Matrix, TranposeMatrix);
        PrintMatrix(TranposeMatrix);
        System.out.println();
    }
}   
