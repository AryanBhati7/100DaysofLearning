import java.util.Scanner;
//Writing a program to Convert any Binary number given by the user to Decimal number
public class BinarytoDecimal {
    public static int BNtoDN(int BN){
        int DN = 0; //DEcimal number to be returned in this function
        int LD; //LD = Last digit of the binary number
        int p = 0;
        while(BN>0){
            LD = BN%10; //Store the last digit from BM to LD
            BN = BN/10; //Remove the last digit form BM
            DN += LD*Math.pow(2,p); //Accumulating LD*2^p to DN
            p++;
        }
        return DN;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Binarynum = sc.nextInt();
        int Decimalnum = BNtoDN(Binarynum);
        System.out.print(Binarynum + " in Decimal number is " + Decimalnum);
        sc.close();
    }
}
