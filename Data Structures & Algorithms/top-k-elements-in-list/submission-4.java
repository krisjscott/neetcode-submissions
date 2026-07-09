class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        List<int[]> freq = new ArrayList<>();
        for(Map.Entry<Integer, Integer> c: count.entrySet()){
            freq.add(new int[]{c.getValue(), c.getKey()});
        }
        freq.sort((a,b)->b[0]-a[0]);
        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = freq.get(i)[1];
        }
        return res;
    }
}
