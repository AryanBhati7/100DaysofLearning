public class Hollow_Rectangle {
    public static void hollow_rectangle(int totRows, int totCols){
        //Outer loop is for Priting/tranversing through row
        for(int i = 1; i<=totRows; i++){
            //Inner loop is for transversing through colums in every row
            for(int j = 1; j<=totCols; j++){
                //from Rough sketch of Rectangle inside a matrix
                if(i == 1 || i == totRows || j == 1 || j == totCols){ 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(8,12);
    }
    
}
