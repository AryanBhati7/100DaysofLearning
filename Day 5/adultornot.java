import java.util.*;

public class adultornot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  your age : ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You are an ADULT");
        }

        else {
            System.out.println("You are not an ADULT");
        }
        sc.close();
    }
}