public class Basics_of_Oops {
    public static void main(String args[]){
        Pen p1 = new Pen(); //Creating an object under pen class
        // p1.SetColor("Blue");
        p1.color = "White";
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void SetColor(String newColor){
        color = newColor;
    }

    void SetTip(int newTip){
        tip = newTip;
    }
}
