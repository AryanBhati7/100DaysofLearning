import java.util.*;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        long n = sc.nextLong();

        long fac=1;
        for(long i=n;i>1; i--){
            fac = fac*i;
        }
        System.out.print("Factorial : " + fac);
        sc.close();
    }
}
