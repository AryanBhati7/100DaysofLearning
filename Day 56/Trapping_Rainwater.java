public class Trapping_Rainwater {
    public static int TrappingRainwater(int buildings[]){
        int n = buildings.length;
        //Left max boundary - array
        int left_max_boundary[] = new int[n];
        left_max_boundary[0] = buildings[0];
        for(int i=1; i<n; i++){
            left_max_boundary[i] = Math.max(buildings[i], left_max_boundary[i-1]);
        }
        //Right max boundary - array
        int right_max_boundary[] = new int[n];
        right_max_boundary[n-1] = buildings[n-1];
        for(int i=n-2; i>=0; i--){
            right_max_boundary[i] = Math.max(buildings[i], right_max_boundary[i+1]);
        }
        //Loop for Water level and calculating Trapped Water
        int TrappedWater = 0;
        for(int i = 0; i<n; i++){
            //Water level = max of left and right boundary of the building
            int Waterlevel = Math.min(left_max_boundary[i], right_max_boundary[i]);
            //TrappedWater = Waterlevel - Height of the buiding
            TrappedWater += Waterlevel-buildings[i]; 
        }
        return TrappedWater;
    }
    public static void main(String args[]){
        int buildings[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Amount of water trapped = " + TrappingRainwater(buildings));
    }
}
