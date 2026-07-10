class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int n: nums){
            hashset.add(n);
        }
        
        int longest = 0;

        for(int n : hashset){
            if(!hashset.contains(n-1)){
                int len = 1;
                while(hashset.contains(n+len)){
                    len++;
                }
                longest = Math.max(longest, len);
            }
            
        }
        return longest;

        
    }
}
