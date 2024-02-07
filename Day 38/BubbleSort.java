public class BubbleSort{
    public static void BubbleSorting(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i = 0; i<(n-1); i++){
            swapped = false;
            for(int j = 0; j<(n-1-i); j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        BubbleSorting(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }

    }
}