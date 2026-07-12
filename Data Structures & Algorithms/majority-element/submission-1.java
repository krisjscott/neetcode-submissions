class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int j = 0;
        int i = 0;
        for(Map.Entry<Integer,Integer> m: map.entrySet() ){
            if(m.getValue() > j && m.getValue() > nums.length / 2){
                j = m.getKey();
                i = m.getValue();
            }
        }
        return j;
    }
}