public class Print_x_pow_n {
    public static void main(String args[]){
        System.out.println(Power(5, 3));
    }
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*Power(x, n-1);
    }
}
