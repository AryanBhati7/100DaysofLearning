public class LargestNumber {
    public static int LargestNum(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[] = {1,2,3,5,6,7,8,9,10};
        System.out.println(LargestNum(num));
    }
}
