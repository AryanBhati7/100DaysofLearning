import java.util.*;
public class Palindrome_Or_Not{
    public static boolean checkPalindrome(int n){
        int OriginalNum = n;
        int Reverse = 0;
        while(n>0){
            int lastdigit = n%10;
            Reverse = Reverse*10 + lastdigit; 
            //It inreases the place value of current reverse then add new last digit
            n = n/10;
        }
        if(Reverse == OriginalNum){ 
            //comparing reverse with original num as value of n willl be less then n
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
        if(checkPalindrome(num) == true){
            System.out.print("PALINDROME NUMBER");
        }
        else {
            System.out.print("NOT A PALINDROME NUMBER");
        }
        sc.close();
    }
}