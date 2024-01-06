import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        float a =  sc.nextFloat();

        System.out.print("Enter b : ");
        float b =  sc.nextFloat();

        System.out.print("Enter the operation you wish to perform : ");
        char operator =  sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("INVALID OPERATOR");
        }
        sc.close();
    }
}
