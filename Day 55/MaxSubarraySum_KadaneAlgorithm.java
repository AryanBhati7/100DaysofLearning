public class MaxSubarraySum_KadaneAlgorithm {
    public static void KadaneAlgorithm(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
    
        for(int i=0; i<numbers.length; i++){
            currsum += numbers[i]; 
            // if(currsum<0){ //main logic behind kadane algo means when curr sum comes negative replace it with 0
            //     currsum = 0;
            // }
            if(currsum<numbers[i]){ //for an array full of negative numbers
                currsum = numbers[i];
            }
            maxsum = Math.max(currsum, maxsum);          
    }
    System.out.println("MAX SUM : " + maxsum);
    }
    public static void main(String args[]){
        int numbers[] = {-1,-2,-6,-1,-3};
        KadaneAlgorithm(numbers);
    }
}

