class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int result = 0;
        char[] ss = s.toCharArray();
        for(int right = 0; right<s.length();right++){
            while(set.contains(ss[right])){
                set.remove(ss[left]);
                left++;
            }
            set.add(ss[right]);

            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
