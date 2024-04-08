public class RemoveDuplicatesinString {
    public static void main(String args[]) {
        String Str = "aaryaanbhaati";
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[26];
        System.out.println(Remove_Duplicate(Str, newStr, 0, map));

    }

    public static String Remove_Duplicate(String Str, StringBuilder newStr, int idx, boolean map[]) {
        if (idx == Str.length()) {
            return newStr.toString();
        }
        if (map[Str.charAt(idx) - 'a'] == true) {
            // duplicate
            return Remove_Duplicate(Str, newStr, idx + 1, map);
        } else {
            map[Str.charAt(idx) - 'a'] = true;
            return Remove_Duplicate(Str, newStr.append(Str.charAt(idx)), idx + 1, map);
        }
    }
}
