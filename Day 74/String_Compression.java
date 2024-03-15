public class String_Compression {
    public static String compressString(String str){
        //String newStr = ""; //Using String
        StringBuilder newStr = new StringBuilder(""); //Using StringBuilder
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            //newStr += str.charAt(i);
            newStr.append(str.charAt(i));
            if(count > 1){
                //newStr += count.toString();
                newStr.append(count.toString());
            }
        }
        //return newStr;
        return newStr.toString();
    }
    
    public static void main(String args[]){
        //String str = "aaabbcccdd";
        String str = "abcd";
        System.out.println(compressString(str));
    }
}
