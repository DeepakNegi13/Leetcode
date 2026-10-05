class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> ans = new ArrayList<>();
        while (i < nums.length) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int k = nums.length - 1;
            int j = i + 1;
            while (j < k) {
                List<Integer> arr = new ArrayList<>();

                if (nums[i] + nums[j] + nums[k] == 0) {
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    ans.add(arr);
                    while (j < nums.length - 1) {
                        if (nums[j] != nums[j + 1])
                            break;
                        j++;
                    }
                    while (k > j) {
                        k--;

                        if (nums[k] != nums[k + 1])
                            break;
                    }
                } else if (nums[i] + nums[j] + nums[k] > 0)
                    k--;
                else
                    j++;
            }
            i++;
        }
        return ans;
    }
}