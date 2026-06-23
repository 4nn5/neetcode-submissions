class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();

        for(int num: nums){
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : ans.entrySet()){
            if(entry.getValue() > 1)
                return true;
        }
        return false;
    }
}