public class Quick_Sort {
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"    ");
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        
        int pvIx = partition(arr, si, ei);

        quickSort(arr, si, pvIx-1);
        quickSort(arr, pvIx+1, ei);

    }
    public static int partition(int arr[], int si, int ei){
        int pv = arr[ei];
        int i = si-1;
        for(int j = si; j<ei; j++){
            if(arr[j]<=pv){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
