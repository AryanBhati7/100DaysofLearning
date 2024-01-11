import java.util.*;
public class sumoffirstnnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        
        int i = 1;
        int sum=0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.print("Sum of first n natural number : " + sum);
        sc.close();
}
}
