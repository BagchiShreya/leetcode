class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length, l = 0;
        while ((l < n) && ((nums[l] % 2 == 1) || (nums[l] > threshold))) {
            l++;
        }
        if (l == n)     
            return 0;

        int maxLen = 1, r = l + 1, mod = 0;
        while (r < n) {
            mod = (r - l) % 2;
            if(nums[r]>threshold||(mod==1&&nums[r]%2==nums[l]%2)||(mod==0&&nums[r]%2!=nums[l]% 2)){
                l = r;
                while (l < n && (nums[l] > threshold || nums[l] % 2 == 1)) {
                    l++;
                }
                r = l + 1;
            } 
            else {
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            }
        }
        return maxLen;
    }
}