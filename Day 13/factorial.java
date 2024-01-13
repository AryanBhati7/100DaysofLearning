import java.util.*;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Takes input from the user
        System.out.print("Enter the number : ");
        long n = sc.nextLong();
        //Loop to calculate the factorial
        long fac=1;
        for(long i=n;i>1; i--){
            fac = fac*i;
        }
        //For printing the result 
        System.out.print("Factorial : " + fac);
        sc.close();
    }
}
