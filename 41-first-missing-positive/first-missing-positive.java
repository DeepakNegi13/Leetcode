class Solution {
    public int firstMissingPositive(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0;i<nums.length;i++) if(nums[i]>0) hs.add(nums[i]);
		for(int i = 1;i-1<Integer.MAX_VALUE;i++) if(!hs.contains(i)) return i;
		return -1;
	}
}