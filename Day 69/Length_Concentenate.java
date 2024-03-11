import java.util.*;
public class Length_Concentenate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
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
