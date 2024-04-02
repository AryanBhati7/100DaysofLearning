public class FirstOccurence {
    public static void main(String args[]){
        int arr[] = {0,1,2,3,4,2,8,5,10};
        int key = 5;
        if(FirstOcc(arr,0,key)==(-1)){
            System.out.println("KEY NOT FOUND");
        }
        else{
            System.out.println("KEY FOUND AT " + FirstOcc(arr, 0, key));
        }
    }
    public static int FirstOcc(int arr[], int i, int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcc(arr,i+1,key);
    }
}
