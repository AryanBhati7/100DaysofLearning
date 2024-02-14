public class InsertionSorting {
    public static void InsertionSort(int arr[]){
        //Here i =1 as supposing 1st element of array is sorted
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insetion
            arr[prev+1] = curr;
        }
    }
    public static void PrintArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        PrintArr(arr);
    }
}
