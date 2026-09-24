class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int elem : nums){
            if(elem == 1) count++;  
            else if(count!=0) {
                max = Math.max(count,max);
                count = 0;              
            }
        }
        max = Math.max(count,max);
        return max;
    }
}