class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> ans, int[] nums, int start){

        if(result.contains(new ArrayList<>(ans))){
            return;
        }

        result.add(new ArrayList<>(ans));

        for(int i = start; i < nums.length; i++){
            ans.add(nums[i]);
            backtrack(result, ans, nums, i+1);
            ans.remove(ans.size() - 1);
        }
    }
}
