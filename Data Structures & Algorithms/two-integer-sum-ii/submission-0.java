class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while(i < j){
            int sumAns = numbers[i] + numbers[j];

            if (sumAns > target){
                j--;
            }

            else if (sumAns < target){
                i++;
            }
            else{
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{-1};
    }
}
