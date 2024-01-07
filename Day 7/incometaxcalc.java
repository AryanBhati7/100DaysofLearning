import java.util.*;
public class incometaxcalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income : ");
        float income = sc.nextFloat();

        if(income>1000000){
        System.out.println("Your Tax will be : " + (0.30f*income));
        }
        else if(income<1000000 && income>500000){
        System.out.println("Your Tax will be : " + (0.20f*income));
        }
        else {
            System.out.println("You don't have to pay any tax");
        }
        sc.close();
    }
}
