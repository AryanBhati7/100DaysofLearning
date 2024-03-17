public class Odd_or_Even {
    public static void OddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            //Even number
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
    }
    public static void main(String args[]){
        OddorEven(5);
        OddorEven(2);
        OddorEven(16);
        OddorEven(0);
    }
}
