public class PowerOf2OrNot{
    public static boolean isPowerofTwo(int n){
        return (n & (n-2))==0;
    }
    public static void main(String args[]){
        System.out.println(isPowerofTwo(8));
    }
}