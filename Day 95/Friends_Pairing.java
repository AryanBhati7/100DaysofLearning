public class Friends_Pairing{
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
    public static int friendsPairing(int n){
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
}