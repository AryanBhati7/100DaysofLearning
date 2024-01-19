import java.util.*;
public class SumofDigitsofInt {
    public static int SumofDigits(int n){
        int sum=0;
        while(n>0){
            int lastdigit = n%10;
            sum += lastdigit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = SumofDigits(num);
        System.out.print("Sum of digits of the number : " + sum);
        sc.close();
    }
}
