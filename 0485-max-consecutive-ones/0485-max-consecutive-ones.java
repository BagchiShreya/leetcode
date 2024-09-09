class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        String s="";
        int max=0;
        for(int i=0;i<nums.length;i++){
            s+=Integer.toString(nums[i]);
        }
        String arr[]=s.split("0");
        for(int i=0;i<arr.length;i++){
            if(max<arr[i].length()){
                max=arr[i].length();
            }
        }
        return max;
        
    }
}