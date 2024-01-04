import java.util.Scanner;

public class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        int num = sc.nextInt();
        System.out.println(num);
        float d = sc.nextFloat();
        System.out.print(d);
        String sen = sc.nextLine();
        System.out.print(sen);
        Boolean TorF = sc.nextBoolean();
        System.out.print(TorF);
        sc.close();
    }
}
















