class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> ans, int[] nums){
        if(ans.size() == nums.length){
            result.add(new ArrayList(ans));
            return;
        }

        for(int i = 0; i < nums.length; i ++){
            if (ans.contains(nums[i])) {
                continue; 
            }
            ans.add(nums[i]);
            backtrack(result, ans, nums);
            ans.remove(ans.size() - 1);

        }
    }
}
