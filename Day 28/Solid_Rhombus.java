public class Solid_Rhombus {
    public static void SolidRhombus(int n){ //n= Number of lines
        for (int i = 1; i <= n; i++){
            //Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        SolidRhombus(5);
    }
    
}
