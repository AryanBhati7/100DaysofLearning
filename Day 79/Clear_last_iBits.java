public class Clear_last_iBits {
    public static int Clear_iBits(int n, int i){
        int Bitmask = ((-1)<<i);
        //int Bitmask = ((~0)<<i);
        return n & Bitmask;
    } 
    public static void main(String args[]){
        System.out.println(Clear_iBits(15, 2));
    }
}
