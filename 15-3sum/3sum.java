class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		HashSet<List<Integer>> set = new HashSet<>();
		
		for(int i = 0;i<nums.length;i++){
			HashSet<Integer> hs = new HashSet<>();
			for(int j = i+1;j<nums.length;j++){
				if(!hs.isEmpty() && hs.contains(-1*(nums[i]+nums[j]))){
					List<Integer> arr = new ArrayList<>();

					arr.add(nums[i]);arr.add(nums[j]);arr.add(-nums[i]-nums[j]);
					Collections.sort(arr);
					set.add(arr);
				}else{
                    hs.add(nums[j]);
                }

			}
		}
		for(List<Integer> elem : set) ans.add(elem);
        return ans;
	}
}