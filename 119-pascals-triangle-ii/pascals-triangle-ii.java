class Solution {
    public List<Integer> getRow(int rowIndex) {
               List<List<Integer>> sc = new  ArrayList<>();
        int sum = 0;
        for(int i = 0;i<=rowIndex;i++){
            sc.add(new ArrayList());
            for(int j = 0;j<=i;j++){
                if(j==0||j==i){
                    sc.get(i).add(1);
                }else if(i!=0&&j!=0){
                    sum = sc.get(i-1).get(j-1)+sc.get(i-1).get(j);
                    sc.get(i).add(sum);
                }
            }
        }
        return sc.get(rowIndex);
    }
}