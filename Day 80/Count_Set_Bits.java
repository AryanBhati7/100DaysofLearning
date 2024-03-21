public class Count_Set_Bits {
    public static int countBits(int n){
        int count = 0;
        while(n>0){
            if(( n & 1 ) != 0){ //Check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countBits(15));
    }
}
