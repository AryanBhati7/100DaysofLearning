public class TilingProblem {
    public static void main(String args[]){
        int n = 4;
        System.out.println(WayofTiling(n));

    }
    public static int WayofTiling(int n){ //Floor Size - 2 x n
        //Base  Case
        if(n==0 || n==1){
            return 1;
        }
        //Work to do
        //Vertical
        int fnm1 = WayofTiling(n-1);

        //Horizontal
        int fnm2 = WayofTiling(n-2); 

        int TotWays = fnm1 + fnm2;
        return TotWays;
    }
}
