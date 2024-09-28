class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int j=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
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