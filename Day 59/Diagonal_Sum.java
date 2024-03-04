public class Diagonal_Sum {
    public static int DiagonalSum(int Matrix[][]){
        int Sum = 0;
        for(int i = 0; i<Matrix.length; i++){
            Sum += Matrix[i][i]; //Primary Diagonal
            if(i!=Matrix.length-i-1){ //For Odd Matrix
                 Sum += Matrix[i][Matrix.length-1-i]; //Secondary Diagonal
            }
        }
        return Sum;
    }
    public static void main(String args[]){
        //int Matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}}; //Even Matrix
        int Matrix[][] = {{0,1,2},{3,4,5},{6,7,8}}; //Odd Matrix
        System.out.print("DIAGONAL SUM : " + DiagonalSum(Matrix));
    }
}
