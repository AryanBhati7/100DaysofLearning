import java.util.*;
public class multiplicationtable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of : " + n);
        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        sc.close();
    }
}