public class ReverseArray {
    //Method to take an array and reverse it by swapping
    public static void ReverseSwap(int numbers[]){ 
        int first = 0; //Index of first value of array
        int last = numbers.length-1; //Index of last value in the array
        while(first<last){  //Here first<last because when first=last then no need to swap
            //Swapping 
            int temp = numbers[last]; //Creating a temporary variable to store last value of array
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + "    ");
        }
        System.out.println();
        ReverseSwap(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + "    ");
        }
        System.out.println();
        
    }
}
