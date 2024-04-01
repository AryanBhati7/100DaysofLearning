public class Fas_Exponentiation_toFindPower {
    public static int PowerofN(int a, int n){
        int ans = 1;

        while(n>0){
            if( ( n & 1 ) != 0){
                ans = ans*a;
            }
            a *= a;
            n>>=1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(PowerofN(3, 5));
    }
}