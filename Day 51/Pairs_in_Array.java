public class Pairs_in_Array {
    public static void PairsinBracket(int numbers[]){
        int totalpairs = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")      ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRS : " +totalpairs);
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        PairsinBracket(numbers);
    }
}
