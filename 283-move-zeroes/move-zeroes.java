class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i] = nums[j];
                i++;
            }else count++;
            j++;
        }
        for(int k = 0;k<count;k++) nums[nums.length-1-k] = 0;
    }
}