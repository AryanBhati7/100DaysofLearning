import java.util.*;
public class oneton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
        System.out.print((i) + " ");
        i++;
        }
        sc.close();
    }   
}
