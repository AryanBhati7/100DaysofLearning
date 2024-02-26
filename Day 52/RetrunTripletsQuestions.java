public class RetrunTripletsQuestions {
    public static void ReturnTriplets(int num[]){
        for(int i = 0; i<num.length; i++){
            for(int j = i+1; j<num.length; j++){
                for(int k = j+2; k<num.length; k++){
                    if(num[i]!=num[j] && num[i]!=num[k] && num[j]!=num[k] && num[i] + num[j] + num[k] == 0){
                        System.out.print("[" + num[i] + "," + num[j] + "," + num[k] + "]");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int num[] = {-1, 0, 1, 2, -1, -4};
        ReturnTriplets(num);
    }
}
