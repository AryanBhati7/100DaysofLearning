public class FrequencyofaNum {
    public static int countFrequency(int Matrix[][], int  key){
        int count = 0;
        for(int i = 0; i<Matrix.length; i++){
            for(int j = 0; j<Matrix[0].length; j++){
                if(Matrix[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int Matrix[][] = {{4,7,8},{8,8,7}};
        int key = 7;
        System.out.println("Frequency of " + key + " is : " + countFrequency(Matrix, key));
    }
}
