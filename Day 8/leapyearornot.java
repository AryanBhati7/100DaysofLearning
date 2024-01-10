import java.util.*;
public class leapyearornot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println("IT IS A LEAP YEAR");
            }
            else {
                System.out.println("NOT A LEAP YEAR");
            }
        }
        else {
            System.out.println("NOT A LEAP YEAR");
        }
        sc.close();
    }
    
}
