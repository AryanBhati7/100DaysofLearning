// public class Num_to_String {
//     public static String numToEng(int num, String str){
//         //Base Case
//         if(num==0){
//             return str;
//         }
//         int currDigit = num%10;
//         String currWord = "";
//         switch (currDigit) {
//             case 0 : currWord = "zero";
//                     break;
//             case 1 : currWord = "one";
//                     break;
//             case 2 : currWord = "two";
//                     break;
//             case 3 : currWord = "three";
//                     break;
//             case 4 : currWord = "four";
//                     break;
//             case 5 : currWord = "five";
//                     break;
//             case 6 : currWord = "six";
//                     break;
//             case 7 : currWord = "seven";
//                     break;
//             case 8 : currWord = "eight";
//                     break;
//             case 9 : currWord = "nine";
//                     break;
//         }
//         return numToEng(num/10, str+" " + currWord);
//     }
//     public static void main(String args[]){
//         System.out.println(numToEng(2019, ""));
//     }
// }
public class Num_to_String {
    static String digit[] = { "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine" };

    public static void numToEng(int num) {
        if (num == 0) {
            return;
        }
        int lastdigit = num % 10;
        numToEng(num / 10);
        System.out.print(" " + digit[lastdigit]);
    }

    public static void main(String args[]) {
        numToEng(2019);
    }
}
