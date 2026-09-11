class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<nums.length;i++){
            if(!st.isEmpty() && st.peek() == nums[i]) st.pop();
            else st.push(nums[i]); 
        }
        int[] ans = {st.pop(),st.pop()};
        return ans;
    }
}