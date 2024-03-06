public class SumofaRowin2DArray {
    public static int SumofaRow(int Matrix[][], int row){
    int Rowsum = 0; 
    for(int i = 0; i<Matrix.length; i++){
        for(int j = 0; j<Matrix[0].length; j++){
            if(i+1==row){
                Rowsum += Matrix[i][j];
            }
        }
    }
    return Rowsum;
    }
    public static int SumofaCol(int Matrix[][], int col){
        int Colsum = 0; 
        for(int i = 0; i<Matrix.length; i++){
            for(int j = 0; j<Matrix[0].length; j++){
                if(j+1==col){
                    Colsum += Matrix[i][j];
                }
            }
        }
        return Colsum;
        }
    public static void main(String args[]){
        int Matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int row = 2;
        int col = 1;

        System.out.println("SUM of Values of Row " + row + " is : " + SumofaRow(Matrix, row));
        System.out.println("SUM of Values of Row " + col + " is : " + SumofaRow(Matrix, col));
    }
}
