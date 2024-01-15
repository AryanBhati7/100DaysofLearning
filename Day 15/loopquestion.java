import java.util.*;
public class loopquestion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int OddSum=0;
        int EvenSum = 0;
        do {
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
            if (num%2==0){
                EvenSum += num;
            }
            else {
                OddSum += num;
            }
            System.out.print("Do you wish to continue (1-YES, 0-NO): ");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of Even Integers : " + EvenSum);
        System.out.println("Sum of Odd Integers : " + OddSum);
        sc.close();
        }
}
