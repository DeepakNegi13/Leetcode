class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        int j = 1;
        int count = 0;
        while(j<len){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]<nums[j]){
                count++;
                nums[count] = nums[j];
                i=j;
                j++;
                
            }
        }
        return ++count;
        // int count = 0;
        // for(int i = 0;i<len-1-count;i++){
        //     if(nums[i]==nums[i+1]){
        //         count++;
        //         for(int j = i+1;j<len-count;j++){
        //             int swap = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = swap;
        //         }
        //         i--;
        //     }
        // }
        // return len - count;
    }
}