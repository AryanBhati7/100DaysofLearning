public class KeyinSorted_RotatedArray {
    public static int BinarySearch(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[start]<num[mid]){ //If this is true  LEFT PART is SORTED
                if(num[start]<=key && num[end]>=key){ //our target/key is in the left side on the left sorted
                    end = mid-1;
                }
                else{ //right side
                    start = mid+1;
                }
            }
            else { //RIGHT PART IS SORTED as left is not 
                if(num[mid]<=key && num[end] >= key){ //our target/key is in the left side on the right sorted array
                    start = mid + 1;
                }
                else{ //right side
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]= {4,5,6,7,0,1,2};
        int target = 0; 
        System.out.println(BinarySearch(num, target));
    }
}
