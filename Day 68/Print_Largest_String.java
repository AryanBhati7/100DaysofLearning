public class Print_Largest_String {
    public static void main(String args[]){
        String Fruits[] = {"Apple", "mango", "banana"};

        String largest = Fruits[0];

        for (int i = 0; i<Fruits.length; i++){
            //largest.compareToIgnoreCase(Fruits) This treats 'a' & 'A' equal
            if(largest.compareTo(Fruits[i])<0){ //This treats 'a' & 'A' as different
                largest = Fruits[i];
            }
        }
        System.out.println("Largest fruit name : " + largest);
    }
}
