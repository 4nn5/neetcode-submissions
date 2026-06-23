class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> ans = new HashMap<>();

        for(char ch: s.toCharArray()){
            ans.put(ch, ans.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()){
            ans.put(ch, ans.getOrDefault(ch, 0) - 1);
        }

        for (int count : ans.values()) {
            if (count != 0) {
                return false;
            }
        }
       
        return true;
    }
}
  