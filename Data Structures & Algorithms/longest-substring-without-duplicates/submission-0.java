class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> current = new HashSet<>();
        int n = s.length();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++){
            char curr = s.charAt(right);

            while(current.contains(curr)){
                current.remove(s.charAt(left));
                left++;
            }
            
            current.add(curr);

            int currLen = (right - left) + 1;
            maxLen = Math.max(currLen, maxLen);
        }

        return maxLen;
    }
}
