public class MaxSubarraySum_BruteForce{
    public static void MaxSubarraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                currsum = 0;
                for(int k = i; k<=j; k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("MAX SUM :" + maxsum);
    }
    public static void main(String args[]){ 
        int numbers[] = {1,-2,6,-1,3};
        MaxSubarraySum(numbers);
    }
}

