public class Substring {
    private static String getSubstring(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String args[]) {
        String str = "Hello World";
        System.out.println(getSubstring(str, 0, 5)); // UserBuilt Function
        System.out.println(str.substring(0, 5)); // Inbuilt Function
    }
}
