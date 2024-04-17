class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1, zeroes = 0, index = -1;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                zeroes++;
                index = i;
            } 
            else
                prod *= nums[i];
        }
        if(zeroes > 1) {
            Arrays.fill(ans, 0);
        } 
        else if(zeroes == 1) {
            ans[index] = prod;
        } 
        else {
            for(int i = 0; i < n; i++) {
                ans[i] = prod / nums[i];
            }
        }
        
        return ans;
    }
}