import java.util.*;
public class primeornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.print("This is not a prime number");
        } else if (n == 2) {
            System.out.print("This is a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }  }
            if (isPrime) {System.out.print("This is a prime number");} 
            else {System.out.print("This is not a prime number");}
        }       
        sc.close();
    }
}