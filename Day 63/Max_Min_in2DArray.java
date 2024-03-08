import java.util.*;
public class Max_Min_in2DArray {
    //Function to calculate maximum value in our array
    public static int MaxInt(int Matrix[][]){
        int maxInt = Integer.MIN_VALUE;
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                maxInt = Integer.max(Matrix[i][j], maxInt);
            }
        }
        return maxInt;
    }
    //Function to return minimum value in our array
    public static int MinInt(int Matrix[][]){
        int minInt = Integer.MAX_VALUE;
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                minInt = Integer.min(Matrix[i][j], minInt);
            }
        }
        return minInt;
    }
    public static void main(String args[]){
        //FOR TAKING VALUES in our 2D Array
        Scanner sc = new Scanner(System.in);
        int Matrix[][] = new int[3][3];
        System.out.print("Enter 9 Integers to store in 2D Array : ");
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        //Printing our maximum and minimum values with the help of their respective functions
        System.out.println("HIGHEST INTEGER IN THIS ARRAY : " + MaxInt(Matrix));
        System.out.println("LOWEST INTEGER IN THIS ARRAY : " + MinInt(Matrix));
    }
}
