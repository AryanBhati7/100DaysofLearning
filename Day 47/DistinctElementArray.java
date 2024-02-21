public class DistinctElementArray{
    //In this question we will use binary search to check each value of array 
    public static boolean ElementCheck(int num[]){
        int n = num.length;
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++ ){
                if(num[i] == num [j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num[] = {1,2,2,5};
        if(ElementCheck(num)==false){
            System.out.println("DISTINCT ELEMENTS IN THE ARRAY");
        }
        else {
            System.out.println("REPEATED ELEMENTS FOUND");
        }
    }
}