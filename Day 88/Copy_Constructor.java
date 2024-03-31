
public class Copy_Constructor {
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name = "Aryan";
        s1.roll = 15;
        s1.marks[0] = 85;
        s1.marks[1] = 68;
        s1.marks[2] = 65;
    
        Students s2 = new Students(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.marks[0] + "  " + s2.marks[1] + "   "+ s2.marks[2]);

        s1.marks[1] = 90;
        System.out.println(s2.marks[1]);
    }
}
class Students {
    String name;
    int roll;
    int[] marks;

    Students(){
        marks = new int[3];
    }

    Students(Students s1 ){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // marks = s1.marks; //shallow copy
        for(int i = 0; i<marks.length; i++){ //Deep Copy
            marks[i] = s1.marks[i];
        }
    }
}