class Solution {
  
    int nCr(int n , int r){
        int ans = 1;
        for(int i = 0;i<r;i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sc = new  ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                ans.add(nCr(i,j));
            }
            sc.add(ans);
        }
        return sc;
        
    }
}