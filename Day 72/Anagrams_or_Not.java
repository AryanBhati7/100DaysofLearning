import java.util.Arrays;
public class Anagrams_or_Not {
    public static boolean AnagramorNot(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1.concat(str2);

        if(str1.length()==str2.length()){
            char str1CharArray[] = str1.toCharArray();
            char str2CharArray[] = str2.toCharArray();
            
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            if(Arrays.equals(str1CharArray,str2CharArray)==true){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }          
        }
    public static void main(String args[]){
        String str1 = "Aryan";
        String str2 = "bhati";
        
        if(AnagramorNot(str1, str2)==true){
            System.out.println("ANAGRAM WORDS");
        }
        else{
            System.out.println("NOT ANAGRAM");
        }
        }
    }

