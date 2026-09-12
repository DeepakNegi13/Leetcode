class Solution {
    public List<Integer> findMissingElements(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<nums.length;i++){
			if(!hs.contains(nums[i])) hs.add(nums[i]);
			min = Math.min(nums[i],min);
			max = Math.max(nums[i],max);
		}
		List<Integer> ans = new ArrayList<>();
		for(int i = min+1;i<max;i++){
			if(!hs.contains(i)) ans.add(i);
		}
		return ans;
		
		
	}
}