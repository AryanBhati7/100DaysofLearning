import java.util.*;

public class Input_OutputinString {
    public static void main(String args[]){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        //Strings are immutable

        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //For taking one word as input
        System.out.println(name);
        String line = sc.nextLine(); //For taking one line as input
        System.out.println(line);
        System.out.println(line.length());
        sc.close();

        String firstName = "ARYAN";
        String lastName = "BHATI";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName);
    }
}
