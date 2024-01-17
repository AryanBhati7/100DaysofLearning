import java.util.*;
//Writing a function to take 3 integers as arguments and return their average
public class averageof3 {
    public static int Averageof3 (int a, int b, int c){
        int avg = (a+b+c)/3; //Formula of average
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt(); //taking input from the user

        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3 : ");
        int num3 = sc.nextInt();
        int avg = Averageof3(num1, num2, num3); //Storing the return value in avg variable
        System.out.print("Average of " + num1 + ", " + num2 + " & " + num3 + " is : " + avg); 
        sc.close();
    }
}
