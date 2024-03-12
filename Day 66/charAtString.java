public class charAtString {
    private static void PrintCharsinString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String args[]) {
        String name = "ARYAN";
        PrintCharsinString(name);
    }
}
