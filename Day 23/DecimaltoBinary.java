import java.util.*;
//Writing a program which takes a Decimal number as input and gives Binary number as output

public class DecimaltoBinary {
    public static int Dec_numtoBin_num(int dec_num) {
        int rem; //Variable to store the remainder
        int p = 0; //For power of 10
        int bin_num = 0; //Storing the binary digit 
        while (dec_num > 0) {
            rem = dec_num % 2;  
            bin_num += rem * Math.pow(10, p); //10^p indicates the place of the digit in binary num
            dec_num = dec_num/2; 
            p++;
        }
        return bin_num;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int dec_num = sc.nextInt();
        int bin_num = Dec_numtoBin_num(dec_num); //Calling our function
        System.out.print("Binary number of " + dec_num + " is : " + bin_num);
        sc.close();
    }

}
