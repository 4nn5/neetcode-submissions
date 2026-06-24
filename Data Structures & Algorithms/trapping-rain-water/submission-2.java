class Solution {
    public int trap(int[] height) {
        int maxIndex = 0;
        for (int k = 0; k < height.length; k++) {
            if (height[k] > height[maxIndex]) {
                maxIndex = k;
            }
        }

        int ans = 0;

        int i = 0;
        int count = 0;
        for (int j = 1; j <= maxIndex; j++) {
            if (height[i] > height[j]) {
                count += (height[i] - height[j]);
            } else {
                ans += count;   
                count = 0;      
                i = j;         
            }
        }
        
        i = height.length - 1; 
        count = 0;
        for (int j = height.length - 2; j >= maxIndex; j--) {
            if (height[i] > height[j]) {
                count += (height[i] - height[j]);
            } else {
                ans += count;   
                count = 0;      
                i = j;          
            }
        }

        return ans;
    }
}