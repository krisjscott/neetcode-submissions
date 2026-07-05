class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[n-k+1];
        for(int i = 0; i<nums.length; i++){
            if(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }

            deque.addLast(i);

            if(i>=k-1){
                result[i-k+1] = nums[deque.peekFirst()];
            }
        } 
        return result;
    }
}
