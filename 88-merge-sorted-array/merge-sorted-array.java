class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
        //optimised bubble sort
        for(int j =1;j<m+n;j++){
            int sumbit = 0;
            for(int i = 0;i<m+n-1;i++){
                if(nums1[i]>nums1[i+1]){
                    int temp = nums1[i];
                    nums1[i]=nums1[i+1];
                    nums1[i+1]=temp;
                    sumbit ++;
                }
                
            }
            if(sumbit==0){
                break;
            }
        }
        
    }
}