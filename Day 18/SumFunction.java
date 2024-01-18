import java.util.*;

public class SumFunction {
    public static int CalcSum(int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Sum of these two numbers is : " +  CalcSum(a,b));
        sc.close();
    }
}
