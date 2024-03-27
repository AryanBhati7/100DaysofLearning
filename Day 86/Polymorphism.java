public class Polymorphism{
    public static void main(String args[]){
        Calculator Calc = new Calculator();
        System.out.println(Calc.sum(5,6));
        System.out.println(Calc.sum((float) 5.6,(float) 4.4));
        System.out.println(Calc.sum(5,4, 4));
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum (float a, float b){
        return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }
}