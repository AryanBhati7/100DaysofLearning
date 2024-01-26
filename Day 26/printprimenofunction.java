import java.util.*;

public class printprimenofunction {
    public static boolean CheckPrimeorNot(int n){ //only for n>=2
        boolean IsPrime  = true;        
        if(n==2){
            return IsPrime;
            //return true;
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
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println("PRIME NUMBERS in the sequence 1 to" + n + " : ");
        for(int i = 1; i<=n; i++){
            if(CheckPrimeorNot(i)==true){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
