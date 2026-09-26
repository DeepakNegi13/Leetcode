class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        int count1 = 0;
        int elem1 = Integer.MAX_VALUE;
        int count2 = 0;
        int elem2 = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(count1==0 && (arr[i]!=elem2)){
                count1++;
                elem1 = arr[i];
            }
            else if(count2 ==0 && (arr[i] != elem1)) {
                count2++;
                elem2 = arr[i];
            }
            else if(arr[i]==elem1) count1++;
            else if(arr[i]==elem2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==elem1) count1++;
            if(arr[i]==elem2) count2++;
            
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if(count1>n/3) ans.add(elem1);
        if(count2>n/3) ans.add(elem2);
        return ans;
        
    }
}