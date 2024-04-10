public class Inversion_Count{
    public static int InversionCount(int arr[]){
        int InvCount = 0;
        for(int i =0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    InvCount++;
                }
            }
        }
        return InvCount;
    }
    public static void main(String args[]){
        int arr[] = {5,3,2,4,1};
        System.out.println(InversionCount(arr));
    }
}
