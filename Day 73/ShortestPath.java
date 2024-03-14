public class ShortestPath {
    public static double getShortestPath(String Route){
        int x = 0;
        int y = 0;
        for(int i = 0; i < Route.length(); i++){
            // switch(Route.charAt(i)){
            //     case 'N' : 
            // }
            if(Route.charAt(i)=='N'){
                y += 1;
            }
            else if(Route.charAt(i)=='S'){
                y -= 1;
            }
            else if(Route.charAt(i)=='E'){
                x += 1;
            }
            else{
                x -= 1;
            }
        }
        double ShortestPath = (int) Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
        return ShortestPath;
    }
    public static void main(String args[]){
        //String path = "WNEENESENNN";
        String path = "NS";
        System.out.println("SHORTEST PATH : " + getShortestPath(path));
    }
}
