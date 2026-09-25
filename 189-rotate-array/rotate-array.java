class Solution {
    public void reverse(int[] arr,int i, int j){
        int start = i;
        int end = j;
        while(start<end){
            int swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++;
            end--;
        } 
    }
    public void rotate(int[] nums, int k) {
       
        int len = nums.length;
        int rotation = k % len;
        reverse(nums,0,len-1);
        reverse(nums,0,rotation-1);
        reverse(nums,rotation,len-1);
    }
}