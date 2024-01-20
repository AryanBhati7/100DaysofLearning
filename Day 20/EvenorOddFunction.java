import java.util.*;
public class EvenorOddFunction {
    public static boolean IsEven(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(IsEven(num)==true){
            System.out.println("EVEN NUMBER");
        }
        else {
            System.out.println("ODD NUMBER");
        }
        sc.close();
    }
}
