public class Indices_of_key {
    public static void main(String args[]){
        int arr[] = {1,5,1,6,1,2,1,3,1,1,1};
        int key = 1;
        IndiceArr(arr, key, 0);

    }
    public static void IndiceArr(int arr[], int key, int pos){
        //BASE CASE
        if(pos==arr.length-1){
            return;
        }

        //Work
        if(key==arr[pos]){
            System.out.println(pos);
        }
        IndiceArr(arr, key, pos+1);
    }
}
