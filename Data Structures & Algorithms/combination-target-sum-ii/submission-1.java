class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void backtrack(List<List<Integer>>result, List<Integer>ans, int[] nums, int target, int start){

        if(target < 0){
            return;
        }

        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }

            ans.add(nums[i]);
            backtrack(result, ans, nums, target - nums[i], i+1);
            ans.remove(ans.size() - 1);
        }
    }
}
