class Solution {
    public int characterReplacement(String s, int k) {
        // HashMap<Character, Integer> set = new HashMap<>();
        int[] count = new int[26];
        int left = 0;
        int freq = 0;
        int result = 0;
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i) - 'A']++;
            freq=Math.max(freq, count[s.charAt(i) - 'A']);
            while((i-left+1)-freq>k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result, i-left+1);
        
        }
        return result;
    }
}
