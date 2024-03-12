public class PalindromorNot_String {
    public static boolean PalindromeorNot(String str){
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "carracer";
        if(PalindromeorNot(str)==true){
            System.out.println("PALINDROME STRING");
        }
        else{
            System.out.println("NOT A PALINDROME STRING ");
        }
    }
}
