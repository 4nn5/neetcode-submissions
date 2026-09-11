class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> ans, int[]nums, int target, int start){
        
        if(target < 0){
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i = start; i < nums.length; i++){
            ans.add(nums[i]);
            backtrack(result, ans, nums, target - nums[i], i);
            ans.remove(ans.size() - 1);
        }

    }
}
