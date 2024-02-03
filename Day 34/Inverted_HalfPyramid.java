public class Inverted_HalfPyramid {
    public static void main(String args[]){
        int n = 5;
        //Outer loop for number of lines which is n
        for(int i = 1; i<=n; i++){ 
            //First inner loop for printing spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Second inner loop for printing stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
