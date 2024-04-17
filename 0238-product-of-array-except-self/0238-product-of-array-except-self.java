class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zeroes = 0, index = -1;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroes++;
                index = i;
            } 
            else
                prod *= nums[i];
        }
        if(zeroes > 1)
            Arrays.fill(ans, 0);
        else if(zeroes == 1) 
            ans[index] = prod;
        else {
            for(int i = 0; i < nums.length; i++) {
                ans[i] = prod / nums[i];
            }
        }
        
        return ans;
    }
}