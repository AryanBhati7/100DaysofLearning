public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Aryan");
        Student s3 = new Student("Daksh", 15);
        s1.name = "Trial";
        s2.roll = 16; 
        s2.marks[0] = 95;
        s2.marks[1] = 85;
        s2.marks[2] = 75;
        System.out.println(s2.name);
        System.out.println(s3.name + "    " +  s3.roll);
    }
}

class Student{
        String name;
        int roll;
        int marks[];

        Student(){
            System.out.println("Trial");
        }

        Student(String Name){
            this.name = Name;
        }

        Student(String Name, int roll){
            this.name = Name;
            this.roll = roll;
        }
    }

