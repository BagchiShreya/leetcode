class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3 != 0){
                if(nums[i]-1%3 == 0)
                    c++;
                else
                    c++;
            }
        }
        return c;
    }
}