import java.util.*;
public class DeclaringArrays {
    public static void main(String args[]){
        int marks[] = {1,2,3};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        //int marks[] = new int[50];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
