import java.util.*;
public class reverseanumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int lastdigit;
        while(n>0){
            lastdigit = n%10;
            n = n/10;
            System.out.print(lastdigit + " ");
        }
        sc.close();
    }   
}
