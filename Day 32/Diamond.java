public class Diamond {
    public static void DiamondShape(int n){
        //For 1st half of diamond
        for(int i = 1; i <= n; i++){
            //Spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //For 2nd half of diamond
        for(int i = n; i >=  1; i--){
            //Spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        DiamondShape(4);
    }
}
