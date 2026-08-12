class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();//put pair in stack [value, index]
        int[] result = new int[temperatures.length];

        for(int i = 0; i<temperatures.length; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t>stack.peek()[0]){//compare top of stack with latest temperature found in the array of temp
                int[] pair = stack.pop();//popping it as a pair
                result[pair[1]] = i-pair[1];//adding the difference into res
            }
            stack.push(new int[]{t, i});//pair of value and index value
        }
        return result;
    }
}
