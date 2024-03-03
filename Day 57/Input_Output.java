import java.util.*;

public class Input_Output {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        
        //Initialization of our 2d Array
        //int Matrix[][] = {{1,2,3},{4,5,6}};

        //For Taking Input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close(); 
        //For Printing / OUTPUT
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
