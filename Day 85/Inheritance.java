public class Inheritance {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.SkinColor = "Brown";
        System.out.println(d1.SkinColor);
    }
}
class Animals{
    void eat(){
        System.out.println("It eats");
    }
    void breath(){
        System.out.println("It Breaths");
    }
    String SkinColor;
}

class Fish extends Animals{
    int Fins;
    void Swim(){
        System.out.println("It Swims");
    }
}

class Birds extends Animals{
    boolean FlyorNot;

    void Fly(){
        System.out.println("It Flies");
    }
}

class Mammals extends Animals{
    int Legs;

    void Walk(){
        System.out.println("It Walk");
    }
}

class Tuna extends Fish{
    int sizescale;
}

class Shark extends Fish{
    int sizescale;
}

class Peacock extends Birds{
    
}

class Dog extends Mammals{

}

class Cat extends Mammals{

}
class Human extends Mammals{

}
