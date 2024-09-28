class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0,j=0;i<nums.length;i++){
            if(!set.isEmpty() && set.contains(nums[i])){
                res[j] = nums[i];
                j++;
            }
            else{
                set.add(nums[i]);
            }
        }
        return res;
    }
}