import java.util.*;
public class factorialusingfunction {
    public static int Factorial(int n){
        int fac=1;
        for(int i=1; i<=n; i++){
            fac *= i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Factorial of n is : " + Factorial(n));

        sc.close();
        
    }
}
