class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = nums.length;
        int elem = 0;
        for(int i = 0;i<n;i++){
            if(count == 0)  elem = nums[i];
            if(nums[i] == elem) count++;
            else count--;
        }
        return elem;
    }
}