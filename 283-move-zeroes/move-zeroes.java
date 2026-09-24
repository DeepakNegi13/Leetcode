class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        int length = nums.length;
        while(j<length){
            if(nums[i] == 0 && nums[j] == 0){
                j++;
            }else if(nums[i]==0 && nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else {
                i++;
                j++;
            }
        }
    }
}