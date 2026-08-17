class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] car = new int[n][2];

        for(int i = 0; i<n; i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car, (a,b) -> Integer.compare(b[0], a[0]));

        int fleet = 1;
        double prev_time = (double)(target-car[0][0])/car[0][1];

        for(int i = 1; i<n; i++){
            double cur_time = (double)(target-car[i][0])/car[i][1];
            if(cur_time>prev_time){
                fleet++;
                prev_time=cur_time;
            }
        }
        return fleet;
    }
}
