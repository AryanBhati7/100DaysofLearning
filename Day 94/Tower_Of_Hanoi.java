public class Tower_Of_Hanoi {
    public static void TowerOfHanoi(int n, String Source, String Helper, String Destination){
        if(n==1){
            System.out.println("Transfer Disk " + n +" from " + Source + " to " + Destination);
            return;
        }
        TowerOfHanoi(n-1, Source, Destination, Helper);
        System.out.println("Transfer Disk " + n +" from " + Source + " to " + Destination);        
        TowerOfHanoi(n-1, Helper, Source, Destination);
    }
    public static void main(String args[]){
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
