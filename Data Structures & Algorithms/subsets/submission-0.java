class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> sample = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(0, nums, sample, answer);
        return answer;
        
    }
    public void backtrack(int n, int[] nums, List<Integer> sample, List<List<Integer>> answer){
        if(n == nums.length){
            answer.add(new ArrayList<>(sample));
            return;
        }
        sample.add(nums[n]);
        backtrack(n+1, nums, sample, answer);
        sample.remove(sample.size()-1);
        backtrack(n+1, nums, sample, answer);
        
    }
}
