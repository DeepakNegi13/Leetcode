class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> li = new ArrayList<>();
        double nums = 1;
        for(int i = 0;i<row;i++){
            li.add((int)nums);
            nums = nums*(row-i);
            nums = nums/(i+1);

        }
        li.add(1);
        return li;
    }
}