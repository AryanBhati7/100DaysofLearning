import java.util.*;
public class primenumberfunction {
    public static boolean CheckPrimeorNot(int n){ //only for n>=2
        boolean IsPrime  = true;        
        if(n==2){
            return IsPrime;
        }
        else { 
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    IsPrime = false;
                }
            }
        }
        return IsPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(CheckPrimeorNot(n) == true){
            System.out.print("PRIME NUMBER");
        }
        else {
            System.out.print("NOT A PRIME NUMBER");
        }
                sc.close();
        }
    }

