class Solution {
    public void helper(int[] nums,List<List<Integer>> arr,List<Integer> temp,int i){
        if(i==nums.length) {
            arr.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[i]);  
        helper(nums,arr,temp,i+1);
        temp.removeLast();
        helper(nums,arr,temp,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,arr,temp,0);
        return arr;
    }
}